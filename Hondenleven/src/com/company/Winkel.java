package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Winkel {
    Baasje winkeleigenaarTheo;
    Hond hond1;
    double kassa;
    Hondenhok hok;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Hond>hondenWinkel=new ArrayList<>();

    Winkel(){
        this.winkeleigenaarTheo = new Baasje("Theo");
        this.hond1 = new Hond("Labradoodle", "Hond1", 3, winkeleigenaarTheo);
        this.kassa = 0.0;
        this.hok = new Hondenhok(hond1);
    }

    void voorStellen() throws ArrayIndexOutOfBoundsException {
        try {
            hondenWinkel.add(hond1);
            System.out.println("Hallo, ik ben " + winkeleigenaarTheo.naam + "." + " Wat kan ik voor je doen?");
            System.out.print("Ik heb " + hondenWinkel.size() + " hond in de aanbieding!");
            System.out.println("De hond is een " + hondenWinkel.get(0).ras + " van " + hondenWinkel.get(0).leeftijd + " jaar oud. De verkoopprijs is " + hondenWinkel.get(0).verkoopPrijs + " euro.");
            System.out.println("Hond kopen [h], gedag zeggen [b]");
            String invoer = scanner.nextLine();
            if (invoer.equals("h")) {
                verkoopActie();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void verkoopActie(){


    }

    Hond hondVerkopen(){
        hondenWinkel.remove(0);
        return hond1;
    }
}
