package com.example.absensiptsti;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class tampilAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<tampilData> model;

    tampilAdapter(Context context, ArrayList<tampilData> model) {
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.row_data, null);

        TextView id,ws,kota,lokasi,health,hadir;

        id = view.findViewById(R.id.listID);
        ws = view.findViewById(R.id.listStatus);
        kota = view.findViewById(R.id.listKota);
        lokasi = view.findViewById(R.id.listLokasi);
        health = view.findViewById(R.id.listHealth);
        hadir = view.findViewById(R.id.listHadir);

        id.setText(model.get(position).getId());
        ws.setText(model.get(position).getWs());
        kota.setText(model.get(position).getKota());
        lokasi.setText(model.get(position).getLokasi());
        health.setText(model.get(position).getHealth());
        hadir.setText(model.get(position).getHadir());


        return view;
    }
}
