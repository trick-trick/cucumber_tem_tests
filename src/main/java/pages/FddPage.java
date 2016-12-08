package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.BaseWebMobileElement;

import java.util.List;

public class FddPage extends BaseWebMobileElement {
    public FddPage(WebDriver driver) {
        super(driver, 30);
    }

    public WebElement exportCsv(){
        return getWebElement(By.xpath(".//*[@id='fdd-report-portfolio-page']//img"));
    }

    public List<WebElement> faultList(){
        return getWebElements(By.xpath(".//*[@id='fdd-report-portfolio-page']//tbody"));
    }

    public WebElement exportPdf(){
        return getWebElement(By.xpath(".//*[@id='fdd-report-detail-page']//a/img"));
    }

    public List<WebElement> stateList(){return getWebElements(By.xpath(".//*[@id='state-window-2098-1']/ul/li"));}

    public WebElement firstButton(){
        return getWebElement(By.xpath(".//*[@id='fdd-report-portfolio-page']//tr[1]//button"));
    }

    public WebElement stateRejected(){
        return getWebElement(By.xpath(".//*[@id='state-window-2098-1']/ul/li[5]/i"));
    }

}
