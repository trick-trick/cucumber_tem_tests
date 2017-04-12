package tools;


import org.openqa.selenium.*;

public class ToolsWidgets extends Tools{

    public ToolsWidgets(WebDriver driver) {
        super(driver);
    }

    public void toDefault() {
        try{
            driver.switchTo().defaultContent();
        }catch (UnhandledAlertException e){
        }
    }

    public void toLeftFrame() {
        toDefault();
        try{
            driver.switchTo().frame(driver.findElement(By.id("LeftFrame")));
        }catch (UnhandledAlertException e){
        }
    }

    public void toLandinBaseFrame() {
        toLeftFrame();
        try{
            driver.switchTo().frame(driver.findElement(By.id("LandinBaseFrame")));
        }catch (NoSuchElementException e){
        }
    }

}