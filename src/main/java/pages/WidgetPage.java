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
}