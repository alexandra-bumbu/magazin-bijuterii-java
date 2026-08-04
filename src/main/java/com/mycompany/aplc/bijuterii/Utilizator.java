package com.mycompany.aplc.bijuterii;

public abstract class Utilizator {
    private int id;
    private String nume;
    private String email;
    private String parola;

    public Utilizator(int id, String nume, String email, String parola) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.parola = parola;
    }

    public int getId() { return id; }
    public String getNume() { return nume; }
    public String getEmail() { return email; }
    public String getParola() { return parola; }

    public void setId(int id) { this.id = id; }
    public void setNume(String nume) { this.nume = nume; }
    public void setEmail(String email) { this.email = email; }
    public void setParola(String parola) { this.parola = parola; }

    public boolean autentificare(String emailIntro, String parolaIntro) {
        return this.email.equals(emailIntro) && this.parola.equals(parolaIntro);
    }

    public abstract void afisezProfil();

    @Override
    public String toString() {
        return "ID: " + id + " | " + nume + " | " + email;
    }
}