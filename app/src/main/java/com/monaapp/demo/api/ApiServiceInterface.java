package com.monaapp.demo.api;

import com.google.gson.JsonElement;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiServiceInterface {
    @POST("/notification-legacy-gateway/notification_account/get")
    Call<JsonElement> getNotification(@Body Map<String,Object> notification);

    @POST("home/page={page}")
    Call<JSONObject>Home( @Path("page") long page,@Query("device_id") String deviceID, @Query("movie_status") String movieStatus);

}
