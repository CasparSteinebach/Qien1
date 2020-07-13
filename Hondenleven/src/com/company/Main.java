package com.company;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            Winkel dierenwinkel = new Winkel();
            Baasje Piet = new Baasje(0, 50, "Piet");
            Hond barkley = new Hond("Golden Retriever", "Barkley", 10, Piet);
            Hond fluffy = new Hond("Bordercollie", "Fifi", 9, Piet);
            Hond trouby = new Hond("Staffordshire", "Trouby",  14, Piet);

            Piet.hondenLijst.add(fluffy);
            Piet.hondenLijst.add(trouby);
            Piet.hondenLijst.add(barkley);

            Piet.aantalHonden=Piet.hondenLijst.size();

            for(Hond h : Piet.hondenLijst){
                System.out.println("Zo blaft " + h.naam + " de " + h.ras + " : " + h.getBlaffen() + ". Zij heeft " + h.aantalOgen +" ogen en " + h.aantalPoten + " pootjes.");
            }

            if (Piet.hondenLijst.size() != Piet.aantalHonden){
                int hondenKwijt = Piet.aantalHonden - Piet.hondenLijst.size();
                System.out.println(Piet.naam + " is " + hondenKwijt + " honden kwijt!");
            } else {
                System.out.println("Piet heeft " + Piet.hondenLijst.size() + " honden!");

            }
            System.out.println(Piet.naam + " heeft nu " + Piet.aantalBrokjes + " brokjes!");
            System.out.println(Piet.naam + " voert " + trouby.naam + " 8 brokjes");
            trouby.brokjesEten(Piet.brokjesVoeren(8));
            System.out.println(Piet.naam+ " heeft " + trouby.naam + " 8 brokjes gegeven. Hierdoor heeft " + Piet.naam +" nog maar " + Piet.aantalBrokjes + " brokjes.");
            System.out.println(trouby.naam + " heeft nu " + trouby.getAantalBrokjes() + " brokjes opgegeten!");
            System.out.println(Piet.naam + " voert " + trouby.naam + " 4 brokjes");
            trouby.brokjesEten(Piet.brokjesVoeren(4));
            System.out.println(Piet.naam+ " heeft " + trouby.naam + " 4 brokjes gegeven. Hierdoor heeft " + Piet.naam +" nog maar " + Piet.aantalBrokjes + " brokjes.");
            System.out.println(trouby.naam + " heeft nu " + trouby.getAantalBrokjes() + " brokjes opgegeten!");
            trouby.brokjesEten(Piet.brokjesVoeren(6));
            System.out.println(Piet.naam+ " heeft " + trouby.naam + " 6 brokjes gegeven. Hierdoor heeft " + Piet.naam +" nog maar " + Piet.aantalBrokjes + " brokjes.");
            System.out.println(trouby.naam + " heeft nu " + trouby.getAantalBrokjes() + " brokjes opgegeten!");
            fluffy.brokjesEten(Piet.brokjesVoeren(8));
            System.out.println(Piet.naam+ " heeft " + fluffy.naam + " 8 brokjes gegeven. Hierdoor heeft " + Piet.naam +" nog maar " + Piet.aantalBrokjes + " brokjes.");
            System.out.println(fluffy.naam + " heeft nu " + fluffy.getAantalBrokjes() + " brokjes opgegeten!");
            barkley.brokjesEten(Piet.brokjesVoeren(8));
            System.out.println(Piet.naam+ " heeft " + barkley.naam + " 8 brokjes gegeven. Hierdoor heeft " + Piet.naam +" nog maar " + Piet.aantalBrokjes + " brokjes.");
            System.out.println(barkley.naam + " heeft nu " + barkley.getAantalBrokjes() + " brokjes opgegeten!");
            Piet.checkBrokjes();
            dierenwinkel.voorStellen();
            System.out.println(dierenwinkel.winkeleigenaarTheo.naam + " heeft nu " + dierenwinkel.hondenWinkel.size() + " honden in zijn bezit");
            Piet.hondenLijst.add(dierenwinkel.hondVerkopen());
            System.out.println(Piet.naam + " heeft nu " + Piet.hondenLijst.size() + " honden: ");
            for(Hond h : Piet.hondenLijst){
                System.out.println(h.naam);
            }

            System.out.println(dierenwinkel.winkeleigenaarTheo.naam + " heeft nu " + dierenwinkel.hondenWinkel.size() + " honden in zijn bezit");


        }
    }

