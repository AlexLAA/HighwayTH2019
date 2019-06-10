package trello.api;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by lolik on 04.06.2019
 */
public class TrelloApiTest {


    @Test
    public void tryIt() throws IOException {
        TrelloApi trelloApi = new TrelloApi();
        trelloApi.getBoardLists("0L69AHpE");
        trelloApi.createCard("5cf68f1edc408603895ce5f0");

    }
}
