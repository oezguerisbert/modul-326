package uml326;

public class Kiste extends Behaelter {
    double hoehe;
    double breite;
    double laenge;
    public Kiste(double h, double b, double l){
        this.breite = b;
        this.hoehe = h;
        this.laenge = l;
    }

    @Override
    double getVolumen(){
        return this.breite * this.hoehe * this.laenge;
    }
}
