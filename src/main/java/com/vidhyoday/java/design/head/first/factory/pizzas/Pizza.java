package com.vidhyoday.java.design.head.first.factory.pizzas;

import com.vidhyoday.java.design.head.first.factory.ingredients.cheese.Cheese;
import com.vidhyoday.java.design.head.first.factory.ingredients.clams.Clams;
import com.vidhyoday.java.design.head.first.factory.ingredients.dough.Dough;
import com.vidhyoday.java.design.head.first.factory.ingredients.pepperoni.Pepperoni;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Veggies;
import com.vidhyoday.java.design.head.first.factory.ingredients.sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
