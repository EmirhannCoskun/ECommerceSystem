package AbstractClasses;

public abstract class Urun {
    private int id;
    private String ad;
    private double fiyat;
    private double indirim;

    public Urun(int id,String ad,double fiyat)
    {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public abstract void urunBilgisiYazdir();
    public abstract double fiyatHesapla();

    public String getAd() {
        return ad;
    }

    public int getId() {
        return id;
    }

    public double getFiyat() {
        return fiyat;
    }

    public double getIndirim() {
        return indirim;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setIndirim(double indirim) {
        this.indirim = indirim;
    }
}
