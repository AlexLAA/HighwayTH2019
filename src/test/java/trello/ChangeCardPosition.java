package trello;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by lolik on 21.05.2019
 */
public class ChangeCardPosition extends BrowserFactory {



    @Test
    public void moveCardToAnotherList() throws InterruptedException {
        driver.get("https://trello.com/b/UWcqx87C/jacksparrowtitle");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.cssSelector("[href*='2-card-2']")), driver.findElement(By.cssSelector(".js-list:nth-child(3)"))).perform();
       // Thread.sleep(10000);
    }


}
