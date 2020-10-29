package wp;

public class Aktie extends Wertpapier {

    //Konstruktor
    public Aktie(String n, String k, double ku) {
        super(n, k, ku);
    }

    @Override
    public double getWert() {
        
        return this.kurs;
    }

    @Override
    double getWert(double kursBeiKauf) {
        
        return kursBeiKauf;
    }
    
}
