package com.mycompany.aplc.bijuterii;

public class Livrare {
    private int id;
    private Comanda comanda;
    private String adresaLivrare;
    private String curier;
    private String termen;
    private String status;
    private double costLivrare;

    public Livrare(int id, Comanda comanda, String adresaLivrare, String curier, String termen, double costLivrare) {
        this.id = id;
        this.comanda = comanda;
        this.adresaLivrare = adresaLivrare;
        this.curier = curier;
        this.termen = termen;
        this.costLivrare = costLivrare;
        this.status = "Pregatita";
    }

    public int getId() { return id; }
    public Comanda getComanda() { return comanda; }
    public String getAdresaLivrare() { return adresaLivrare; }
    public String getCurier() { return curier; }
    public String getTermen() { return termen; }
    public String getStatus() { return status; }
    public double getCostLivrare() { return costLivrare; }
    public void setStatus(String status) { this.status = status; }
    public void setAdresaLivrare(String adresaLivrare) { this.adresaLivrare = adresaLivrare; }

    public void trimiteColet() {
        status = "Trimisa";
        System.out.println("Coletul a fost trimis prin " + curier + " la adresa: " + adresaLivrare);
    }

    public void afisezLivrare() {
        System.out.println("=== LIVRARE #" + id + " ===");
        System.out.println("Comanda: #" + comanda.getId());
        System.out.println("Adresa: " + adresaLivrare);
        System.out.println("Curier: " + curier);
        System.out.println("Termen: " + termen);
        System.out.println("Cost livrare: " + costLivrare + " RON");
        System.out.println("Status: " + status);
    }
}
