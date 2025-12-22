package com.vidhyoday.java.design.head.first.factory.stores;

import com.vidhyoday.java.design.head.first.factory.ingredients.NYPizzaIngredientFactory;
import com.vidhyoday.java.design.head.first.factory.ingredients.PizzaIngredientFactory;
import com.vidhyoday.java.design.head.first.factory.pizzas.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        return switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                yield pizza;
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                yield pizza;
            }
            default -> null;
        };
    }

}
