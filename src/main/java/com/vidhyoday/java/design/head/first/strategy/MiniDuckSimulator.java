package com.vidhyoday.java.design.head.first.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.performSwim();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.setQuackBehavior(new Quack());
        model.performFly();
    }
}
