package com.mycompany.aplc.bijuterii;

public class Plata {
    private int id;
    private Comanda comanda;
    private double suma;
    private String metoda;
    private String status;
    private String data;

    public Plata(int id, Comanda comanda, double suma, String metoda, String data) {
        this.id = id;
        this.comanda = comanda;
        this.suma = suma;
        this.metoda = metoda;
        this.data = data;
        this.status = "In asteptare";
    }

    public int getId() { return id; }
    public Comanda getComanda() { return comanda; }
    public double getSuma() { return suma; }
    public String getMetoda() { return metoda; }
    public String getStatus() { return status; }
    public String getData() { return data; }
    public void setStatus(String status) { this.status = status; }

    public void proceseazaPlata() {
        if (suma <= 0) {
            System.out.println("Suma invalida!");
            status = "Esuata";
            return;
        }
        status = "Finalizata";
        System.out.println("Plata de " + suma + " RON prin " + metoda + " a fost procesata cu succes!");
    }

    public void afisezPlata() {
        System.out.println("=== PLATA #" + id + " ===");
        System.out.println("Comanda: #" + comanda.getId());
        System.out.println("Suma: " + suma + " RON");
        System.out.println("Metoda: " + metoda);
        System.out.println("Status: " + status);
        System.out.println("Data: " + data);
    }
}
