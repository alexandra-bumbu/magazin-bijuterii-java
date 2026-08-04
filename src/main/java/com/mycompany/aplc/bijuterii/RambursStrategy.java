package com.mycompany.aplc.bijuterii;

public class RambursStrategy implements MetodaPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " RON se va efectua la livrare (ramburs)!");
    }
}
