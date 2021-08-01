package com.singtel.animal.model;

public class Shark extends Fish {

    public Shark() {
        super("Large", "Grey");
    }

    @Override
    public void act() {
        System.out.println("I eat fish");
    }
}
