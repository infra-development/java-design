package com.vidhyoday.java.design.head.first.factory.ingredients.dough;

public class ThickCrustDough implements Dough {
    @Override
    public String getName() { return "Thick Crust Dough"; }

    @Override
    public String toString() { return getName(); }
}

