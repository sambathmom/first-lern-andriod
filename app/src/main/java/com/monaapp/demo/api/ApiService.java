package com.monaapp.demo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;


public class ApiService {
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
//        if (retrofit == null) {
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl("http://10.210.212.10:8080/notification-legacy-gateway/")
//                    .build();
////        }


        String baseUrl = "http://10.210.212.10:8080";
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
        }
        return retrofit;
    }
}

