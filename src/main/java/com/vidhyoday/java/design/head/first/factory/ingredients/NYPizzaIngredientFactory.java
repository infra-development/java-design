package com.vidhyoday.java.design.head.first.factory.ingredients;

import com.vidhyoday.java.design.head.first.factory.ingredients.dough.Dough;
import com.vidhyoday.java.design.head.first.factory.ingredients.dough.ThinCrustDough;
import com.vidhyoday.java.design.head.first.factory.ingredients.sauce.Sauce;
import com.vidhyoday.java.design.head.first.factory.ingredients.sauce.MarinaraSauce;
import com.vidhyoday.java.design.head.first.factory.ingredients.cheese.Cheese;
import com.vidhyoday.java.design.head.first.factory.ingredients.cheese.ReggianoCheese;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Veggies;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Garlic;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Onion;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Mushroom;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.RedPepper;
import com.vidhyoday.java.design.head.first.factory.ingredients.pepperoni.Pepperoni;
import com.vidhyoday.java.design.head.first.factory.ingredients.pepperoni.SlicedPepperoni;
import com.vidhyoday.java.design.head.first.factory.ingredients.clams.Clams;
import com.vidhyoday.java.design.head.first.factory.ingredients.clams.FreshClams;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        Dough dough = new ThinCrustDough();
        System.out.println("Creating "+dough.getName());
        return dough;
    }

    @Override
    public Sauce createSauce() {
        Sauce sauce = new MarinaraSauce();
        System.out.println("Creating "+sauce.getName());
        return sauce;
    }

    @Override
    public Cheese createCheese() {
        Cheese cheese = new ReggianoCheese();
        System.out.println("Creating "+cheese.getName());
        return cheese;
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        for (Veggies veg : veggies) {
            System.out.println("Creating "+veg.getName());
        }
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        Pepperoni pepperoni = new SlicedPepperoni();
        System.out.println("Creating "+pepperoni.getName());
        return pepperoni;
    }

    @Override
    public Clams createClam() {
        Clams clams = new FreshClams();
        System.out.println("Creating "+clams.getName());
        return clams;
    }
}
