package com.company;

import java.util.*;

public class Speelsteen {
    public int waarde;
    public int aantalWormen;

    public Speelsteen(int waarde, int wormen){
        this.waarde = waarde;
        this.aantalWormen = wormen;
    }

    public int giveWaarde(){
        return this.waarde;
    }

    public int giveWormen(){
        return this.aantalWormen;
    }

}
