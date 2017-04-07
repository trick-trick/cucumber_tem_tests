package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import util.validator.ResponsiveUIValidator;

public class WidgetSteps extends BaseSteps{
    ResponsiveUIValidator uiValidator = new ResponsiveUIValidator(driver);


    @Then("^configuration widget icon inside widget frame$")
    public void configuration_widget_icon_inside_widget_frame(){

        driver.switchTo().frame(widgetPage.widgetBaseFrame());
        boolean result = uiValidator.init().findElement(widgetPage.confWidgetIcon(), "Conf icon").insideOf(widgetPage.widgetFrame(), "Widget frame").drawMap().validate();
        uiValidator.generateReport();
        Assert.assertTrue(result);
    }


}
