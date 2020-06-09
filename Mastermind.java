package com.company;
import org.w3c.dom.ls.LSOutput;
// Mastermind versie 0.1

import java.util.*;  // Import Library

public class Main { // Hoofdklasse

    static char[] lijstLetters = new char[6];
    static char[] letters = new char[6];

    public static void main(String[] args) {
    lettersKloppen();
    lijstLettersRandom();
    //Randomletter();

    }

    static void lettersKloppen(){
        System.out.println("Geef je invoer: 6 letters (a t/m f)");
        Scanner scanner = new Scanner(System.in);
        String invoer = scanner.nextLine();

        //String invoer = "abcdfe";
        letters = invoer.toCharArray();
        //System.out.println(letters);
        //System.out.println(lijstLetters);

    }

    //static void Randomletter() {

        //Random r = new Random();

        //String alphabet = "abcdef";
        //for (int i = 0; i < 6; i++) {
            //char willekeur = alphabet.charAt(r.nextInt(6));
            //System.out.println("willekeur in RandomLetter: " + willekeur);
            //lijstLettersRandom(willekeur);
       // }

    //}

    static void lijstLettersRandom() {
        //char lettersgekregen = letter;
        // System.out.println("deze komt uit de andere void: " + lettersgekregen);
        String alfabet = "abcdef";
        //char[] lijstLetters = new char[6];

        Random r = new Random();
        for (int i = 0; i < 6; i++){
            char willekeur = alfabet.charAt(r.nextInt(6));
            lijstLetters[i] = willekeur;
        }

        //System.out.println("Letter1: " + lijstLetters[1] + " Letter 2: " + lijstLetters[2]);
        System.out.println(lijstLetters);
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
        if (lijstLetters[4] == letters[4]) {
            System.out.println("de vijfde letter klopt! en was " + letters[4]);
        }
        if (lijstLetters[5] == letters[5]) {
            System.out.println("de zesde letter klopt! en was " + letters[5]);
        }
        //System.out.println(letters);
    }

        // Code[] nieuweCode = new Code[6];
        //nieuweCode[1] = alphabet.charAt(r.nextInt(6));
        //System.out.println("de eerste letter van de Code: " + Code[1]);

}

class Code {
    char letter;
    //double alcoholPercentage;

    Code(char naam) {
        this.letter = naam;
    }
}
