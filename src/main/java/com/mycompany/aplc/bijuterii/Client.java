package com.mycompany.aplc.bijuterii;

public class Client extends Utilizator {
    private String adresa;
    private String telefon;
    private double puncteLoyalty;

    public Client(int id, String nume, String email, String parola, String adresa, String telefon) {
        super(id, nume, email, parola);
        this.adresa = adresa;
        this.telefon = telefon;
        this.puncteLoyalty = 0;
    }

    public String getAdresa() { return adresa; }
    public String getTelefon() { return telefon; }
    public double getPuncteLoyalty() { return puncteLoyalty; }
    public void setAdresa(String adresa) { this.adresa = adresa; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
    public void adaugaPuncte(double puncte) { this.puncteLoyalty += puncte; }

    @Override
    public void afisezProfil() {
        System.out.println("=== PROFIL CLIENT ===");
        System.out.println("Nume: " + getNume());
        System.out.println("Email: " + getEmail());
        System.out.println("Adresa: " + adresa);
        System.out.println("Telefon: " + telefon);
        System.out.println("Puncte Loyalty: " + puncteLoyalty);
    }
}