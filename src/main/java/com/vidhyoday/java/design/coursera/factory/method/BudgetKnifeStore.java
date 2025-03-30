package com.vidhyoday.java.design.coursera.factory.method;

public class BudgetKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        if (knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
            return new BudgetChefsKnife();
        } else {
            return null;
        }
    }
}
