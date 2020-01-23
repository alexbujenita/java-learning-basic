package com.abstractClasses;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("aaaa chirp");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " it's flapping its wings");
    }
}
