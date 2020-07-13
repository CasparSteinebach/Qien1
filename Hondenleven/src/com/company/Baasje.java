package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Baasje {
    int aantalHonden;
    int aantalBrokjes;
    String naam;
    private double Portemonnee = 100;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Hond> hondenLijst = new ArrayList<>();


    Baasje(int aantalHonden, int aantalBrokjes, String naam) {
        this.aantalBrokjes = aantalBrokjes;
        this.aantalHonden = aantalHonden;
        this.naam = naam;
    }

    Baasje(String naam) {
        this.naam = naam;
    }

    public int brokjesVoeren(int brokjesGevraagd) {
        checkBrokjes();
        int brokjesGevoerd = brokjesGevraagd;
        this.aantalBrokjes = this.aantalBrokjes - brokjesGevoerd;
        return brokjesGevoerd;
    }

    public int checkBrokjes() {
        if (this.aantalBrokjes <= 20) {
            System.out.println(this.naam + " zijn brokjes zijn nu bijna op! Wil je bijkopen? [ja] of [nee]");
            String invoer = scanner.nextLine();
            if (invoer.equals("ja")) {
                System.out.println("je koopt nu 50 brokjes bij voor 50 euro!");
                this.aantalBrokjes = this.aantalBrokjes + 50;
                Portemonnee = Portemonnee - 50.0;
                System.out.println("Je hebt nu " + this.aantalBrokjes + " brokjes en " + Portemonnee + " euro in je portemonnee!");
            }
        }
        return this.aantalBrokjes;
    }

    void hondKopen(){

    }
}
