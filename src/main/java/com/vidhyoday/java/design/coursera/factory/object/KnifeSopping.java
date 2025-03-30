package com.vidhyoday.java.design.coursera.factory.object;

public class KnifeSopping {
    public static void main(String[] args) {
        KnifeFactory knifeFactory = new KnifeFactory();
        KnifeStore knifeStore = new KnifeStore(knifeFactory);
        knifeStore.orderKnife("steak");
    }
}
