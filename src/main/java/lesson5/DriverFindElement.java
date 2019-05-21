package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by lolik on 09.04.2019
 */
public class DriverFindElement extends BrowserFactory {

    @Test
    public void tryFindElement(){
        driver.get("https://www.imdb.com/chart/top");
        driver.findElement(By.xpath("//noSuchElement")); // NoSuchElementException
    }

    @Test
    public void tryFindElements(){
        driver.get("https://www.imdb.com/chart/top");
        List<WebElement> elements = driver.findElements(By.xpath("//noSuchElement")); // EMPTY LIST
        int size = elements.size();
        System.out.println("FOUND ELEMENTS: "+size);
    }



}
