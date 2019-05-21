package lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by lolik on 04.04.2019
 */
public class Akinator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://ru.akinator.com");
        driver.findElement(By.cssSelector("[href='/game']")).click();
        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);
        int choice;
        int choice1;
        int choice2;
        boolean present;

        do {
            try {
                driver.findElement(By.cssSelector(".question-number"));
                present = true;
            } catch (NoSuchElementException e) {
                present = false;
            }
            if (present) {
                Thread.sleep(2000);
                System.out.println("Номер вопроса " + driver.findElement(By.cssSelector(".question-number")).getText());
                System.out.println(driver.findElement(By.cssSelector(".question-text")).getText());

                System.out.println("1 - " + driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(1) a")).getText());
                System.out.println("2 - " + driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(2) a")).getText());
                System.out.println("3 - " + driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(3) a")).getText());
                System.out.println("4 - " + driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(4) a")).getText());
                System.out.println("5 - " + driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(5) a")).getText());
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(1) a")).click();
                        break;
                    case 2:
                        driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(2) a")).click();
                        break;
                    case 3:
                        driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(3) a")).click();
                        break;
                    case 4:
                        driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(4) a")).click();
                        break;
                    case 5:
                        driver.findElement(By.cssSelector(".database-selection ul > li:nth-child(5) a")).click();
                        break;
                }
            } else {
                System.out.println(driver.findElement(By.xpath("//div[@id='infos-perso-title']/p")).getText());
                System.out.println(driver.findElement(By.xpath("//div[@id='infos-perso-title']/h2[@id='perso']")).getText());
                System.out.println(driver.findElement(By.xpath("//div[@id='infos-perso-content']/p[@id='description']")).getText());
                System.out.println("Угадал?\n1-Да\n2-Нет");
                choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    driver.findElement(By.xpath("//a[@id='yesLink']")).click();
                    System.out.println(driver.findElement(By.xpath("//div[@id='bulle-inner']")).getText());
                    System.out.println("Конец игры");
                } else {
                    driver.findElement(By.xpath("//a[@id='noLink']")).click();
                    System.out.println(driver.findElement(By.xpath("//h2[@id='perso']")).getText());
                    System.out.println("1-Да\n2-Нет");
                    choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        driver.findElement(By.xpath("//a[@id='yesLink']")).click();
                        System.out.println(driver.findElement(By.xpath("//div[@id='bulle-inner']")).getText());
                    } else {
                        System.out.println("Конец игры");
                    }
                }

            }
        } while (true);


        // driver.quit();
    }
}
