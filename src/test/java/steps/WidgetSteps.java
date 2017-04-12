package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.validator.ResponsiveUIValidator;

public class WidgetSteps extends BaseSteps{
    ResponsiveUIValidator uiValidator = new ResponsiveUIValidator(driver);
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @Then("^'Set Up' link in 'Left Menu bar' and 'My Account' link is out of 'Left Menu bar'$")
    public void set_Up_link_in_Left_Menu_bar_and_My_Account_link_is_out_of_Left_Menu_bar(){
        boolean inMenu = uiValidator.init().findElement(widgetPage.setUpLink(), "Set Up link inside of")
                .insideOf(widgetPage.menuBar(), "Left Menu Bar").drawMap().validate();
        boolean outOfMenu = uiValidator.init().findElement(widgetPage.myAccountLink(), "My Account link out of")
                .insideOf(widgetPage.menuBar(), "Left Menu Bar").drawMap().validate();
        Assert.assertTrue(inMenu);
        Assert.assertTrue(outOfMenu);
        uiValidator.generateReport();
    }

    @When("^user navigates to Manage Assets page '(.+)'$")
    public void user_navigates_to_Manage_Assets_page_http_manage_assets(String url){
        driver.get(url);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(widgetPage.assetFrame()));
    }

    @When("^Manage Assets page are visible$")
    public void manage_Assets_page_are_visible() {
        Assert.assertTrue(widgetPage.updateButton().isDisplayed());
    }

    @Then("^Compare right offset for 'Update' button and 'Display Name' field$")
    public void compare_right_offset_for_Update_button_and_Display_Name_field() {
        boolean rightOffset = uiValidator.init().findElement(widgetPage.displayNameField(), "Display name")
                .sameOffsetRightAs(widgetPage.updateButton(), "update button").drawMap().validate();
        Assert.assertTrue(rightOffset);
        uiValidator.generateReport();
        driver.switchTo().defaultContent();
    }

    @When("^user navigates to Policy Manager page '(.+)'$")
    public void user_navigates_to_Policy_Manager_page_http_PolicyManager_in_status_loadMainPage(String url) {
        driver.get(url);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(widgetPage.leftFrame()));
    }

    @When("^Policy Manager page are visible$")
    public void policy_Manager_page_are_visible()  {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(widgetPage.tableFrame()));
        Assert.assertTrue(widgetPage.addLink().isDisplayed());
    }


    @Then("^Check 'Add' link have valid left/right Offsets$")
    public void check_Control_Strategies_and_Add_link_have_valid_left_right_Offsets()  {
        boolean rightTableOffset = uiValidator.init().findElement(widgetPage.addLink(), "Add link")
                .sameOffsetRightAs(widgetPage.activityTable(), "in the same right offset as activity table").drawMap().validate();
        Assert.assertTrue(rightTableOffset);
        uiValidator.generateReport();
    }

    @Then("^Check 'Control Strategies' and 'Recent Activities' tables on the top offset$")
    public void check_Control_Strategies_and_Recent_Activities_tables_on_the_top_offset()  {
        boolean tables = uiValidator.init().findElement(widgetPage.strategyTable(), "Strategies Table")
                .sameOffsetTopAs(widgetPage.activityTable(), "Activities table").drawMap().validate();
        Assert.assertTrue(tables);
        uiValidator.generateReport();
    }

    @Then("^Check Policy Dashboard title has font-size '(.+)'$")
    public void check_Policy_Dashboard_title_has_font_size(String size)  {
        boolean font = uiValidator.init().findElement(widgetPage.dashboardTitle(), "Font size")
                .withCssValue("font-size", size).drawMap().validate();
        uiValidator.generateReport();
        Assert.assertTrue(font);
    }

}
