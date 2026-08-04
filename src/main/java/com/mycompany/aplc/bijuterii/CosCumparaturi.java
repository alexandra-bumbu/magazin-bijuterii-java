package com.mycompany.aplc.bijuterii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CosCumparaturi implements Iterable<Bijuterie> {
    private List<Bijuterie> produse;
    private Client client;

    public CosCumparaturi(Client client) {
        this.client = client;
        this.produse = new ArrayList<>();
    }

    public Client getClient() { return client; }
    public List<Bijuterie> getProduse() { return produse; }

    public void adaugaProdus(Bijuterie b) throws StocInsuficientException, ProdusDuplicatException {
    if (b.getStoc() <= 0) {
        throw new StocInsuficientException("Stoc insuficient pentru: " + b.getNume());
    }
    if (produse.contains(b)) {
        throw new ProdusDuplicatException("Produsul " + b.getNume() + " este deja in cos!");
    }
    produse.add(b);
    System.out.println("Adaugat in cos: " + b.getNume());
}

    public void stergeProdusDinCos(Bijuterie b) {
        produse.remove(b);
        System.out.println("Sters din cos: " + b.getNume());
    }

    public double calculeazaTotal() {
        double total = 0;
        for (Bijuterie b : produse) {
            total += b.calculeazaPret();
        }
        return total;
    }

    public void afisezCos() {
        System.out.println("=== COS CUMPARATURI ===");
        if (produse.isEmpty()) {
            System.out.println("Cosul este gol!");
            return;
        }
        for (Bijuterie b : produse) {
            System.out.println("  - " + b.toString());
        }
        System.out.println("Total: " + calculeazaTotal() + " RON");
    }

    public void golesteCos() {
        produse.clear();
        System.out.println("Cosul a fost golit!");
    }

    @Override
    public Iterator<Bijuterie> iterator() {
        return produse.iterator();
    }
}