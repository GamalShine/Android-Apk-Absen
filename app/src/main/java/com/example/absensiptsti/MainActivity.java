package com.example.absensiptsti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void absensi(View view) {
        Intent intent = new Intent(MainActivity.this,InOutActivity.class);
        startActivity(intent);
        finish();
    }

    public void riwayat(View view) {
        Intent intent = new Intent(MainActivity.this,HistoryInOutActivity.class);
        startActivity(intent);
        finish();
    }

    public void logout2(View view) {
        finish();
        SharedPrefManager.getInstance(getApplicationContext()).logout();
    }

    public void panduan(View view) {
        Intent intent = new Intent(MainActivity.this,PanduanActivity.class);
        startActivity(intent);
        finish();
    }

}