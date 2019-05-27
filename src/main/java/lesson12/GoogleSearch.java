package lesson12;

import static core.BrowserFactory.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lolik on 23.05.2019
 */
public class GoogleSearch implements SearchForm {


    @Override
    public List<String> search(String text) {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(text);
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("/search"));
        List<String> result = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".g h3"));
        for(WebElement element : elements){
            result.add(element.getText());
        }
        return result;
    }
}
