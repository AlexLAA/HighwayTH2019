package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by lolik on 26.03.2019
 */
public class GoogleSearchHelloWorld {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/lolik/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello, World!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".g h3")).click();
        System.out.println("TITLE: "+driver.getTitle());
        driver.quit();
    }


}
