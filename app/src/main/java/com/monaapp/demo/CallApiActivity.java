package com.monaapp.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.monaapp.demo.api.ApiService;
import com.monaapp.demo.api.ApiServiceInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallApiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_api);
        try {
            /*Create handle for the RetrofitInstance interface*/
            ApiServiceInterface service = ApiService.getRetrofitInstance().create(ApiServiceInterface.class);

            JSONObject dataRequest = new JSONObject();
            dataRequest.put("notificationAccountId", 52);
            Call<JSONObject> getNotification = service.getNotification(dataRequest);
            getNotification.enqueue(new Callback<JSONObject>() {

                @Override
                public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                    String body = response.body().toString();
                }

                @Override
                public void onFailure(Call<JSONObject> call, Throwable t) {

                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
