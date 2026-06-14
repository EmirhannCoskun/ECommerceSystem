package Classes;

import AbstractClasses.Odeme;
import Interfaces.IOdenebilir;

public class BankaTransferiOdemesi extends Odeme implements IOdenebilir {
    private String hesapNo;

    public BankaTransferiOdemesi(int id,double tutar)
    {
        super(id, tutar);
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    @Override
    public void odemeYap(double miktar) {
        System.out.println("Banka transferi ile ödeme yapılıyor");
        setBasariliMi(true);
    }

    @Override
    public boolean odemeYapildiMi() {
        return isBasariliMi();
    }

    @Override
    public void odemeBilgisiYazdir() {
        System.out.println("Hesap No: " + getHesapNo() + " Ödeme Başarılı Mı: " + isBasariliMi() + " Harcanan Tutar: " + getTutar());
    }
}
