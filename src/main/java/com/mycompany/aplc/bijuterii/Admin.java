package com.mycompany.aplc.bijuterii;

public class Admin extends Utilizator {
    private String rol;
    private int nivelAcces;

    public Admin(int id, String nume, String email, String parola, String rol, int nivelAcces) {
        super(id, nume, email, parola);
        this.rol = rol;
        this.nivelAcces = nivelAcces;
    }

    public String getRol() { return rol; }
    public int getNivelAcces() { return nivelAcces; }
    public void setRol(String rol) { this.rol = rol; }
    public void setNivelAcces(int nivelAcces) { this.nivelAcces = nivelAcces; }

    public void adaugaProdus(Bijuterie b) {
        System.out.println("Produs adaugat: " + b.getNume());
    }

    public void stergeProdus(Bijuterie b) {
        System.out.println("Produs sters: " + b.getNume());
    }

    @Override
    public void afisezProfil() {
        System.out.println("=== PROFIL ADMIN ===");
        System.out.println("Nume: " + getNume());
        System.out.println("Email: " + getEmail());
        System.out.println("Rol: " + rol);
        System.out.println("Nivel Acces: " + nivelAcces);
    }
}
