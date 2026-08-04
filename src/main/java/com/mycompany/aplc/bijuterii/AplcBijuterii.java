package com.mycompany.aplc.bijuterii;

import java.util.Scanner;

public class AplcBijuterii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optiune;

        do {
            System.out.println("\n=== MAGAZIN BIJUTERII ===");
            System.out.println("1. Afiseaza produse");
            System.out.println("2. Adauga produs in cos");
            System.out.println("3. Plaseaza comanda");
            System.out.println("4. Proceseaza plata");
            System.out.println("5. Salveaza stoc in fisier");
            System.out.println("0. Iesire");
            System.out.print("Alege optiunea: ");
            optiune = scanner.nextInt();

            switch (optiune) {
                case 1:
                    Bijuterie b1 = BijuterieFactory.creazaBijuterie("inel", 1, "Inel Aur", 500.0, "Aur", 10);
                    Bijuterie b2 = BijuterieFactory.creazaBijuterie("colier", 2, "Colier Argint", 300.0, "Argint", 5);
                    Bijuterie b3 = BijuterieFactory.creazaBijuterie("bratara", 3, "Bratara Aur", 400.0, "Aur", 8);
                    System.out.println(b1.toString());
                    System.out.println(b2.toString());
                    System.out.println(b3.toString());
                    break;

                case 2:
                    Client client = new Client(1, "Ana Pop", "ana@email.com", "1234", "Str. Florilor 5", "0722111222");
                    CosCumparaturi cos = new CosCumparaturi(client);
                    Bijuterie produs = BijuterieFactory.creazaBijuterie("cercei", 4, "Cercei Aur", 250.0, "Aur", 3);
                    try {
                        cos.adaugaProdus(produs);
                        cos.afisezCos();
                    } catch (StocInsuficientException e) {
                        System.out.println("EROARE STOC: " + e.getMessage());
                    } catch (ProdusDuplicatException e) {
                        System.out.println("EROARE DUPLICAT: " + e.getMessage());
                    }
                    break;

                case 3:
                    Client client2 = new Client(2, "Maria Ion", "maria@email.com", "5678", "Str. Rozelor 10", "0733222333");
                    Comanda comanda = new Comanda(1, client2, "23.05.2026");
                    Bijuterie prod = BijuterieFactory.creazaBijuterie("inel", 5, "Inel Platina", 800.0, "Platina", 2);
                    try {
                        comanda.adaugaProdus(prod);
                        comanda.afisezComanda();
                    } catch (ComandaInvalidaException e) {
                        System.out.println("EROARE COMANDA: " + e.getMessage());
                    }
                    break;

                case 4:
                    MetodaPlata card = new CardStrategy("**** **** **** 1234");
                    card.plateste(500.0);
                    MetodaPlata ramburs = new RambursStrategy();
                    ramburs.plateste(300.0);
                    break;

                case 5:
                    Client clientF = new Client(3, "Ion Popescu", "ion@email.com", "pass", "Str. Mare 1", "0744333444");
                    Comanda comandaF = new Comanda(99, clientF, "23.05.2026");
                    Bijuterie prodF = BijuterieFactory.creazaBijuterie("inel", 9, "Inel Aur 18k", 750.0, "Aur", 5);
                    try {
                        comandaF.adaugaProdus(prodF);
                        comandaF.salveazaInFisier("comenzi.txt");
                    } catch (ComandaInvalidaException e) {
                        System.out.println("EROARE COMANDA: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("La revedere!");
                    break;

                default:
                    System.out.println("Optiune invalida!");
            }
        } while (optiune != 0);

        scanner.close();
    }
}
