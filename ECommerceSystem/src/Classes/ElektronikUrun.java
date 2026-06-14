package Classes;

import AbstractClasses.Urun;
import Interfaces.IAranabilir;
import Interfaces.IIndirimlenebilir;

public class ElektronikUrun extends Urun implements IIndirimlenebilir, IAranabilir {
    private int garantiSuresi;

    public ElektronikUrun(int id,String ad,double fiyat,int garantiSuresi)
    {
        super(id, ad, fiyat);
        this.garantiSuresi = garantiSuresi;
    }

    public int getGarantiSuresi() {
        return garantiSuresi;
    }

    public void setGarantiSuresi(int garantiSuresi) {
        this.garantiSuresi = garantiSuresi;
    }

    @Override
    public double indirimliFiyat() {
        return getFiyat() - (getFiyat() * getIndirim() / 100);
    }

    @Override
    public void urunBilgisiYazdir() {
        System.out.println("Ürün Adı: " + getAd() + " Ürün Fiyatı: " + getFiyat() + " Garanti Süresi: " + getGarantiSuresi() + " İndirim: " + getIndirim());
    }

    @Override
    public double fiyatHesapla() {
        if(getIndirim() > 0)
        {
            return indirimliFiyat();
        }
        return getFiyat();
    }


    @Override
    public void indirimUygula(double yuzde) {
        setIndirim(yuzde);  // İndirim yüzdesini ayarla
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
