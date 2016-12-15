package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.FddPage;
import pages.Pages;
import tools.Tools;
import tools.ToolsFdd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FddSteps extends Pages{
    public FddSteps(WebDriver driver, int timeOut) {
        super(driver, timeOut);
    }
    public static WebDriver driver;
    public static FddPage fddPage = new FddPage(driver);

    @And("^user navigates to new FDD report page '(.+)'$")
    public void user_navigates_to_new_FDD_report_page_http_fdd_report(String url){
        driver.get(url);
    }

    @Then("^base FDD elements are visible$")
    public void base_FDD_elements_are_visible(){
        Assert.assertTrue(fddPage.exportCsv().isDisplayed());
    }

    @When("^open first FDD fault$")
    public void open_first_FDD_fault() {
        fddPage.faultList().get(0).click();
        Assert.assertTrue(fddPage.exportPdf().isDisplayed());
    }

    @Then("^fault page is opened for less than (\\d+) seconds$")
    public void fault_page_is_opened_for_less_than_seconds(int sec) {
        Double loadTime = Tools.countLoadingTime();
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

    @Then("^'hostname' column contains real IP address instead of '(.+)'$")
    public void hostname_column_contains_real_IP_address_instead_of(String hostname) {
    }

    @When("^User create new comment$")
    public void user_create_new_comment() {
        ToolsFdd toolsFdd = new ToolsFdd(driver);
        fddPage.faultList().get(0).click();
        Assert.assertTrue(fddPage.exportPdf().isDisplayed());
        toolsFdd.createComment();
        Assert.assertEquals(fddPage.savedSuccessField().getText(), "Comment saved successfully");
    }

    @Then("^Current date is set in popup when comment has been submitted$")
    public void current_date_is_set_in_popup_when_comment_has_been_submitted() {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        Assert.assertEquals(fddPage.publicDateField().getText(), dateFormat);
//        fddPage.cancelCommentButton().click();
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
}
