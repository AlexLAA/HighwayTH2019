package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static core.BrowserFactory.driver;

/**
 * Created by lolik on 23.05.2019
 */
public class BingSearch implements SearchForm {


    @Override
    public List<String> search(String text) {
        driver.get("https://www.bing.com/");
        driver.findElement(By.cssSelector("#sb_form_q")).clear();
        driver.findElement(By.cssSelector("#sb_form_q")).sendKeys(text);
        driver.findElement(By.cssSelector("#sb_form_q")).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("/search"));
        List<String> result = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".b_algo h2"));
        for(WebElement element : elements){
            result.add(element.getText());
        }
        return result;
    }
}
