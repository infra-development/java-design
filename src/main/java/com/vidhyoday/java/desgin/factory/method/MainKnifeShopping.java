package com.vidhyoday.java.desgin.factory.method;

public class MainKnifeShopping {
    public static void main(String[] args) {
        KnifeStore knifeStore = new BudgetKnifeStore();
        knifeStore.createKnife("steak");
        knifeStore.createKnife("chefs");
    }
}
