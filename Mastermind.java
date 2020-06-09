package com.company;
import org.w3c.dom.ls.LSOutput;
// Mastermind versie 0.3

import java.sql.SQLOutput;
import java.util.*;  // Import Library

public class Main { // Hoofdklasse

    static char[] lijstLetters = new char[4];
    static char[] letters = new char[4];
    static String doorgeven = "abcd";

    public static void main(String[] args) {
        lijstLettersRandom();
        while (true) {
            lettersKloppen();
            checkRun();
        }


    }

    static void lettersKloppen() {
        System.out.println("Raad de code: 4 letters (a t/m f)");
        Scanner scanner = new Scanner(System.in);
        String invoer = scanner.nextLine();
        letters = invoer.toCharArray();
    }


    static void lijstLettersRandom() {

        String alfabet = "abcdef";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            char willekeur = alfabet.charAt(r.nextInt(6));
            lijstLetters[i] = willekeur;
        }

        System.out.println(lijstLetters);
        doorgeven = String.valueOf(lijstLetters);
    }

    static void checkRun() {

        if (lijstLetters[0] == letters[0] && lijstLetters[1] == letters[1] && lijstLetters[2] == letters[2] && lijstLetters[3] == letters[3]) {
            System.out.println("********** Gewonnen! **********");
            System.out.println("De juiste codecombinatie was : " + doorgeven);
            System.exit(0);
        }
        if (lijstLetters[0] == letters[0]) {
            System.out.println("de eerste letter klopt! en was " + letters[0]);
        }
        if (lijstLetters[1] == letters[1]) {
            System.out.println("de tweede letter klopt! en was " + letters[1]);
        }
        if (lijstLetters[2] == letters[2]) {
            System.out.println("de derde letter klopt! en was " + letters[2]);
        }
        if (lijstLetters[3] == letters[3]) {
            System.out.println("de vierde letter klopt! en was " + letters[3]);
        }
    }
}
        // Code[] nieuweCode = new Code[6];
        //nieuweCode[1] = alphabet.charAt(r.nextInt(6));
        //System.out.println("de eerste letter van de Code: " + Code[1]);



//class Code {
    //char letter;
    //double alcoholPercentage;

    //Code(char naam) {
        //this.letter = naam;
   // }
//}
