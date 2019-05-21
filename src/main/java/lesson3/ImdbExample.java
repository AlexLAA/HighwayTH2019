package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by lolik on 01.04.2019
 */
public class ImdbExample {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){
        driver.get("http://www.imdb.com/chart/top");
        // TITLES
        List<WebElement> titles = driver.findElements(By.xpath("//*[@class='titleColumn']//a"));
        for(WebElement element : titles){
            System.out.println(element.getText());
        }
        //HREFS
        List<WebElement> hrefs = driver.findElements(By.xpath("//*[@class='titleColumn']//a"));
        for(WebElement element : hrefs){
            System.out.println(element.getAttribute("href"));
        }
        //RATING
        List<WebElement> ratings = driver.findElements(By.xpath("//*[@class='ratingColumn imdbRating']/strong"));
        for(WebElement element : ratings){
            System.out.println(element.getText());
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
