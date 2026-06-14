package Classes;

import AbstractClasses.Urun;

import java.util.ArrayList;

public class AlisverisSepeti {
    private ArrayList<Urun> urunler;

    public AlisverisSepeti()
    {
        this.urunler = new ArrayList<>();
    }

    public ArrayList<Urun> getUrunler() {
        return urunler;
    }

    public void urunEkle(Urun urun)
    {
        urunler.add(urun);
    }

    public void urunCikar(Urun urun){
        urunler.remove(urun);
    }

    public double toplamFiyat()
    {
        double toplam = 0;
        for (Urun value : urunler)
        {
            toplam += value.getFiyat();
        }
        return toplam;
    }

    public void sepetiGoster()
    {
        for(Urun urun : urunler)
        {
            System.out.println("Ürün Adı: " + urun.getAd() + " Ürün Fiyatı: " + urun.getFiyat() + " Ürün İndirimi: " + urun.getIndirim());
        }
    }

}
