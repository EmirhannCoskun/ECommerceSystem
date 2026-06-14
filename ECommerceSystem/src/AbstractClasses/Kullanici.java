package AbstractClasses;

public abstract class Kullanici {
    private String ad;
    private int id;
    private String email;

    public Kullanici(String ad,int id,String email)
    {
        this.ad = ad;
        this.id = id;
        this.email = email;
    }

    public abstract void bilgiBas();

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getEmail() {
        return email;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
