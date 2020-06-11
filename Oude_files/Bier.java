package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;  // Import Library

public class Bier { // Hoofdklasse

    public static void main(String[] args) {

        Biertje[] kratBiertjes = new Biertje[4];
        kratBiertjes[0] = new Biertje("La Chouffe", 4);
        kratBiertjes[1] = new Biertje("Texels Schuumkoppe", 6.0);
        kratBiertjes[2] = new Biertje("Leffe Blond", 6.6);
        kratBiertjes[3] = new Biertje("Obilix", 45.0);

        //System.out.println("Bier dat ik lekker vind: " + bierpercentage);
        // enhanced for loop waarin je alleen de biertjes print < 10%
        //for (String bierpercentage : kratBiertjes[]("", 0));
        for (Biertje jojo : kratBiertjes) {
        if (jojo.alcoholPercentage < 9) {
            System.out.println(jojo.naam + " " + jojo.alcoholPercentage);
            }
            //System.out.println("Bier dat ik lekker vind: " + jojo);
        }


    }
}

class Biertje {
    String naam;
    double alcoholPercentage;

    Biertje(String naam, double alcoholPercentage) {
        this.naam = naam;
        this.alcoholPercentage = alcoholPercentage;
    }
}
