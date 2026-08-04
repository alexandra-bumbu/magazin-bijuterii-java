package com.mycompany.aplc.bijuterii;

public class Inel extends Bijuterie {
    private String marime;
    private boolean eLogodna;

    public Inel(int id, String nume, double pret, String material, int stoc, String marime, boolean eLogodna) {
        super(id, nume, pret, material, stoc);
        this.marime = marime;
        this.eLogodna = eLogodna;
    }
    public Inel(int id, String nume, double pret, String material, int stoc) {
    super(id, nume, pret, material, stoc);
    this.marime = "M";
    this.eLogodna = false;
}

    public String getMarime() { return marime; }
    public boolean isELogodna() { return eLogodna; }
    public void setMarime(String marime) { this.marime = marime; }
    public void setELogodna(boolean eLogodna) { this.eLogodna = eLogodna; }

    @Override
    public String descriere() {
        return "Inel din " + getMaterial() + ", marime " + marime + (eLogodna ? " (logodna)" : "");
    }
}
