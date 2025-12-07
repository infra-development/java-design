package com.vidhyoday.java.design.head.first.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        // Condiment prices vary by size. Add to wrapped beverage cost.
        return beverage.cost() + priceBySize(0.20, 0.25, 0.30);
    }
}
