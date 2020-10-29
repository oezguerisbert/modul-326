package wp;

public class WPTreiber {
    public static void main(String[] args) {
        Aktie ubsn =  new Aktie("UBS Name", "UBSN", 10.65);

        System.out.println("USBN wert:" + ubsn.getWert());

        Obligation wien32 = new Obligation("wien32", "w32", 103.25, 100000.0, 1.25);
        System.out.println("Wien32 wert: " + wien32.getWert());


        WertpapierPacket wpp = new WertpapierPacket(ubsn, 1000, "8.3.2018", 13.27);
        System.out.println("WertpapierPacket UBSN wert: " + wpp.getWert());

        WertschriftenDepot wsd = new WertschriftenDepot();
        wsd.dazu(wpp);
        System.out.println("WertschriftenDepot wert: " + wsd.getWert());
    }
}
