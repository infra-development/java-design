package com.vidhyoday.java.design.head.first.factory.ingredients;

import com.vidhyoday.java.design.head.first.factory.ingredients.dough.Dough;
import com.vidhyoday.java.design.head.first.factory.ingredients.dough.ThickCrustDough;
import com.vidhyoday.java.design.head.first.factory.ingredients.sauce.Sauce;
import com.vidhyoday.java.design.head.first.factory.ingredients.sauce.PlumTomatoSauce;
import com.vidhyoday.java.design.head.first.factory.ingredients.cheese.Cheese;
import com.vidhyoday.java.design.head.first.factory.ingredients.cheese.MozzarellaCheese;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Veggies;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.BlackOlives;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Spinach;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Eggplant;
import com.vidhyoday.java.design.head.first.factory.ingredients.pepperoni.Pepperoni;
import com.vidhyoday.java.design.head.first.factory.ingredients.pepperoni.SlicedPepperoni;
import com.vidhyoday.java.design.head.first.factory.ingredients.clams.Clams;
import com.vidhyoday.java.design.head.first.factory.ingredients.clams.FrozenClams;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        Dough dough = new ThickCrustDough();
        System.out.println("Creating "+dough.getName());
        return dough;
    }

    @Override
    public Sauce createSauce() {
        Sauce sauce = new PlumTomatoSauce();
        System.out.println("Creating "+sauce.getName());
        return sauce;
    }

    @Override
    public Cheese createCheese() {
        Cheese cheese = new MozzarellaCheese();
        System.out.println("Creating "+cheese.getName());
        return cheese;
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{ new BlackOlives(), new Spinach(), new Eggplant() };
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
        Clams clams = new FrozenClams();
        System.out.println("Creating "+clams.getName());
        return clams;
    }
}
