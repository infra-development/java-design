package com.vidhyoday.java.design.head.first.factory.ingredients.dough;

public class ThinCrustDough implements Dough {
    @Override
    public String getName() { return "Thin Crust Dough"; }

    @Override
    public String toString() { return getName(); }
}

