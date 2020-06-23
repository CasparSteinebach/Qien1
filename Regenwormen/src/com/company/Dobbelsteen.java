package com.company;

import java.util.*;

public class Dobbelsteen {

    private int aantalStenen;
    private int worp;
    private int dobbelPuntenScore;
    public ArrayList<Integer> worpStenen2 = new ArrayList<Integer>();

    public Dobbelsteen(int stenen){
        stenen = 8;
        this.aantalStenen = stenen;
    }

    public ArrayList<Integer> getWorp() {
        Random random = new Random();
        System.out.println("Dit heb je gegooid: ");
        for (int i = 0; i < this.aantalStenen; i++){
            worp = random.nextInt(6) + 1;
            worpStenen2.add(worp);
            System.out.print(worpStenen2.get(i) + " ");
        }
        System.out.println(" ");
        return worpStenen2;
    }

    public void keuze() {
        Integer nummerEen = 0;
        Integer nummerTwee = 0;
        Integer nummerDrie = 0;
        Integer nummerVier = 0;
        Integer nummerVijf = 0;
        Integer nummerZes = 0;
        //System.out.println("lengte rij nummers: " + worpStenen2.size());
        for (int i = 0; i < worpStenen2.size(); i++){
            if (worpStenen2.get(i).equals(1)){
                nummerEen++;
            }
            if (worpStenen2.get(i).equals(2)){
                nummerTwee++;
            }
            if (worpStenen2.get(i).equals(3)){
                nummerDrie++;
            }
            if (worpStenen2.get(i).equals(4)){
                nummerVier++;
            }
            if (worpStenen2.get(i).equals(5)){
                nummerVijf++;
            }
            if (worpStenen2.get(i).equals(6)){
                nummerZes++;
            }
        }
        System.out.println("=======================");
        System.out.println("Aantal eenen: " + nummerEen);
        System.out.println("Aantal tweeen: " + nummerTwee);
        System.out.println("Aantal drieen: " + nummerDrie);
        System.out.println("Aantal vieren: " + nummerVier);
        System.out.println("Aantal vijfen: " + nummerVijf);
        System.out.println("Aantal Regenwormen (6): " + nummerZes);
        System.out.println("wat wil je houden?");
    }

    public void keuzeMaken(int keuzeMaken){
        Integer puntenaantal = 0;
        Integer dobbelPunten = 0;
        Integer aantalDobbelStenen = worpStenen2.size();
        System.out.println("Je kiest " + keuzeMaken + "en.");

        for (int i = 0; i < worpStenen2.size(); i++){
            if (worpStenen2.get(i).equals(keuzeMaken)){
                puntenaantal++;
            }
        }
        this.aantalStenen = worpStenen2.size() - puntenaantal;
        dobbelPunten = keuzeMaken * puntenaantal;
        dobbelPuntenScore = dobbelPuntenScore + dobbelPunten;
        worpStenen2.clear();
    }

    public int getDobbelPuntenScore(){
        return dobbelPuntenScore;
    }

    public int getAantalStenen(){
        return this.aantalStenen;
    }
}

