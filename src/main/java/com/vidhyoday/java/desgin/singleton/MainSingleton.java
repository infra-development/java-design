package com.vidhyoday.java.desgin.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        ExampleSingleton instance = ExampleSingleton.getInstance();
        ExampleSingleton instance2 = ExampleSingleton.getInstance();
    }
}
