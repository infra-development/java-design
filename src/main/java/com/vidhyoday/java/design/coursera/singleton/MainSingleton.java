package com.vidhyoday.java.design.coursera.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        ExampleSingleton instance = ExampleSingleton.getInstance();
        ExampleSingleton instance2 = ExampleSingleton.getInstance();
    }
}
