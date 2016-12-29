package steps;

import org.openqa.selenium.WebDriver;
import pages.FddPage;
import pages.LoginPage;
import pages.WidgetPage;
import util.driver.WebDriverFactory;

public class BaseSteps {
    static WebDriver driver;
    static WidgetPage widgetPage;
    static LoginPage loginPage;
    static FddPage fddPage;
    WebDriverFactory driverFactory;

    void initPage(){
        driver.manage().window().maximize();
        widgetPage = new WidgetPage(driver);
        loginPage = new LoginPage(driver);
        fddPage = new FddPage(driver);
    }
}
