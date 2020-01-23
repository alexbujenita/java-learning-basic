package com.abstractClasses;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Calling super from " + this);
        super.fly();
        System.out.println("Calling internal from " + this);
        System.out.println("Not very good at that");

    }
}
