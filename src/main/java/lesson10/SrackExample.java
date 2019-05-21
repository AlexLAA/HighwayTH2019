package lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Created by lolik on 16.05.2019
 */
public class SrackExample {


    public static void main(String[] args) throws IOException {
        divideByZero(3);

        WebDriver driver = new ChromeDriver();
        WebElement element = driver.findElement(By.cssSelector(".asdasd"));
        element.click();
    }
    public static void divideByZero(int number) {
        System.out.println(number/0);
    }



}
