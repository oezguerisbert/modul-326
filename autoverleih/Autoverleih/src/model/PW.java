package model;

public class PW extends Wagen {

    double plaetze;

    public PW(double p) {
        this.plaetze = p;
    }


    @Override
    double getTagessatz() {
        
        return 12 * this.plaetze;
    }
    
}
