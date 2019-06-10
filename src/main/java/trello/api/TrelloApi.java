package trello.api;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by lolik on 04.06.2019
 */
public class TrelloApi {

    public static final String KEY = "8f0347d54812e3cb5acac34fd76fc70d";
    public static final String TOKEN = "c3adec871babcea8f22d8a0de807eb7e7ced6d15122850a4e7efee197f77150f";

    OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).build();


    public void getBoardLists(String boardId) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.trello.com/1/boards/"+boardId+"/lists?cards=all&fields=all&key="+KEY+"&token="+TOKEN)
                .build();
        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }

    public void createCard(String listId) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"name\":\"JACK SPARROW\"}");
        Request request = new Request.Builder()
                .url("https://api.trello.com/1/cards?idList="+listId+"&keepFromSource=all&key="+KEY+"&token="+TOKEN)
                .post(body)
                .build();
        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }




}
