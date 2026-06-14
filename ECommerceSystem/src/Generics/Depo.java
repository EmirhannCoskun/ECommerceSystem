package Generics;

import java.util.ArrayList;

public class Depo<T> {
    private ArrayList<T> veriler;

    public Depo()
    {
        this.veriler = new ArrayList<>();
    }

    public void ekle(T eleman)
    {
        veriler.add(eleman);
    }

    public void sil(T eleman)
    {
        veriler.remove(eleman);
    }

    public void tumElemanlariGoster()
    {
        for(T eleman : veriler)
        {
            System.out.println(eleman);
        }
    }

    public int boyut(){
        return veriler.size();
    }
}
