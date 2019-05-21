package trello.pages;

import static core.BrowserFactory.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by lolik on 21.05.2019
 */
public class BoardsPage {



    private By createNewBoardBtn = By.cssSelector(".mod-add");
    private By boardTitleFld = By.cssSelector(".subtle-input");
    private By createBoardBtn = By.cssSelector(".primary");



    public boolean isOpened(){
        return !driver.findElements(createNewBoardBtn).isEmpty();
    }

    public void createBoard(String name){
        driver.findElement(createNewBoardBtn).click();
        driver.findElement(boardTitleFld).clear();
        driver.findElement(boardTitleFld).sendKeys(name);
        driver.findElement(createBoardBtn).click();
    }


}
