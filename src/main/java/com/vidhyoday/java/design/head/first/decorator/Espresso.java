package com.vidhyoday.java.design.head.first.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        // Prices: TALL, GRANDE, VENTI
        return priceBySize(1.99, 2.49, 2.99);
    }
}
