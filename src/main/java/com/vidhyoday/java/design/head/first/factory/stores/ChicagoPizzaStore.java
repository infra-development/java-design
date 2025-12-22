package com.vidhyoday.java.design.head.first.factory.stores;

import com.vidhyoday.java.design.head.first.factory.ingredients.ChicagoPizzaIngredientFactory;
import com.vidhyoday.java.design.head.first.factory.ingredients.PizzaIngredientFactory;
import com.vidhyoday.java.design.head.first.factory.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        pizza = switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                yield pizza;
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                yield pizza;
            }
            default -> pizza;
        };
        return pizza;
    }
}
