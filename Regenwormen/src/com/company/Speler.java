package com.company;

import java.util.*;


public class Speler {
    Scanner scanner = new Scanner(System.in);
    private int punten;
    private String naam;
    private int beginstenen;

    public Speler(int stenen, int punten, String naamSpeler){
        this.beginstenen = stenen;
        this.punten = punten;
        this.naam = naamSpeler;
    }

    Dobbelsteen dobbelsteen = new Dobbelsteen(this.beginstenen);

    public void Dobbelen(){
        this.beginstenen = aantalDobbelstenen();
        dobbelsteen.getWorp();
    }

    public String getNaam(){
        return this.naam;
    }

    public String changeNaam(String changeName){
        this.naam = changeName;
        return this.naam;
    }

    public void keuzeMaken(){
        dobbelsteen.keuze();
        Integer keuze = scanner.nextInt();
        dobbelsteen.keuzeMaken(keuze);
        return;
    }

    public int hoeveelheidPunten(){
        return dobbelsteen.getDobbelPuntenScore();
    }

    public int aantalDobbelstenen(){
        return dobbelsteen.getAantalStenen();
    }

    public void getSpeelsteen(){

    }
}
