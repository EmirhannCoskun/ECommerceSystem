package Classes;

import AbstractClasses.Kullanici;
import Interfaces.IAranabilir;

public class Musteri extends Kullanici implements IAranabilir {
    private double bakiye;

    public Musteri(String ad,int id,String email,double bakiye)
    {
        super(ad, id, email);
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public void bilgiBas() {
        System.out.println("Müşteri: " + getAd());
    }

    public void bakiyeGuncelle(double miktar)
    {
        bakiye = miktar;
        System.out.println("Bakiye güncellendi. Yeni Bakiye: " + getBakiye());
    }

    @Override
    public boolean adaGoreAra(String ad) {
        System.out.println("Ürün aranıyor: " + getAd());
        return true;
    }

    @Override
    public boolean fiyataGoreAra(double fiyat) {
        System.out.println("Fiyat aranıyor: " + fiyat);
        return true;
    }
}
