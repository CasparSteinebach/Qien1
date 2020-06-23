package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Speelbord {

    Speelsteen steen21 = new Speelsteen(21, 1);
    Speelsteen steen22 = new Speelsteen(22, 1);
    Speelsteen steen23 = new Speelsteen(23, 1);
    Speelsteen steen24 = new Speelsteen(24, 1);
    Speelsteen steen25 = new Speelsteen(25, 2);
    Speelsteen steen26 = new Speelsteen(26, 2);
    Speelsteen steen27 = new Speelsteen(27, 2);
    Speelsteen steen28 = new Speelsteen(28, 2);
    Speelsteen steen29 = new Speelsteen(29, 3);
    Speelsteen steen30 = new Speelsteen(30, 3);
    Speelsteen steen31 = new Speelsteen(31, 3);
    Speelsteen steen32 = new Speelsteen(32, 3);
    Speelsteen steen33 = new Speelsteen(33, 4);
    Speelsteen steen34 = new Speelsteen(34, 4);
    Speelsteen steen35 = new Speelsteen(35, 4);
    Speelsteen steen36 = new Speelsteen(36, 4);
    Speelsteen steen0 = new Speelsteen(0,0);

    ArrayList<Speelsteen> speelbord = new ArrayList<Speelsteen>();
    ArrayList<Speelsteen> stapelSpeler1 = new ArrayList<Speelsteen>();
    ArrayList<Speelsteen> stapelSpeler2 = new ArrayList<Speelsteen>();

    public void getSpeelbord(int weghalen, int terugleggen, int omdraaien) {
        speelbord.add(steen21);
        speelbord.add(steen22);
        speelbord.add(steen23);
        speelbord.add(steen24);
        speelbord.add(steen25);
        speelbord.add(steen26);
        speelbord.add(steen27);
        speelbord.add(steen28);
        speelbord.add(steen29);
        speelbord.add(steen30);
        speelbord.add(steen31);
        speelbord.add(steen32);
        speelbord.add(steen33);
        speelbord.add(steen34);
        speelbord.add(steen35);
        speelbord.add(steen36);

        for(int i = 0; i < 16 ; i++){
            stapelSpeler1.add(steen0);
        }

        for(int i = 0; i < 16 ; i++){
            stapelSpeler2.add(steen0);
        }
        Iterator iteratorSpeelbord = speelbord.iterator();
        Iterator iteratorSpelerEen = stapelSpeler1.iterator();
        Iterator iteratorSpelerTwee = stapelSpeler2.iterator();

        System.out.println("Speelbord met " + speelbord.size() + " stenen ligt klaar!");
        while (iteratorSpeelbord.hasNext()) {
            Speelsteen st = (Speelsteen)iteratorSpeelbord.next();
            System.out.print("[" + st.waarde + "-");
            System.out.print(st.aantalWormen + "]");
        }
        System.out.println();
        System.out.println("Speelstapel voor speler 1 met " + stapelSpeler1.size() + " plekken ligt klaar!");
        while (iteratorSpelerEen.hasNext()) {
            Speelsteen st = (Speelsteen)iteratorSpelerEen.next();
            System.out.print("[" + st.waarde + "-");
            System.out.print(st.aantalWormen + "]");
        }
        System.out.println();
        System.out.println("Speelstapel voor speler 2 met " + stapelSpeler2.size() + " plekken ligt klaar!");
        while (iteratorSpelerTwee.hasNext()) {
            Speelsteen st = (Speelsteen)iteratorSpelerTwee.next();
            System.out.print("[" + st.waarde + "-");
            System.out.print(st.aantalWormen + "]");
        }
        System.out.println();
    }

    public void spelerEenSteenPakken(int steenNummer){
        if (steenNummer == 21) {
            speelbord.set(0, steen0);
            stapelSpeler1.set(0, steen21);
            Iterator iteratorSpeelbord = speelbord.iterator();
            Iterator iteratorSpelerEen = stapelSpeler1.iterator();

            System.out.println("Speelbord met " + speelbord.size() + " stenen ligt klaar!");
            while (iteratorSpeelbord.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpeelbord.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
            System.out.println("Speelstapel voor speler 1 met " + stapelSpeler1.size() + " plekken ligt klaar!");
            while (iteratorSpelerEen.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpelerEen.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                System.out.print("[" + st.waarde + "-");
                System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
        }
        if (steenNummer == 22) {
            speelbord.set(1, steen0);
            stapelSpeler1.set(1, steen22);
            Iterator iteratorSpeelbord = speelbord.iterator();
            Iterator iteratorSpelerEen = stapelSpeler1.iterator();

            System.out.println("Speelbord met " + speelbord.size() + " stenen ligt klaar!");
            while (iteratorSpeelbord.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpeelbord.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
            System.out.println("Speelstapel voor speler 1 met " + stapelSpeler1.size() + " plekken ligt klaar!");
            while (iteratorSpelerEen.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpelerEen.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
        }
    }

    public void spelerTweeSteenPakken(int steenNummer){
        if (steenNummer == 21) {
            speelbord.set(0, steen0);
            stapelSpeler1.set(0, steen21);
            Iterator iteratorSpeelbord = speelbord.iterator();
            Iterator iteratorSpelerEen = stapelSpeler1.iterator();

            System.out.println("Speelbord met " + speelbord.size() + " stenen ligt klaar!");
            while (iteratorSpeelbord.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpeelbord.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
            System.out.println("Speelstapel voor speler 1 met " + stapelSpeler1.size() + " plekken ligt klaar!");
            while (iteratorSpelerEen.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpelerEen.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
        }
        if (steenNummer == 22) {
            speelbord.set(1, steen0);
            stapelSpeler1.set(1, steen22);
            Iterator iteratorSpeelbord = speelbord.iterator();
            Iterator iteratorSpelerEen = stapelSpeler1.iterator();

            System.out.println("Speelbord met " + speelbord.size() + " stenen ligt klaar!");
            while (iteratorSpeelbord.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpeelbord.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
            System.out.println("Speelstapel voor speler 1 met " + stapelSpeler1.size() + " plekken ligt klaar!");
            while (iteratorSpelerEen.hasNext()) {
                Speelsteen st = (Speelsteen) iteratorSpelerEen.next();
                if (st.waarde == 0){
                    System.out.print("");
                } else {
                    System.out.print("[" + st.waarde + "-");
                    System.out.print(st.aantalWormen + "]");
                }
            }
            System.out.println();
        }
    }

}
