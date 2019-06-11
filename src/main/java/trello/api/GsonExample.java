package trello.api;

import com.google.gson.Gson;
import org.testng.annotations.Test;
import trello.api.models.Card;


/**
 * Created by lolik on 2/19/18.
 */
public class GsonExample {


    String cardJson = " {\n" +
            "        \"id\": \"5a8aaf5b8bc73165a15f071f\",\n" +
            "        \"desc\": \"Some Card Description\",\n" +
            "        \"idBoard\": \"5a8aaf518e5ac8fff8dd5f67\",\n" +
            "        \"idList\": \"5a8aaf5838440fc96023077d\",\n" +
            "        \"name\": \"Jack\",\n" +
            "        \"url\": \"https://trello.com/c/Q48O9oWn/1-jack\"\n" +
            "    }\n";

    @Test
    public void javaToJson(){
        Gson gson = new Gson();

        Card card = new Card();
        card.name = "New Card1";
        card.desc = "SOME DESCRIPTION";
        String json = gson.toJson(card);
        System.out.println(json);
    }



    @Test
    public void jsonToJava(){
        Gson gson = new Gson();
        Card card = gson.fromJson(cardJson, Card.class);

        System.out.println(card.name);
       // System.out.println(card);
    }
}
