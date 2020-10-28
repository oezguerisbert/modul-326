package wp;

public class Obligation extends Wertpapier{


    double nominalwert;
    double zins;
    
    //Konstruktor
    public Obligation(String n, String k, double ku, double nom, double z) {
        super(n, k, ku);
        this.nominalwert = nom;
        this.zins = z;
    }

    @Override
    public double getWert() {
        return nominalwert * (kurs/100.0);
    }
    
}
