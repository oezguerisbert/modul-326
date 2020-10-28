package wp;

public abstract class Wertpapier {
    
    String name;
    String krz;
    double kurs;

    //Konstruktor
    public Wertpapier(String n, String k, double ku) {
        this.name = n;
        this.krz = k;
        this.kurs = ku;
    }

    abstract double getWert();
}
