package com.vidhyoday.java.design.head.first.factory.ingredients;

import com.vidhyoday.java.design.head.first.factory.ingredients.dough.Dough;
import com.vidhyoday.java.design.head.first.factory.ingredients.sauce.Sauce;
import com.vidhyoday.java.design.head.first.factory.ingredients.cheese.Cheese;
import com.vidhyoday.java.design.head.first.factory.ingredients.veggies.Veggies;
import com.vidhyoday.java.design.head.first.factory.ingredients.pepperoni.Pepperoni;
import com.vidhyoday.java.design.head.first.factory.ingredients.clams.Clams;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
