package Classes;

import AbstractClasses.Kullanici;

public class Yonetici extends Kullanici {
    public Yonetici(String ad,int id,String email)
    {
        super(ad, id, email);
    }

    @Override
    public void bilgiBas() {
        System.out.println("Yönetici: " + getAd());
    }

    public void urunEkle()
    {
        System.out.println("Ürün ekleniyor.");
    }

    public void urunSil()
    {
        System.out.println("Ürün siliniyor.");
    }
}
