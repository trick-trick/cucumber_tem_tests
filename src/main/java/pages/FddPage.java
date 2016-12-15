package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FddPage extends Pages {
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

    public WebElement commentsTab(){
        return getWebElement((By.xpath(".//*[@id='fdd-report-detail-page']//div[3]//li[3]")));
    }

    public WebElement commentsButton(){
        return getWebElement((By.xpath(".//*[@id='fdd-report-detail-page']//div[2]/button")));
    }

    public WebElement commentsForm(){
        return getWebElement((By.xpath(".//*[@id='ui-id-7']//textarea")));
    }

    public WebElement saveCommentButton(){
        return getWebElement((By.xpath(".//*[@id='ui-id-1']//button[1]")));
    }

    public WebElement cancelCommentButton(){
        return getWebElement((By.xpath(".//*[@id='ui-id-1']//button[2]")));
    }

    public WebElement publisherField(){
        return getWebElement((By.xpath(".//*[@id='ui-id-1']//button[2]")));
    }

    public WebElement publicDateField(){
        return getWebElement((By.xpath(".//*[@id='ui-id-1']//button[2]")));
    }

    public WebElement savedSuccessField(){
        return getWebElement((By.xpath(".//*[@id='ui-id-1']//button[2]")));
    }

}
