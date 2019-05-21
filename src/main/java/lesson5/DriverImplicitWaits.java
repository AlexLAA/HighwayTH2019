package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by lolik on 09.04.2019
 */
public class DriverImplicitWaits extends BrowserFactory {

    @Test
    public void pageLoadWait(){
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @Test
    public void elementWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.imdb.com/chart/top");
        String text = driver.findElement(By.cssSelector(".article .header")).getText();
        System.out.println(text);
    }

}
