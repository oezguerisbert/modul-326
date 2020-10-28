package uml326;

public class Kiste extends Behaelter {

    double laenge;
    double breite;
    double hoehe;

    public Kiste(double l, double b, double h) {
        this.laenge = l;
        this.breite = b;
        this.hoehe = h;
    } 

    @Override
    double getVolumen() {
        return 200.0d;
    }

}
