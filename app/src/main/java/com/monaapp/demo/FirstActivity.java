package com.monaapp.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.monaapp.demo.fragement.FirstFragment;
import com.monaapp.demo.fragement.GoogleMapFragment;
import com.monaapp.demo.fragement.SecondFragment;

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

        final Fragment first = new FirstFragment();
        final Fragment second = new SecondFragment();
        final Fragment googleMapFragment = new GoogleMapFragment();
        findViewById(R.id.fragment1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragement, first);
                fragmentTransaction.commit();
            }
        });
        findViewById(R.id.fragment2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragement, second);
                fragmentTransaction.commit();
            }
        });
        findViewById(R.id.btn_google_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragement, googleMapFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
