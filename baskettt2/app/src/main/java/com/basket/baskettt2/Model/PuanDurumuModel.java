package com.basket.baskettt2.Model;

public class PuanDurumuModel{
    String TakimIsmi;
    String MacSayisi;
    String GalipSayisi;
    String MaglubiyetSayisi;
    String AtilanSayi;
    String YenilenSayi;
    String Avarage;
    public PuanDurumuModel(String TakimIsmi,String MacSayisi,String GalipSayisi,String MaglubiyetSayisi,String AtilanSayi,String YenilenSayi,String Avarage){
        this.TakimIsmi=TakimIsmi;
        this.MacSayisi=MacSayisi;
        this.GalipSayisi=GalipSayisi;
        this.MaglubiyetSayisi=MaglubiyetSayisi;
        this.AtilanSayi=AtilanSayi;
        this.YenilenSayi=YenilenSayi;
        this.Avarage=Avarage;
    }

    public String getAtilanSayi() {
        return AtilanSayi;
    }

    public String getAvarage() {
        return Avarage;
    }

    public String getGalipSayisi() {
        return GalipSayisi;
    }

    public String getMacSayisi() {
        return MacSayisi;
    }

    public String getMaglubiyetSayisi() {
        return MaglubiyetSayisi;
    }

    public String getYenilenSayi() {
        return YenilenSayi;
    }


    public void setAtilanSayi(String atilanSayi) {
        AtilanSayi = atilanSayi;
    }

    public void setAvarage(String avarage) {
        Avarage = avarage;
    }

    public void setGalipSayisi(String galipSayisi) {
        GalipSayisi = galipSayisi;
    }

    public void setMacSayisi(String macSayisi) {
        MacSayisi = macSayisi;
    }

    public void setMaglubiyetSayisi(String maglubiyetSayisi) {
        MaglubiyetSayisi = maglubiyetSayisi;
    }

    public void setTakimIsmi(String takimIsmi) {
        TakimIsmi = takimIsmi;
    }

    public void setYenilenSayi(String yenilenSayi) {
        YenilenSayi = yenilenSayi;
    }

    public String getTakimIsmi() {
        return TakimIsmi;
    }
}
