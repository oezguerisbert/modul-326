package wp;

import java.util.ArrayList;

public class WertschriftenDepot {
    // Eigenschaften
    double summe = 0;
    ArrayList<WertpapierPacket> liste;



    // Konstruktor
    public WertschriftenDepot() {
        this.liste = new ArrayList<WertpapierPacket>();
    }

    // Methoden

    public void dazu(WertpapierPacket wpp){
        this.liste.add(wpp);
    }

    public double getWert(){
        this.summe = 0;
        this.liste.forEach(wpp -> {
            this.summe += wpp.getWert();
        });
        return this.summe;
    }

    public double getErfolg(){
        this.summe = 0;
        this.liste.forEach(wpp -> {
            this.summe += wpp.getErfolg();
        });
        return this.summe;
    }

}
