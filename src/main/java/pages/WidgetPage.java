package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WidgetPage extends Pages {
    public WidgetPage(WebDriver driver) {
        super(driver, 30);
    }

    public WebElement menuBar() {
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("menu")));
    }
    public WebElement confWidgetIcon(){
        return getWebElement(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]/div/div[1]/img")));
    }
    public WebElement widgetFrame(){
        return getWebElement(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[4]")));
    }
    public WebElement widgetBaseFrame(){
        return getWebElement((By) ExpectedConditions.frameToBeAvailableAndSwitchToIt("LandinBaseFrame"));
    }
}