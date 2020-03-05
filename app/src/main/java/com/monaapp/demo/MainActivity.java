package com.monaapp.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private EditText etUserName;
    private EditText etPassword;
    private TextView tvUserName;
    private TextView tvPassword;
    private Button btnLogin;
    private Button btnClose;
    private Button btnDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnClose = (Button) findViewById(R.id.btn_close);
        btnDrawer = (Button) findViewById(R.id.btn_drawer);

        btnLogin.setOnClickListener(this);
        btnClose.setOnClickListener(this);
        btnDrawer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_login:
                Intent myIntent = new Intent(MainActivity.this, FirstActivity.class);
                myIntent.putExtra("userName", etUserName.getText().toString()); //Optional parameters
                MainActivity.this.startActivity(myIntent);
                break;
            case R.id.btn_close:
                Toast.makeText(getApplicationContext(), "Hello dear " + etUserName.getText().toString(), Toast.LENGTH_LONG).show();
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                login.putExtra("userName", etUserName.getText().toString()); //Optional parameters
                MainActivity.this.startActivity(login);
                break;

            case R.id.btn_drawer:
                Intent navigationDrawer = new Intent(MainActivity.this, NavigationDrawerActivity.class);
                MainActivity.this.startActivity(navigationDrawer);
                break;
            default:
                break;
        }


    }
}
