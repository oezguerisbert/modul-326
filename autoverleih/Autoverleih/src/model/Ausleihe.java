package model;

public class Ausleihe {
    Wagen w;
    int t;

    public Ausleihe(Wagen w, int t) {
        this.w = w;
        this.t = t;
    }

    public double getUmsatz(){
        return w.getTagessatz() * this.t;
    }
}
