package com.monaapp.demo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
//        if (retrofit == null) {
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl("http://10.210.212.10:8080/notification-legacy-gateway/")
//                    .build();
////        }


        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.210.212.10:8080/notification-legacy-gateway/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

