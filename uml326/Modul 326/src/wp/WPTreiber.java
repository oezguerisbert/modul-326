package wp;

public class WPTreiber {
    public static void main(String[] args) {
        Aktie ubsn =  new Aktie("UBS Name", "UBSN", 10.65);

        System.out.println("USBN wert:" + ubsn.getWert());

        Obligation wien32 = new Obligation("wien32", "w32", 103.25, 100000.0, 1.25);
        System.out.println("Wien32 wert: " + wien32.getWert());


        WertpapierPacket wppUBSN = new WertpapierPacket(ubsn, 1000, "8.3.2018", 13.27);
        System.out.println("WertpapierPacket UBSN wert: " + wppUBSN.getWert());

        
        WertpapierPacket wppWien = new WertpapierPacket(wien32, 10, "9.7.2018", 101.5);
        System.out.println("WertpapierPacket Wien wert: " + wppWien.getWert());

        WertschriftenDepot wsd = new WertschriftenDepot();
        wsd.dazu(wppUBSN);
        wsd.dazu(wppWien);
        System.out.println("WertschriftenDepot wert: " + wsd.getWert());
        System.out.println("WertschriftenDepot erfolg: " + wsd.getErfolg());

    }
}
