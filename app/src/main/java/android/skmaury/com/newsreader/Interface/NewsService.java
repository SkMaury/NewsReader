package android.skmaury.com.newsreader.Interface;

import android.skmaury.com.newsreader.Common.Common;
import android.skmaury.com.newsreader.Model.News;
import android.skmaury.com.newsreader.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kurosaki on 01/03/18.
 */

public interface NewsService {
    @GET("v2/sources?language=en&apiKey=" + Common.API_KEY)
    Call<WebSite> getSource();

    @GET
    Call<News> getNewestArticles(@Url String url);

}
