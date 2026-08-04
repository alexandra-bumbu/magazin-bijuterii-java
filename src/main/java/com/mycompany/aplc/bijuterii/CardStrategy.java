package com.mycompany.aplc.bijuterii;

public class CardStrategy implements MetodaPlata {
    private String numarCard;

    public CardStrategy(String numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " RON efectuata cu cardul: " + numarCard);
    }
}
