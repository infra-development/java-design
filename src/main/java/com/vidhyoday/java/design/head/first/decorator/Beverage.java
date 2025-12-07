package com.vidhyoday.java.design.head.first.decorator;

public abstract class Beverage {
    // moved Size to its own top-level enum (Size.java)
    Size size = Size.TALL;

    String description = "Unknown Beverage";

    // Return just the beverage description (without size). Size-aware printing is done by clients.
    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    // Helper to pick the correct price based on size. Use getSize() so decorators that delegate size work.
    protected double priceBySize(double tallPrice, double grandePrice, double ventiPrice) {
        return switch (getSize()) {
            case GRANDE -> grandePrice;
            case VENTI -> ventiPrice;
            default -> tallPrice;
        };
    }

    public abstract double cost();
}
