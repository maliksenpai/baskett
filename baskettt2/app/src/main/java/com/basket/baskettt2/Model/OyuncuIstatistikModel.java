package com.basket.baskettt2.Model;

import android.os.Bundle;
import android.widget.TextView;

public class OyuncuIstatistikModel {
    String OyuncuIsmi,Toplam,YakinAtis,Riband,UzakAtis,Atletik,Defans,Uzunluk,Yas,Kilo,Para,Rol;
    public OyuncuIstatistikModel(String OyuncuIsmi,String Toplam,String YakinAtis,String Riband,String UzakAtis,String Atletik,String Defans,String Uzunluk,String Yas,String Kilo,String Para,String Rol){
        this.OyuncuIsmi=OyuncuIsmi;
        this.Toplam=Toplam;
        this.YakinAtis=YakinAtis;
        this.Riband=Riband;
        this.UzakAtis=UzakAtis;
        this.Atletik=Atletik;
        this.Defans=Defans;
        this.Uzunluk=Uzunluk;
        this.Yas=Yas;
        this.Kilo=Kilo;
        this.Para=Para;
        this.Rol=Rol;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getAtletik() {
        return Atletik;
    }

    public String getDefans() {
        return Defans;
    }

    public String getOyuncuIsmi() {
        return OyuncuIsmi;
    }

    public String getKilo() {
        return Kilo;
    }

    public String getRiband() {
        return Riband;
    }

    public String getToplam() {
        return Toplam;
    }

    public int getToplam2(){ return Integer.valueOf(Toplam); }

    public String getUzakAtis() {
        return UzakAtis;
    }

    public String getYakinAtis() {
        return YakinAtis;
    }

    public String getPara() {
        return Para;
    }

    public String getUzunluk() {
        return Uzunluk;
    }

    public String getYas() {
        return Yas;
    }

    public Bundle getIstatistik(){
        Bundle gelenler =new Bundle();
        gelenler.putString("isim",OyuncuIsmi);
        gelenler.putString("toplam", Toplam);
        gelenler.putString("yakinatis",YakinAtis);
        gelenler.putString("uzakatis",UzakAtis);
        gelenler.putString("riband",Riband);
        gelenler.putString("atletik",Atletik);
        gelenler.putString("defans",Defans);
        gelenler.putString("uzunluk",Uzunluk);
        gelenler.putString("yas",Yas);
        gelenler.putString("kilo",Kilo);
        gelenler.putString("para",Para);
        gelenler.putString("rol",Rol);
        return gelenler;
    }

    public void setAtletik(String atletik) {
        Atletik = atletik;
    }

    public void setDefans(String defans) {
        Defans = defans;
    }

    public void setOyuncuIsmi(String oyuncuIsmi) {
        OyuncuIsmi = oyuncuIsmi;
    }

    public void setRiband(String riband) {
        Riband = riband;
    }

    public void setKilo(String kilo) {
        Kilo = kilo;
    }

    public void setPara(String para) {
        Para = para;
    }

    public void setToplam(String toplam) {
        Toplam = toplam;
    }

    public void setUzakAtis(String uzakAtis) {
        UzakAtis = uzakAtis;
    }

    public void setUzunluk(String uzunluk) {
        Uzunluk = uzunluk;
    }

    public void setYakinAtis(String yakinAtis) {
        YakinAtis = yakinAtis;
    }

    public void setYas(String yas) {
        Yas = yas;
    }
}
