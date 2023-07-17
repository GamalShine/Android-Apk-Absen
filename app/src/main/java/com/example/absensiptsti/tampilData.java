package com.example.absensiptsti;

public class tampilData {
    private String id="", ws="", kota="", lokasi="", health="", hadir="";

    tampilData(String id, String ws, String kota, String lokasi, String health ,String hadir){
        this.id = id;
        this.ws = ws;
        this.kota = kota;
        this.lokasi = lokasi;
        this.health = health;
        this.hadir =hadir;

    }

    public String getId() {
        return id;
    }

    public String getWs() {
        return ws;
    }

    public String getKota() {return kota;}

    public String getLokasi() {return lokasi;}

    public String getHealth() {return health;}

    public String getHadir() { return hadir; }
}
