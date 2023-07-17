package com.example.absensiptsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerimaKasihActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terimakasih);
        getSupportActionBar().hide();
    }

    public void backtomain3(View view) {
        Intent intent = new Intent(TerimaKasihActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}