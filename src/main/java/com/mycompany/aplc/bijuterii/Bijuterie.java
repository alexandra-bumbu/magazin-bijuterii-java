package com.mycompany.aplc.bijuterii;

public abstract class Bijuterie implements Platibil {
    private int id;
    private String nume;
    private double pret;
    private String material;
    private int stoc;

    public Bijuterie(int id, String nume, double pret, String material, int stoc) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.material = material;
        this.stoc = stoc;
    }

    public int getId() { return id; }
    public String getNume() { return nume; }
    public double getPret() { return pret; }
    public String getMaterial() { return material; }
    public int getStoc() { return stoc; }

    public void setId(int id) { this.id = id; }
    public void setNume(String nume) { this.nume = nume; }
    public void setPret(double pret) { this.pret = pret; }
    public void setMaterial(String material) { this.material = material; }
    public void setStoc(int stoc) { this.stoc = stoc; }

    @Override
    public double calculeazaPret() { return pret; }

    @Override
    public double aplicaDiscount(double procent) {
        return pret - (pret * procent / 100);
    }

    public abstract String descriere();

    @Override
    public String toString() {
        return "ID: " + id + " | " + nume + " | " + material + " | " + pret + " RON | Stoc: " + stoc;
    }
}
