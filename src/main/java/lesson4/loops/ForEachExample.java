package lesson4.loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by lolik on 04.04.2019
 */
public class ForEachExample {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://unian.net");
        List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
        for(WebElement link : links){
            String href = link.getAttribute("href");
            String text = link.getText();
            System.out.println("TEXT: '"+text+"' LINK: "+href);
        }
        driver.quit();
    }

}
