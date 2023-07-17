package com.example.absensiptsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_out);
        getSupportActionBar().hide();
    }

    public void masuk(View view) {
        Intent intent = new Intent(InOutActivity.this,AddActivity.class);
        startActivity(intent);
        finish();
    }

    public void keluar(View view) {
        Intent intent = new Intent(InOutActivity.this,OutActivity.class);
        startActivity(intent);
        finish();
    }

    public void kemain(View view) {
        Intent intent = new Intent(InOutActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}