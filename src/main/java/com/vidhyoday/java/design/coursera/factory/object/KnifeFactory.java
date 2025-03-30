package com.vidhyoday.java.design.coursera.factory.object;

public class KnifeFactory {

    public Knife createKnife(String knifeType) {
        Knife knife = null;
        if (knifeType.equals("steak")) {
            knife = new ChefsKnife();
        } else if (knifeType.equals("chefs")) {
            knife = new SteakKnife();
        }
        return knife;
    }
}
