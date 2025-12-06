package com.vidhyoday.java.design.head.first.decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
