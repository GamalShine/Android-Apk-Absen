package com.example.absensiptsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginRegisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_regis);
        getSupportActionBar().hide();
    }

    public void loginregis1(View view) {
        Intent intent = new Intent(LoginRegisActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void loginregis2(View view) {
        Intent intent = new Intent(LoginRegisActivity.this,RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}