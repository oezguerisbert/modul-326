package model;

public class Lieferwagen extends Wagen {
    double volumen;

    public Lieferwagen(double v) {
        this.volumen = v;
    }


    @Override
    double getTagessatz() {
        
        return 0.07 * this.volumen;
    }
    
}
