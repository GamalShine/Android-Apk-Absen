package com.example.absensiptsti;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoryInOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_in_out);
        getSupportActionBar().hide();
    }

    public void kemainH(View view) {
        Intent intent = new Intent(HistoryInOutActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void masukA(View view) {
        Intent intent = new Intent(HistoryInOutActivity.this,HistoryActivity.class);
        startActivity(intent);
        finish();
    }

    public void keluarA(View view) {
        Intent intent = new Intent(HistoryInOutActivity.this,TampilAbsenOutActivity.class);
        startActivity(intent);
        finish();
    }
}