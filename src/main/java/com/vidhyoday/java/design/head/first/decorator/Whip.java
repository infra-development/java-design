package com.vidhyoday.java.design.head.first.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        if (beverage == null) {
            return "Whip";
        } else {
            return beverage.getDescription() + ", Whip";
        }
    }

    @Override
    public double cost() {
        // Condiment prices vary by size
        if (beverage == null) {
            return priceBySize(0.10, 0.15, 0.20);
        } else {
            return beverage.cost() + priceBySize(0.10, 0.15, 0.20);
        }
    }
}
