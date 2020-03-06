package com.monaapp.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonElement;
import com.monaapp.demo.api.ApiService;
import com.monaapp.demo.api.ApiServiceInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallApiActivity extends AppCompatActivity {
    private TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_api);

        tvResponse = (TextView) findViewById(R.id.tv_response);

        Log.d("TAG", "onCreate: ");
        /*Create handle for the RetrofitInstance interface*/
        ApiServiceInterface service = ApiService.getRetrofitInstance().create(ApiServiceInterface.class);

        HashMap<String,Object> dataRequest = new HashMap<>();
        dataRequest.put("notificationAccountId", 52);

       // Call<JSONObject> getNotification = service.Home(1,"Device::3456::789","AllMovie");
        Call<JsonElement> getNotification = service.getNotification(dataRequest);
        getNotification.enqueue(new Callback<JsonElement>() {

            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                //String body = response;
                Log.d("TAG", "onResponse: "+response.body().toString());
                tvResponse.setText(response.body().toString());

            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.d("TAG", "onFailure: ");
            }
        });

    }
}
