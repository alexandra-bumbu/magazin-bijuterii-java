package com.mycompany.aplc.bijuterii;

public class Bratara extends Bijuterie {
    private double diametru;
    private String tip;

    public Bratara(int id, String nume, double pret, String material, int stoc, double diametru, String tip) {
        super(id, nume, pret, material, stoc);
        this.diametru = diametru;
        this.tip = tip;
    }
    public Bratara(int id, String nume, double pret, String material, int stoc) {
    super(id, nume, pret, material, stoc);
    this.diametru = 6.0;
    this.tip = "Charm";
}

    public double getDiametru() { return diametru; }
    public String getTip() { return tip; }
    public void setDiametru(double diametru) { this.diametru = diametru; }
    public void setTip(String tip) { this.tip = tip; }

    @Override
    public String descriere() {
        return "Bratara din " + getMaterial() + ", diametru " + diametru + "cm, tip: " + tip;
    }
}
