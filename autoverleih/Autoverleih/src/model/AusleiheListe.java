package model;

import java.util.ArrayList;

public class AusleiheListe {
    ArrayList<Ausleihe> liste;
    public AusleiheListe() {
        this.liste = new ArrayList<Ausleihe>();
    }

    public void dazu(Ausleihe a){
        this.liste.add(a);
    }

    public double getUmsatz(){
        double summe = 0;
        for (Ausleihe wagen : liste) {
            summe += wagen.getUmsatz();
        }
        return summe;
    }
}
