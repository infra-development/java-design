package com.vidhyoday.java.design.head.first.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        // Base prices for different sizes
        return priceBySize(0.89, 1.09, 1.29);
    }
}
