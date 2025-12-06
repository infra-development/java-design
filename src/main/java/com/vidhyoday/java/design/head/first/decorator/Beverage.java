package com.vidhyoday.java.design.head.first.decorator;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}
    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description + " " + Size.valueOf(this.size.name());
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
