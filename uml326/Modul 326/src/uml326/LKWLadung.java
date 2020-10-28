package uml326;

import java.util.*;

public class LKWLadung {
    
    double volumen;
    ArrayList<Behaelter> liste;

    public LKWLadung() {
        this.liste = new ArrayList<Behaelter>();

    }

    public void dazu(Behaelter b){
        this.liste.add(b);
    }

    public double getVolumen(){
        volumen = 0;
        this.liste.forEach(behaelter -> {
            volumen += behaelter.getVolumen();
        });
        return volumen;
    }

}
