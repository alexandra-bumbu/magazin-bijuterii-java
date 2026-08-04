package com.mycompany.aplc.bijuterii;

public class BijuterieFactory {
    
    public static Bijuterie creazaBijuterie(String tip, int id, String nume, double pret, String material, int stoc) {
        switch (tip.toLowerCase()) {
            case "inel":
                return new Inel(id, nume, pret, material, stoc, "M", false);
            case "colier":
                return new Colier(id, nume, pret, material, stoc, 45.0, "Lobster");
            case "bratara":
                return new Bratara(id, nume, pret, material, stoc, 6.0, "Charm");
            case "cercei":
                return new Cercei(id, nume, pret, material, stoc, "Clips", true);
            default:
                System.out.println("Tip bijuterie necunoscut!");
                return null;
        }
    }
}
