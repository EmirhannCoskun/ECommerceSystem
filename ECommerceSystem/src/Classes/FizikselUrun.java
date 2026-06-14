package Classes;

import AbstractClasses.Urun;
import Interfaces.IAranabilir;
import Interfaces.IIndirimlenebilir;

public class FizikselUrun extends Urun implements IIndirimlenebilir, IAranabilir {
    private double agirlik;

    public FizikselUrun(int id,String ad,double fiyat,double agirlik)
    {
        super(id, ad, fiyat);
        this.agirlik = agirlik;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    @Override
    public void urunBilgisiYazdir() {
        System.out.println("Ürün Adı: " + getAd() + " Ürün Fiyatı: " + getFiyat() + " Ağırlık: " +  getAgirlik() + " İndirim: " + getIndirim());
    }

    @Override
    public double fiyatHesapla() {
        if (getAgirlik() < 10)
        {
            return getFiyat();
        }
        return getFiyat() + 20; // +20 = Kargo Ücreti
    }

    @Override
    public void indirimUygula(double yuzde) {
        setIndirim(yuzde);  // İndirim yüzdesini ayarla
    }

    @Override
    public double indirimliFiyat() {
        return getFiyat() - (getFiyat() * getIndirim() / 100);
    }

    @Override
    public boolean adaGoreAra(String ad) {
        return ad.equals(this.getAd());
    }

    @Override
    public boolean fiyataGoreAra(double fiyat) {
        return fiyat == this.getFiyat();
    }
}
