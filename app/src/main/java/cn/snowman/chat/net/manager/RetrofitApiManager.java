package cn.snowman.chat.net.manager;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import cn.snowman.chat.common.constant.Constant;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.OkHttpClient;

/**
 * @author guanghe-code
 * @date on 2018-1-16
 * @describe 网络请求管理类
 */
public class RetrofitApiManager {


    private static Retrofit retrofit;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(60, TimeUnit.SECONDS);
            builder.readTimeout(60, TimeUnit.SECONDS);
            builder.writeTimeout(60, TimeUnit.SECONDS);
            builder.retryOnConnectionFailure(true);
            retrofit = new Retrofit.Builder().baseUrl(Constant.BASE_URL).
                    addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
                    addConverterFactory(GsonConverterFactory.create()).
                    client(builder.build()).build();
        }
        return retrofit;
    }
}
