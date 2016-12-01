package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import pages.FddPage;
import pages.LoginPage;
import pages.WidgetPage;
import util.driver.WebDriverFactory;

public class StepsImplementation{
    public static WebDriver driver;

    @Given("^new instance of Selenium WebDriver$")
    public void new_instance_of_Selenium_WebDriver(){
        WebDriverFactory driverFactory = new WebDriverFactory();
        driver = driverFactory.getDriver();

        driver.manage().window().maximize();
    }

    @When("^user navigates to '(.+)'$")
    public void user_navigates_to_http(String url){
        driver.get(url);
    }

    @When("^user login using the Username as '(.+)' and the Password as '(.+)'$")
    public void user_login_using_the_Username_as_user_and_the_Password_as_password(String user, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameField().sendKeys(user);
        loginPage.passwordField().sendKeys(password);
        loginPage.loginButton().click();
    }

    @Then("^widget page is open$")
    public void widget_page_is_open(){
        WidgetPage widgetPage = new WidgetPage(driver);
        Assert.assertTrue(widgetPage.menuBar().isDisplayed());
    }

    @When("^user navigates to new FDD report page '(.+)'$")
    public void user_navigates_to_new_FDD_report_page_http_fdd_report(String url){
        driver.get(url);
    }

    @Then("^base FDD elements are visible$")
    public void base_elements_are_visible(){
        FddPage fddPage = new FddPage(driver);
        Assert.assertTrue(fddPage.csvExport().isDisplayed());
    }

    @Then("driver needs to be closed$")
    public void close_driver(){
        if (driver != null){
            driver.quit();
        }
    }

    @After
    public void embedScreenshotOnFail(Scenario s) {
        if (s.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                s.embed(screenshot, "image/png");
                s.write("URL at failure: " + driver.getCurrentUrl());
            } catch (WebDriverException wde) {
                s.write("Embed Failed " + wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }
}
