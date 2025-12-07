package com.vidhyoday.java.design.head.first.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        // Condiment prices vary by size
        return beverage.cost() + priceBySize(0.10, 0.15, 0.20);
    }
}
