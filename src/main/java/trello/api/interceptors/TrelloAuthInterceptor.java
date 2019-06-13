package trello.api.interceptors;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by lolik on 03.02.17.
 */
public class TrelloAuthInterceptor implements Interceptor {


    private static final String KEY = "8f0347d54812e3cb5acac34fd76fc70d";
    private static final String TOKEN = "c3adec871babcea8f22d8a0de807eb7e7ced6d15122850a4e7efee197f77150f";


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("key", KEY)
                .addQueryParameter("token", TOKEN)
                .build();

        // Request customization: add request headers
        Request.Builder requestBuilder = original.newBuilder()
                .url(url);

        Request request = requestBuilder.build();
        return chain.proceed(request);
    }


}
