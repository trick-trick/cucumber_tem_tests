package tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Tools{
    public static WebDriver driver;

    public Tools(WebDriver driver) {

    }

    public static Double countLoadingTime(){
        final JavascriptExecutor js = (JavascriptExecutor) driver;
        double loadTime = (Double) js.executeScript("return (window.performance.timing.loadEventEnd - (window.performance.timing.navigationStart) / 1000)");
        return loadTime;
    }
}