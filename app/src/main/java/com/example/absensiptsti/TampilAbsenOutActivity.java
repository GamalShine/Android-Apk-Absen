package com.example.absensiptsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class TampilAbsenOutActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_absen_out);
        getSupportActionBar().hide();

        ambilData();
    }

    void ambilData() {
        String link = "http://192.168.0.109/crud/tampilKeluar.php";
        StringRequest respon = new StringRequest(
                Request.Method.POST,
                link,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONArray("hasil");
                            ArrayList<tampilDataKeluar> listKeluar;
                            listKeluar = new ArrayList<>();
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject hasil = jsonArray.getJSONObject(i);
                                String id = hasil.getString("id");
                                String ws = hasil.getString("status");
                                String kota = hasil.getString("kota");
                                String lokasi = hasil.getString("lokasi");
                                String health = hasil.getString("health");
                                String hadir = hasil.getString("hadir");
                                listKeluar.add(new tampilDataKeluar(
                                        id,
                                        ws,
                                        kota,
                                        lokasi,
                                        health,
                                        hadir
                                ));
                            }

                            ListView listView = findViewById(R.id.list_dataKeluar);
                            tampilAdapterKeluar adapter = new tampilAdapterKeluar(TampilAbsenOutActivity.this, listKeluar);
                            listView.setAdapter(adapter);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(TampilAbsenOutActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(respon);

    }

    public void backtomainH(View view) {
        Intent intent = new Intent(TampilAbsenOutActivity.this,HistoryInOutActivity.class);
        startActivity(intent);
        finish();
    }
}
