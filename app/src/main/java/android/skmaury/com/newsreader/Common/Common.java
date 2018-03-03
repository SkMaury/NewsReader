package android.skmaury.com.newsreader.Common;

import android.skmaury.com.newsreader.Interface.NewsService;
import android.skmaury.com.newsreader.Remote.RetrofitClient;

/**
 * Created by kurosaki on 01/03/18.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";

    public static final String API_KEY = "1e68ae77b43240729e21f85a30e7d2b9";

    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static String getAPIUrl(String source, String sortBy, String apiKey){
        StringBuilder apiUrl = new StringBuilder(BASE_URL + "v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&sortBy=")
                .append(sortBy)
                .append("&apiKey=")
                .append(apiKey)
                .toString();
    }
}
