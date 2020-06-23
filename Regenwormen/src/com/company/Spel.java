package com.company;

import java.util.*;

public class Spel {
    Scanner scanner = new Scanner(System.in);
    Speelbord speelbord = new Speelbord();
    Speler speler2 = new Speler(0, 0, "naamSpeler");
    Speler speler1 = new Speler(0, 0, "naamSpeler");
    public void Start() {
        speelbord.getSpeelbord(0,0,0);
        tweeSpelers(2);
    }

    public void tweeSpelers(int aantalSpelers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naam speler1: ");
        String naamSpeler1 = scanner.nextLine();
        speler1.changeNaam(naamSpeler1);

        System.out.println("Naam speler2: ");
        String naamSpeler2 = scanner.nextLine();
        speler2.changeNaam(naamSpeler2);


        System.out.println("We spelen met " + aantalSpelers);
        System.out.println("Leuk dat jullie meedoen " + speler1.getNaam() + " en " + speler2.getNaam() + "!");
        System.out.println("We gaan beginnen!");
        System.out.println(speler1.getNaam() + ", gooi een dobbelsteen (toets g) of pak een steen (p)");
        while (true) {
            String gVoorGooien = scanner.nextLine();
            if (gVoorGooien.equals("p")) {
                System.out.println("Welke steen wil je pakken?");
                Integer steenPakken = scanner.nextInt();
                speelbord.spelerEenSteenPakken(steenPakken);
            }
            if (gVoorGooien.equals("g")) {
                speler1.Dobbelen();
                speler1.keuzeMaken();
                System.out.println("Je gooit met " + speler1.aantalDobbelstenen() + " dobbelstenen.");
                System.out.println(speler1.getNaam() + " je hebt nu " + speler1.hoeveelheidPunten() + " punten.");
                System.out.println(speler1.getNaam() + " gooit nog een keer (toets g) of pak een steen (p)");
            } else {
                System.out.println("toets g om de dobbelsteen te gooien");
            }
        }
    }

public void spelSpeler1(){
    System.out.println(speler1.getNaam() + ", gooi een dobbelsteen (toets g) of pak een steen (p)");
    while (true) {
        String gVoorGooien = scanner.nextLine();
        if (gVoorGooien.equals("p")) {
            System.out.println("Welke steen wil je pakken?");
            Integer steenPakken = scanner.nextInt();
            speelbord.spelerEenSteenPakken(steenPakken);
        }
        if (gVoorGooien.equals("g")) {
            speler1.Dobbelen();
            speler1.keuzeMaken();
            System.out.println("Je gooit met " + speler1.aantalDobbelstenen() + " dobbelstenen.");
            System.out.println(speler1.getNaam() + " je hebt nu " + speler1.hoeveelheidPunten() + " punten.");
            System.out.println(speler1.getNaam() + " gooit nog een keer (toets g) of pak een steen (p)");
        } else {
            System.out.println("toets g om de dobbelsteen te gooien");
        }
    }
}


//=============== Oude Methodes ==============

    public int aantalSpelers(){
        System.out.println("**** REGENWORMEN ****");
        //System.out.println("Met hoeveel spelers wil je spelen? (2, 3 of 4 spelers)");
        //int aantalSpelers = scanner.nextInt();
        int aantalSpelers = 2;
        spelersAanmelden(aantalSpelers);
        return aantalSpelers;
    }

    public void spelersAanmelden(int aantalSpelers){
        if (aantalSpelers == 2){
            System.out.println("2 spelers");
            tweeSpelers(2);
        } else {
            System.out.println("Aantal spelers is minimaal 2 en maximaal 4 ");
            aantalSpelers();
        }

    }
}
