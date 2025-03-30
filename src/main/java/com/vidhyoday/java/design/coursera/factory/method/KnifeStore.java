package com.vidhyoday.java.design.coursera.factory.method;

abstract public class KnifeStore {

    public Knife orderKnife(String knifeType) {
        Knife knife = createKnife(knifeType);

        knife.sharpenKnife();
        knife.polishKnife();
        knife.sharpenKnife();
        return knife;
    }

    abstract public Knife createKnife(String knifeType);

}
