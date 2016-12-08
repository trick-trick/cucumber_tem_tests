package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.FddPage;
import pages.LoginPage;
import pages.WidgetPage;
import util.driver.WebDriverFactory;

import java.util.Random;

public class StepsImplementation {
    public static WebDriver driver;
//    FddPage fddPage = new FddPage(driver);
//    WidgetPage widgetPage = new WidgetPage(driver);
//    LoginPage loginPage = new LoginPage(driver);

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

    @And("^user login using the Username as '(.+)' and the Password as '(.+)'$")
    public void user_login_using_the_Username_as_user_and_the_Password_as_password(String user, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.usernameField().sendKeys(user);
        loginPage.passwordField().sendKeys(password);
        loginPage.loginButton().click();
    }

    @And("^widget page is open$")
    public void widget_page_is_open(){
        WidgetPage widgetPage = new WidgetPage(driver);
        Assert.assertTrue(widgetPage.menuBar().isDisplayed());
    }

    @And("^user navigates to new FDD report page '(.+)'$")
    public void user_navigates_to_new_FDD_report_page_http_fdd_report(String url){
        driver.get(url);
    }

    @Then("^base FDD elements are visible$")
    public void base_FDD_elements_are_visible(){
        FddPage fddPage = new FddPage(driver);
        Assert.assertTrue(fddPage.exportCsv().isDisplayed());
    }

    @Then("driver needs to be closed$")
    public void close_driver(){
        if (driver != null){
            driver.quit();
        }
    }

    @When("^open first FDD fault$")
    public void open_first_FDD_fault() {
        FddPage fddPage = new FddPage(driver);
        fddPage.faultList().get(0).click();
        Assert.assertTrue(fddPage.exportPdf().isDisplayed());
    }

    @Then("^fault page is opened for less than (\\d+) seconds$")
    public void fault_page_is_opened_for_less_than_seconds(int sec) {
        final JavascriptExecutor js = (JavascriptExecutor) driver;
        double loadTime = (Double) js.executeScript("return (window.performance.timing.loadEventEnd - (window.performance.timing.navigationStart) / 1000)");
        Assert.assertTrue("Fault page was opened for "+ loadTime + " seconds", loadTime > sec);
    }

    @When("^click on CSV export button$")
    public void click_on_CSV_export_button() {
    }

    @Then("^EcmDetails\\.xls file download popup is opened$")
    public void ecmdetails_xls_file_download_popup_is_opened() {
    }

    @When("^change fault state$")
    public void change_fault_state() {
        Random random = new Random();
        FddPage fddPage = new FddPage(driver);
        fddPage.firstButton().click();
        fddPage.stateList().get(random.nextInt(((fddPage.stateList().size()-1)) + 1)).click();
    }

    @Then("^state should be changed immediately$")
    public void state_should_be_changed_immediately() {
    }

    @When("^select first fault item and open details tab$")
    public void select_first_fault_item_and_open_details_tab() {
    }

    @Then("^highcharts legend section is not shifted down$")
    public void highcharts_legend_section_is_not_shifted_down() {
    }

    @When("^Add 'long text' comment in Comments$")
    public void add_long_text_comment_in_Comments() {
    }

    @Then("^Comments properties contained in proper columns$")
    public void comments_properties_contained_in_proper_columns() {
    }

    @When("^User change the state$")
    public void user_change_the_state() {
    }

    @Then("^'hostname' column contains real IP address instead of '(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)'$")
    public void hostname_column_contains_real_IP_address_instead_of(int arg1, int arg2, int arg3, int arg4) {
    }

    @When("^User create new comment$")
    public void user_create_new_comment() {
    }

    @Then("^Current date is set in popup when comment has been submitted$")
    public void current_date_is_set_in_popup_when_comment_has_been_submitted() {
    }

    @Given("^'State since' value for the first fault$")
    public void state_since_value_for_the_first_fault() {
    }

    @When("^change the first fault state$")
    public void change_the_first_fault_state() {
    }

    @Then("^compare 'State since' value was changed$")
    public void compare_State_since_value_was_changed() {
    }

    @When("^user opens state drop-down$")
    public void user_opens_state_drop_down() {
    }

    @Then("^'change state' drop-down frame is on the screen after opening$")
    public void change_state_drop_down_frame_is_on_the_screen_after_opening() {
    }

    @Given("^specified 'long' (\\d+) symbols string$")
    public void specified_long_symbols_string(int arg1) {
    }

    @When("^user submit comment with 'long' string$")
    public void user_submit_comment_with_long_string() {
    }

    @Then("^correct error message is raised like 'Comment should be less than (\\d+) Character' and comment has not been added$")
    public void correct_error_message_is_raised_like_Comment_should_be_less_than_Character_and_comment_has_not_been_added(int arg1) {
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
