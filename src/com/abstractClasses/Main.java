package com.abstractClasses;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("bubba");
        Parrot parrot = new Parrot("Tweety");
        Penguin peng = new Penguin("Pingu");
        dog.breathe();
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        dog.eat();
        peng.eat();
        peng.fly();
    }
}
