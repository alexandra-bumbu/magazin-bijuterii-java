package com.mycompany.aplc.bijuterii;

public class Colier extends Bijuterie {
    private double lungime;
    private String tipInchizatoare;

    public Colier(int id, String nume, double pret, String material, int stoc, double lungime, String tipInchizatoare) {
        super(id, nume, pret, material, stoc);
        this.lungime = lungime;
        this.tipInchizatoare = tipInchizatoare;
    }
    public Colier(int id, String nume, double pret, String material, int stoc) {
    super(id, nume, pret, material, stoc);
    this.lungime = 45.0;
    this.tipInchizatoare = "Lobster";
}

    public double getLungime() { return lungime; }
    public String getTipInchizatoare() { return tipInchizatoare; }
    public void setLungime(double lungime) { this.lungime = lungime; }
    public void setTipInchizatoare(String tipInchizatoare) { this.tipInchizatoare = tipInchizatoare; }

    @Override
    public String descriere() {
        return "Colier din " + getMaterial() + ", lungime " + lungime + "cm, inchizatoare: " + tipInchizatoare;
    }
}
