package com.example.absensiptsti;

public class Absen {

    private int nik;
    private String nama, ws, kota, gedung, sehat;

    public void absen (int nik, String nama, String ws, String kota, String gedung, String sehat) {
        this.nik = nik;
        this.nama = nama;
        this.ws = ws;
        this.kota = kota;
        this.gedung = gedung;
        this.sehat = sehat;
    }

    public int getNik() {return nik;}

    public String getnama() {return nama;}

    public String getkota() {return kota;}

    public String getws() {return ws;}

    public String getgedung() {return gedung;}

    public String getsehat() {return sehat;}
}