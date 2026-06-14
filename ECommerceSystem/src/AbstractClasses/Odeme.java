package AbstractClasses;

public abstract class Odeme {
    private int id;
    private double tutar;
    private boolean basariliMi;

    public Odeme(int id,double tutar)
    {
        this.id = id;
        this.tutar = tutar;
    }

    public int getId() {
        return id;
    }

    public double getTutar() {
        return tutar;
    }

    public boolean isBasariliMi() {
        return basariliMi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public void setBasariliMi(boolean basariliMi) {
        this.basariliMi = basariliMi;
    }

    public abstract void odemeBilgisiYazdir();
}
