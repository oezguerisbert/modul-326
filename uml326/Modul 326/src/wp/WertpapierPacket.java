package wp;

public class WertpapierPacket {
    Wertpapier wpo;
    int anzahl;
    String kaufdatum;
    double kursBeiKauf;

    //Konstruktor
    public WertpapierPacket(Wertpapier wpo, int anzahl, String kaufdatum, double kursBeiKauf) {
        this.wpo = wpo;
        this.anzahl = anzahl;
        this.kaufdatum = kaufdatum;
        this.kursBeiKauf = kursBeiKauf;
    }

    public double getWert(){
        return this.wpo.getWert() * this.anzahl;
    }
    public double getErfolg(){
        return this.getWert() - this.wpo.getWert(this.kursBeiKauf) * anzahl;
    }
}
