package com.example.absensiptsti;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelamatDatangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamatdatang);
        getSupportActionBar().hide();

        }

    public void get(View view) {
        Intent intent = new Intent(SelamatDatangActivity.this,LoginRegisActivity.class);
        startActivity(intent);
        finish();
    }
}