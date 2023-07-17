package com.example.absensiptsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PanduanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan);
        getSupportActionBar().hide();
    }

    public void backtomenu(View view) {
        Intent intent = new Intent(PanduanActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void isiabsen(View view) {
        Intent intent = new Intent(PanduanActivity.this,AddActivity.class);
        startActivity(intent);
        finish();
    }
}