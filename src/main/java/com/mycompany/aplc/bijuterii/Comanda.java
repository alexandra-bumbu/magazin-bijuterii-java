package com.mycompany.aplc.bijuterii;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int id;
    private Client client;
    private List<Bijuterie> produse;
    private String status;
    private String data;
    private double total;

    public Comanda(int id, Client client, String data) {
        this.id = id;
        this.client = client;
        this.data = data;
        this.status = "In procesare";
        this.produse = new ArrayList<>();
        this.total = 0;
    }

    public int getId() { return id; }
    public Client getClient() { return client; }
    public List<Bijuterie> getProduse() { return produse; }
    public String getStatus() { return status; }
    public String getData() { return data; }
    public double getTotal() { return total; }
    public void setStatus(String status) { this.status = status; }

    public void adaugaProdus(Bijuterie b) throws ComandaInvalidaException {
    if (b == null) {
        throw new ComandaInvalidaException("Produsul nu poate fi null!");
    }
    if (b.getPret() <= 0) {
        throw new ComandaInvalidaException("Pretul produsului este invalid!");
    }
    produse.add(b);
    total += b.calculeazaPret();
}

    public void afisezComanda() {
        System.out.println("=== COMANDA #" + id + " ===");
        System.out.println("Client: " + client.getNume());
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
        System.out.println("Produse:");
        for (Bijuterie b : produse) {
            System.out.println("  - " + b.toString());
        }
        System.out.println("Total: " + total + " RON");
    }
    public void salveazaInFisier(String numeFisier) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter(numeFisier, true);
        fw.write("Comanda #" + id + " | Client: " + client.getNume() + " | Total: " + total + " RON | Status: " + status + "\n");
        for (Bijuterie b : produse) {
            fw.write("  - " + b.toString() + "\n");
        }
        fw.write("---\n");
        fw.close();
        System.out.println("Comanda salvata in " + numeFisier);
    } catch (Exception e) {
        System.out.println("Eroare la salvare: " + e.getMessage());
    }
}
}
