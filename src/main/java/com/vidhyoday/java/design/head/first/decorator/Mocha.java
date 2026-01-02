package com.vidhyoday.java.design.head.first.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        if(beverage == null) {
            return "Mocha";
        } else {
            return beverage.getDescription() + ", Mocha";
        }
    }

    public double cost() {
        // Condiment prices vary by size. Add to wrapped beverage cost.
        if (beverage == null) {
            return priceBySize(0.20, 0.25, 0.30);
        } else {
            return beverage.cost() + priceBySize(0.20, 0.25, 0.30);
        }
    }
}
