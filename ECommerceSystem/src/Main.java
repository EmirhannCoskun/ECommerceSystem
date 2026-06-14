import Classes.*;

public class Main {
    public  static void main() {
        ETicaretSistemi eTicaretSistemi = new ETicaretSistemi();

        ElektronikUrun elektronikUrun1 = new ElektronikUrun(1,"Laptop",5000,24);
        ElektronikUrun elektronikUrun2 = new ElektronikUrun(2,"Telefon",3000,12);

        FizikselUrun fizikselUrun1 = new FizikselUrun(1,"Kitap",50,0.5);

        elektronikUrun1.indirimUygula(10);
        elektronikUrun2.indirimUygula(5);

        eTicaretSistemi.urunEkle(elektronikUrun1);
        eTicaretSistemi.urunEkle(elektronikUrun2);
        eTicaretSistemi.urunEkle(fizikselUrun1);

        Musteri musteri1 = new Musteri("Emirhan",1,"emrhan@mail.com",10000);
        Musteri musteri2 = new Musteri("Gemini",2,"gemini@mail.com;",8000);
        musteri2.bilgiBas();

        AlisverisSepeti alisverisSepeti = new AlisverisSepeti();

        alisverisSepeti.urunEkle(elektronikUrun1);
        alisverisSepeti.urunEkle(elektronikUrun2);
        alisverisSepeti.sepetiGoster();

        Siparis siparis1 = new Siparis(1,musteri1);
        siparis1.siparisOzeti();
        siparis1.toplamFiyatHesapla();


    }
}
