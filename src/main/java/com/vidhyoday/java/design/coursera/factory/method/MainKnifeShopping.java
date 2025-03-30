package com.vidhyoday.java.design.coursera.factory.method;

public class MainKnifeShopping {
    public static void main(String[] args) {
        KnifeStore knifeStore = new BudgetKnifeStore();
        knifeStore.orderKnife("steak");
        knifeStore.orderKnife("chefs");
    }
}
