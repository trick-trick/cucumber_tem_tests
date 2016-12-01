package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.BaseWebMobileElement;

public class FddPage extends BaseWebMobileElement {
    public FddPage(WebDriver driver) {
        super(driver, 30);
    }

    public WebElement csvExport(){
        return getWebElement(By.xpath(".//*[@id='fdd-report-portfolio-page']//img"));
    }
}
