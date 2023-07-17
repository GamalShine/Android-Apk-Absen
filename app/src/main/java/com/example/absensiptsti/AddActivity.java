package com.example.absensiptsti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Request;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class AddActivity extends AppCompatActivity{

    public static final String tambahData = "http://192.168.0.109/crud/tambah.php";
    private Spinner spWS,spKOTA,spLOKASI,spHEALTH;
    Button simpan;
    RadioGroup radioGroup;
    RadioButton rdhadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        getSupportActionBar().hide();

        simpan = findViewById(R.id.btn_simpan);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputData();
            }
        });

        String[] Work_Status = new String[] {"Choose", "Work From Home", "Work From Office"};
        spWS = findViewById(R.id.spWS);
        ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter<CharSequence>(this,R.layout.spinner_layout, Work_Status);
        spWS.setAdapter(adapter1);

        String[] City = new String[] {"Choose", "Tangerang", "Cikupa", "Pasar Kemis", "none"};
        spKOTA = findViewById(R.id.spKOTA);
        ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter<CharSequence>(this,R.layout.spinner_layout, City);
        spKOTA.setAdapter(adapter2);


        String[] wfo = new String[] {"Choose", "Gedung 1", "Gedung 2", "Gedung 3", "none"};
        spLOKASI = findViewById(R.id.spLOKASI);
        ArrayAdapter<CharSequence> adapter3 = new ArrayAdapter<CharSequence>(this,R.layout.spinner_layout, wfo);
        spLOKASI.setAdapter(adapter3);


        String[] condition = new String[] {"Choose", "Sick", "Health"};
        spHEALTH = findViewById(R.id.spHEALTH);
        ArrayAdapter<CharSequence> adapter4 = new ArrayAdapter<CharSequence>(this,R.layout.spinner_layout, condition);
        spHEALTH.setAdapter(adapter4);

        radioGroup = findViewById(R.id.rdAksi);

    }

    void inputData(){
        int rdTerpilih = radioGroup.getCheckedRadioButtonId();
        rdhadir = findViewById(rdTerpilih);

        String ws = spWS.getSelectedItem().toString();
        String kota = spKOTA.getSelectedItem().toString();
        String lokasi = spLOKASI.getSelectedItem().toString();
        String health = spHEALTH.getSelectedItem().toString();
        String radio = rdhadir.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, tambahData,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (ws.equals("") || kota.equals("") || lokasi.equals("") || health.equals("")) {
                            Toast.makeText(AddActivity.this, "Upss, Ada Kolom Yang Kosong", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(AddActivity.this, "Data Berhasil Di simpan", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(AddActivity.this, TerimaKasihActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(AddActivity.this, "data gagal disimpan", Toast.LENGTH_SHORT).show();
            }
        })
        {
            @Override
            protected Map<String,String> getParams() throws AuthFailureError{
                Map<String, String> params = new HashMap<String, String>();

                params.put("status",ws);
                params.put("kota",kota);
                params.put("lokasi",lokasi);
                params.put("health",health);
                params.put("hadir", radio);
                return params;
            }
        };
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(stringRequest);

    }

    public void backtomain2(View view) {
        Intent intent = new Intent(AddActivity.this,InOutActivity.class);
        startActivity(intent);
        finish();
    }
}