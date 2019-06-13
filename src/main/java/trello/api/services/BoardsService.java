package trello.api.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;
import trello.api.models.Board;
import trello.api.models.TrelloList;

import java.util.List;

/**
 * Created by lolik on 13.06.2019
 */
public interface BoardsService {


    @GET("boards/{id}/lists")
    Call<List<TrelloList>> getLists(@Path("id")String id);


    @POST("boards")
    Call<Board> createBoard(@Query("name") String name);

    @DELETE("boards/{id}")
    Call<ResponseBody> deleteBoard(@Path("id")String id);

    @PUT("boards/{id}")
    Call<Board> updateBoard(@Path("id")String id, @Body Board board);



}
