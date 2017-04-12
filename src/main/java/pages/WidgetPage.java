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
    public WebElement leftFrame(){
        return getWebElement(ExpectedConditions.elementToBeClickable(By.id("LeftFrame")));
    }
    public WebElement tableFrame(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("tableFrame")));
    }
    public WebElement assetFrame(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("assetRight")));
    }
    public WebElement myAccountLink(){
        return getWebElement(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[2]/ul/li[1]/a")));
    }
    public WebElement setUpLink(){
        return getWebElement(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/li[7]")));
    }
    public WebElement updateButton(){
        return getWebElement(ExpectedConditions.elementToBeClickable(By.id("formbutton")));
    }
    public WebElement displayNameField(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("navigation")));
    }

    public WebElement addLink(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"addLink\"]/a")));
    }

    public WebElement strategyTable(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("StrategyTable")));
    }

    public WebElement activityTable(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("ActivityTable")));
    }

    public WebElement dashboardTitle(){
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(By.id("label")));
    }

}