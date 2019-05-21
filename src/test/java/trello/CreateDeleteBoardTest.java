package trello;

import core.BrowserFactory;
import org.testng.annotations.Test;

/**
 * Created by lolik on 21.05.2019
 */
public class CreateDeleteBoardTest extends BrowserFactory {


    @Test
    public void createBoard() throws InterruptedException {
        Pages pages = new Pages();
        pages.boardsPage.createBoard("Jack Board");


    }

    @Test
    public void deleteBoard(){

    }

}
