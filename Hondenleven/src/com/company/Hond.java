package com.company;

public class Hond extends Vierpotige {
    public String ras;
    public String naam;
    public int leeftijd;
    public Baasje baasje;
    private int brokjesOp;
    final int verkoopPrijs;

    Hond(String ras, String naam, int leeftijd, Baasje eigenaar) {
        this.ras = ras;
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.baasje = eigenaar;
        this.brokjesOp = 0;
        this.verkoopPrijs=12;
    }

    String getBlaffen() {
        if (this.ras.equals("Bordercollie")) {
            String geluid = "waffies, waffies";
            return geluid;
        } else {
            String geluid = "blaffies";
            return geluid;
        }
    }

    public int brokjesVragen() {
        return 0;
    }

    public int brokjesEten(int brokjesGevoerd) {
        int brokjesEten = brokjesGevoerd;
        this.brokjesOp = this.brokjesOp + brokjesEten;
        if (this.brokjesOp >= 10){
           kwispelen(true);
        }
        return brokjesEten;
    }

    public int getAantalBrokjes() {
        return this.brokjesOp;
    }

    public void kwispelen(boolean blijZijn) {
        boolean kwispelen;
        kwispelen = blijZijn;
        if (kwispelen = true) {
            System.out.println(this.naam + " Kwispelt");
        }
    }
}