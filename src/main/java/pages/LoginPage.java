package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.BaseWebMobileElement;

public class LoginPage extends BaseWebMobileElement {
    public LoginPage(WebDriver driver) {
        super(driver, 30);
    }

    public WebElement usernameField() {
        return getWebElement(By.xpath(".//*[@id='ng-main-app']//div[1]/input"));
    }

    public WebElement passwordField() {
        return getWebElement(By.xpath(".//*[@id='ng-main-app']//div[2]/input"));
    }

    public WebElement loginButton() {
        return getWebElement(By.xpath(".//*[@id='ng-main-app']//button"));
    }
}