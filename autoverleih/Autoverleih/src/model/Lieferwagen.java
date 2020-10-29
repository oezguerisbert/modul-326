package model;

public class Lieferwagen extends Wagen {
    double volumen;

    public Lieferwagen(double v) {
        this.volumen = v;
    }


    @Override
    double getTagessatz() {
        
        return 0.7 * this.volumen;
    }
    
}
