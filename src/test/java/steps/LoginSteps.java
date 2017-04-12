package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import util.driver.WebDriverFactory;

public class LoginSteps extends BaseSteps{

    @Given("^new instance of Selenium WebDriver$")
    public void new_instance_of_Selenium_WebDriver() {
        driverFactory = new WebDriverFactory();
        driver = driverFactory.getDriver();
    }

    @When("^user navigates to '(.+)'$")
    public void user_navigates_to_http(String url) {
        initPage();
        driver.get(url);
    }

    @And("^user login using the Username as '(.+)' and the Password as '(.+)'$")
    public void user_login_using_the_Username_as_user_and_the_Password_as_password(String user, String password) {
        initPage();
        loginPage.usernameField().sendKeys(user);
        loginPage.passwordField().sendKeys(password);
        loginPage.loginButton().click();
    }

    @And("^widget page is open$")
    public void widget_page_is_open() {
        Assert.assertTrue(widgetPage.menuBar().isDisplayed());
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