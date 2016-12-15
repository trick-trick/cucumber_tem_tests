package pages;

import org.openqa.selenium.WebDriver;
import web.BaseWebMobileElement;

public class Pages extends BaseWebMobileElement{
    public Pages(WebDriver driver, int timeOut) {
        super(driver, timeOut);
    }
    public static WebDriver driver;
    public static FddPage fddPage = new FddPage(driver);
    public static LoginPage loginPage = new LoginPage(driver);
    public static WidgetPage widgetPage = new WidgetPage(driver);

}
