package com.monaapp.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView tvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvUserName = (TextView) findViewById(R.id.tv_username);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");

        tvUserName.setText(userName);
    }
}
