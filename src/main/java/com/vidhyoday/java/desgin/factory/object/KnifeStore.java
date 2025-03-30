package com.vidhyoday.java.desgin.factory.object;

public class KnifeStore {
    private KnifeFactory factory;

    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife = factory.createKnife(knifeType);
        knife.sharpenKnife();
        knife.polishKnife();
        knife.packageKnife();
        return knife;
    }
}
