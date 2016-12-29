package pages;

import org.openqa.selenium.WebDriver;
import web.BaseWebMobileElement;

public class Pages extends BaseWebMobileElement{
    public WebDriver driver;

    public Pages(WebDriver driver, int timeOut) {
        super(driver, timeOut);
        this.driver = driver;
    }
}
