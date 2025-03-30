package com.vidhyoday.java.design.coursera.singleton;

public class ExampleSingleton {

    private static ExampleSingleton instance = null;

    private ExampleSingleton() {
        System.out.println("Creating new instance");
    }

    public static ExampleSingleton getInstance() {
        if (instance == null) {
            instance = new ExampleSingleton();
        } else {
            System.out.println("Using existing instance");
        }
        return instance;
    }
}
