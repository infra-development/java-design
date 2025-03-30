package com.vidhyoday.java.design.head.first.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeack");
    }
}
