package  view_controller;

import model.*;

public class Autoverleih {
    public static void main(String[] args) {
        PW my5PW = new PW(5);
        PW my2PW = new PW(2);

        Lieferwagen myLF2500 = new Lieferwagen(2500);

        Ausleihe d3pw5 = new Ausleihe(my5PW, 3);
        Ausleihe d2pw2 = new Ausleihe(my2PW, 2);
        Ausleihe d7lf2500 = new Ausleihe(myLF2500, 7);
        AusleiheListe mylist = new AusleiheListe();
        mylist.dazu(d3pw5);
        mylist.dazu(d2pw2);
        mylist.dazu(d7lf2500);
        System.out.println("Umsatz total: " + mylist.getUmsatz());

    }
}
