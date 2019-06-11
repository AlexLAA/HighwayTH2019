package trello.api;

import org.testng.annotations.Test;
import trello.api.models.Card;
import trello.api.models.TrelloList;

import java.io.IOException;
import java.util.List;

/**
 * Created by lolik on 04.06.2019
 */
public class TrelloApiTest {


    @Test
    public void tryIt() throws IOException {
        TrelloApi trelloApi = new TrelloApi();
        List<TrelloList> boardLists = trelloApi.getBoardLists("0L69AHpE");





        for (TrelloList list : boardLists) {
            Card card = new Card();
            card.name = "Card: "+list.name;
            card.desc = "Aswome Card";
            trelloApi.createCard(list.id, card);
            TrelloList list1 = new TrelloList();
            list1.name = "JAKSDASD";

            trelloApi.createList(list.idBoard, list1);
        }
    }


    @Test
    public void testRequestPost() throws IOException {
        TrelloApi trelloApi = new TrelloApi();
        String response = trelloApi.post("https://httpbin.org/post", "{\"param\":\"jack\"}");
        System.out.println(response);
    }
}
