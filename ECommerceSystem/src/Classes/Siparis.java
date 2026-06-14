package Classes;

import AbstractClasses.Urun;

import java.util.ArrayList;

public class Siparis {
    private int id;
    private Musteri musteri;
    private ArrayList<Urun> urunler;
    private double toplamFiyat;

    public Siparis(int id,Musteri musteri)
    {
        this.id = id;
        this.musteri = musteri;
        this.urunler = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }

    public void urunEkle(Urun urun)
    {
        urunler.add(urun);
    }

    public void toplamFiyatHesapla()
    {
        double toplam = 0;

        for (Urun urun : urunler)
        {
            toplam += urun.fiyatHesapla();
        }
        this.toplamFiyat = toplam;
    }

    public void siparisOzeti()
    {
        System.out.println("Sipariş ID: " + getId() + " Müşteri: " + musteri.getAd() + " Toplam: " + getToplamFiyat());
    }
}
