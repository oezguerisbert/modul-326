package wp;

public class WPTreiber {
    public static void main(String[] args) {
        Aktie ubsn =  new Aktie("UBS Name", "UBSN", 10.65);

        System.out.println(ubsn.getWert());

        Obligation wien32 = new Obligation("wien32", "w32", 103.25, 100000.0, 1.25);
        System.out.println(wien32.getWert());


        WertpapierPacket wpp = new WertpapierPacket(ubsn, 1000, "8.3.2018", 13.27);
        System.out.println(wpp.getWert());
    }
}
