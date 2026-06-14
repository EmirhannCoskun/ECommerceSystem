package Classes;

import AbstractClasses.Odeme;
import Interfaces.IOdenebilir;

public class KrediKartiOdemesi extends Odeme implements IOdenebilir {
    private String kartNo;

    public KrediKartiOdemesi(int id,double tutar)
    {
        super(id, tutar);
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    @Override
    public void odemeYap(double miktar) {
        System.out.println("Kredi Kartı ile ödeme yapılıyor.");
        setBasariliMi(true);
    }

    @Override
    public boolean odemeYapildiMi() {
        return isBasariliMi();
    }

    @Override
    public void odemeBilgisiYazdir() {
        System.out.println("Kart No: " + getKartNo() + " Ödeme Başarılı Mı: " + isBasariliMi() + " Harcanan Tutar: " + getTutar());
    }
}
