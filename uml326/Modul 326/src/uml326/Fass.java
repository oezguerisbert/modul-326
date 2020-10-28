package uml326;

public class Fass extends Behaelter {
    
    //Eigenschaften
    double hoehe;
    double radius;

    public Fass(double h, double r) {
        this.hoehe = h;
        this.radius = r;
    }

    @Override
    double getVolumen() {
        
        return this.radius * this.radius * Math.PI * hoehe;
    }
    
}
