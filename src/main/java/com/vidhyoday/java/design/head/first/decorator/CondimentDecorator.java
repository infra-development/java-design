package com.vidhyoday.java.design.head.first.decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    // Delegate size operations to the wrapped beverage so the size is a single source of truth
    @Override
    public void setSize(Size size) {
        if (beverage != null) {
            beverage.setSize(size);
        } else {
            super.setSize(size);
        }
    }

    @Override
    public Size getSize() {
        if (beverage != null) {
            return beverage.getSize();
        }
        return super.getSize();
    }
}