package com.company;
import org.w3c.dom.ls.LSOutput;
// Mastermind versie 1.0

import java.sql.SQLOutput;
import java.util.*;  // Import Library

public class Main { // Hoofdklasse

    static char[] codeComputer = new char[4];
    static char[] codeMens = new char[4];
    static String doorgeven = "abcd";

    public static void main(String[] args) {
        System.out.println("** MASTERMIND - Caspar Steinebach **");
        System.out.println("toets 'q' om het spel te verlaten");

        lijstLettersRandom();

        while (true) {
            lettersKloppen();
            checkRun();
        }
    }

    static void lijstLettersRandom() {                      // Deze methode laat de computer een code genereren.

        String alfabet = "abcdef";                          // Dit zijn de beschikbare letters.

        Random r = new Random();                            // een nieuwe randomgeneratoer wordt aangemaakt met de naam 'r'.
        for (int i = 0; i < 4; i++) {                       // forloop om een dobbelsteen te gooien.
            char willekeur = alfabet.charAt(r.nextInt(6));  // willekeurig karakter uit de string alfabet (uit die 6 karaters) wordt gekozen.
            codeComputer[i] = willekeur;                    // karakters worden in de charArray 'codeComputer' gestopt.
        }
        //System.out.println(codeComputer);
        doorgeven = String.valueOf(codeComputer);           // 'codeComputer' wordt omgezet in een string en opgeslagen in de string 'doorgeven'
    }

    static void lettersKloppen() {                          //deze methode laat de gebruiker letters intoetsen en slaat ze op in een Array
        System.out.println("-------------------------------------");
        System.out.println("Voer je code in: 4 letters (a t/m f)");
        Scanner scanner = new Scanner(System.in);
        String invoer = scanner.nextLine();
        if (invoer.equals("q")){                            // Als de gebruiker 'q' intoetst dan eindigt het spel
            System.out.print("Bedankt en tot ziens!");
            System.exit(0);
        }
        codeMens = invoer.toCharArray();                    // De string invoer wordt in losse leters omgezet en in de charArray 'codeMens' gezet. Om later weer te gebruiken als het spel over is. (zie regel 67).
    }

    static void checkRun() {                                // deze methode checkt op juiste letters op de juiste plek

        int lettersJuistePlek = 0;                         // Een int wordt aangemaakt die als teller genereert om de gebruiker te laten weten hoeveel letters op de juiste plek staan.
        int goedeLettersOnjuistePlek = 0;                  // Een int wordt aangemaakt die als teller genereert om de gebruiker te laten weten hoeveel letters op de juiste plek staan.


        for (int i = 0; i < 4; i++) {                       // Forloop om door de verschillende lettercombinaties te lopen en te checken of
            if (codeComputer[i] == codeMens[i]) {           // de combinatie klopt. Als die klopt heeft de speler de code gekraakt.
                lettersJuistePlek += 1;                     // Bij elke goede letter gaat de teller 1 omhoog.
            }
        }
            if (lettersJuistePlek == 4) {                        // Als de teller op '4' staat dan heeft de speler alle letters goed geraden en
                System.out.println("********** Gewonnen! **********"); // is de code gekraakt. Een felicitatie valt de speler ten deel.
                System.out.println("De juiste codecombinatie was : " + doorgeven);
                System.exit(0);                                 // Het spel is afgelopen en wordt automatisch afgesloten.
            }

            lettersJuistePlek = 0;                              // Als niet alle letters goed zijn, dan betekent dat dat de code niet gekraakt is.
                                                                // In dat geval wordt de teller weer op '0' gezet en worden de cijfers opnieuw
            if (codeComputer[0] == codeMens[0]) {               // met elkaar vergeleken. Hier de eerste letter.
                lettersJuistePlek += 1;                         // Teller 'lettersJuistePlek' gaat 1 omhoog als die klopt
            } else {                                            // Als de eerste letter niet overeenkomst gaan we kijen of hij vaker voorkomt
                for (int i = 0; i < 4; i++) {
                    if (codeComputer[i] == codeMens[0]) {       // hij wordt veregeleken met andere letters
                        goedeLettersOnjuistePlek += 1;          // als die ergens op een andere plek voorkomt dan wordt de teller met 1 verhoogt
                    }
                }
            }

            if (codeComputer[1] == codeMens[1]) {               // Hier de tweede letter.
                lettersJuistePlek += 1;                          // Teller 'lettersJuistePlek' gaat 1 omhoog als die klopt
            } else {
                for (int i = 0; i < 4; i++) {                   // Als de eerste letter niet overeenkomst gaan we kijen of hij vaker voorkomt
                    if (codeComputer[i] == codeMens[1]) {
                        goedeLettersOnjuistePlek += 1;
                    }
                }
            }

            if (codeComputer[2] == codeMens[2]) {               // Hier de derde letter
                lettersJuistePlek += 1;                         // Teller 'lettersJuistePlek' gaat 1 omhoog als die klopt
            } else {
                for (int i = 0; i < 4; i++) {
                    if (codeComputer[i] == codeMens[2]) {
                        goedeLettersOnjuistePlek += 1;
                    }
                }
            }

            if (codeComputer[3] == codeMens[3]) {               // Hier de vierde letter
                lettersJuistePlek += 1;                          // Teller 'lettersJuistePlek' gaat 1 omhoog als die klopt
            } else {
                for (int i = 0; i < 4; i++) {
                    if (codeComputer[i] == codeMens[3]) {
                        goedeLettersOnjuistePlek += 1;
                    }
                }
            }

            System.out.println("Aantal letters op de juiste plek: " + lettersJuistePlek); // Een print van hoeveel letters er op de juiste plek staan.
            System.out.println("Aantal goede letters op een onjuiste plek: " + goedeLettersOnjuistePlek); // Een print wordt gemaakt van hoeveel letters er voorkomend zijn maar niet op de juiste plek staan.
        }
    }

/* Mastermind

De opdracht
Programmeer het spel Mastermind tegen de computer, waarbij je gebruik maakt van Object Oriented Programming. Hieronder staat het spelverloop uitgelegd.

Spelverloop
De computer kiest random vier letters uit de verzameling {a, b, c, d, e, f}. De gekozen rij wordt verder “code” genoemd.
De volgorde is van belang; een letter mag vaker voorkomen.
De gebruiker moet de verborgen code proberen te achterhalen.
De gebruiker geeft een code van vier letters op.
De computer geeft een reactie op de ingegeven code, door te antwoorden met:
-> het aantal correcte letters die op de juiste plaats staan
-> het aantal correcte letters dat NIET op de juiste plaats staat
De gebruiker geeft nu een nieuwe code op, gebaseerd op deze nieuwe informatie.

Als alle vier letters op de juiste plaats staan, is de code gekraakt en het spel ten einde.
Een lopend spel kan worden beëindigd door het invoeren van een q; alle andere invoer moet ofwel correct zijn (dus in de verzameling voorkomen), ofwel resulteren in opnieuw bevragen van de gebruiker
*/
