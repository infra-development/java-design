package com.vidhyoday.java.design.head.first.factory.pizzas;

import com.vidhyoday.java.design.head.first.factory.ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
