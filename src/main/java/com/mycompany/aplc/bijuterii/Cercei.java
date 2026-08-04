package com.mycompany.aplc.bijuterii;

public class Cercei extends Bijuterie {
    private String tipPrindere;
    private boolean suntPereche;

    public Cercei(int id, String nume, double pret, String material, int stoc, String tipPrindere, boolean suntPereche) {
        super(id, nume, pret, material, stoc);
        this.tipPrindere = tipPrindere;
        this.suntPereche = suntPereche;
    }
    public Cercei(int id, String nume, double pret, String material, int stoc) {
    super(id, nume, pret, material, stoc);
    this.tipPrindere = "Clips";
    this.suntPereche = true;
}

    public String getTipPrindere() { return tipPrindere; }
    public boolean isSuntPereche() { return suntPereche; }
    public void setTipPrindere(String tipPrindere) { this.tipPrindere = tipPrindere; }
    public void setSuntPereche(boolean suntPereche) { this.suntPereche = suntPereche; }

    @Override
    public String descriere() {
        return "Cercei din " + getMaterial() + ", prindere: " + tipPrindere + (suntPereche ? " (pereche)" : " (individual)");
    }
}
