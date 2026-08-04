# Magazin Online de Bijuterii 

Java console application — university OOP project (grade: 13/13, maximum score).

## Features
- Product catalog (rings, necklaces, bracelets, earrings)
- Shopping cart with discounts
- Order placement with file persistence (comenzi.txt)
- Payment processing (card / cash on delivery)

## OOP Concepts
- Abstract classes & interfaces (Bijuterie, Utilizator, Platibil, Exportabil)
- Inheritance & polymorphism
- Java Collections, custom exceptions, file I/O

## Design Patterns
- **Factory** — BijuterieFactory (product creation)
- **Strategy** — payment & discount methods
- **Iterator** — shopping cart traversal

## Tech
Java 25 · Maven · Apache NetBeans

## Run

    mvn compile
    java -classpath target/classes com.mycompany.aplc.bijuterii.AplcBijuterii
