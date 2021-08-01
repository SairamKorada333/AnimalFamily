package com.singtel.animal.activities;

public interface FlyAbility extends AnimalAbility {

    default void fly() {
        System.out.println("I am flying");
    }
}
