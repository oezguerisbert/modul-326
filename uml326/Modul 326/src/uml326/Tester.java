package uml326;

public class Tester {
    public static void main(String[] args) {
        Kiste k = new Kiste(10,10,10);
        System.out.println(k.getVolumen());

        Fass f = new Fass(1,2);
        System.out.println(f.getVolumen());

        LKWLadung lkwlad = new LKWLadung();
        lkwlad.dazu(k);
        lkwlad.dazu(f);
        System.out.println("Gesamtvolumen: " + lkwlad.getVolumen());

    }
}
