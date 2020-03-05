package com.monaapp.demo.api;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServiceInterface {
    @POST("notification_account/get")
    Call<JSONObject> getNotification(@Body JSONObject notification);
}
