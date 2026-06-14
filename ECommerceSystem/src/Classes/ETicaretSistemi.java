package Classes;

import AbstractClasses.Urun;
import Generics.Depo;

import java.util.ArrayList;

public class ETicaretSistemi {
    private Depo<Urun> urunDepo;
    private ArrayList<Siparis> siparisler;

    public ETicaretSistemi()
    {
        this.urunDepo = new Depo<>();
        this.siparisler = new ArrayList<>();
    }

    public void urunEkle(Urun urun)
    {
        urunDepo.ekle(urun);
    }

    public void siparisOlustur(Musteri musteri, AlisverisSepeti sepet)
    {
        Siparis yeniSiparis = new Siparis(siparisler.size() + 1 , musteri);

        for(Urun urun : sepet.getUrunler())
        {
            yeniSiparis.urunEkle(urun);
        }

        yeniSiparis.toplamFiyatHesapla();
        siparisler.add(yeniSiparis);
        System.out.println("Sipariş başarıyla oluşturuldu!");
    }

    public void tumSiparisleriGoster()
    {
        for(Siparis siparis : siparisler)
        {
            System.out.println("Siparişveren: " + siparis.getMusteri().getAd() + " Sipariş Tutarı: " + siparis.getToplamFiyat());
        }
    }


}
