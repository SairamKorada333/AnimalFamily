package com.singtel.animal.activities;

public interface WalkAbility extends AnimalAbility {
    default void walk() {
        System.out.println("I am walking");
    }
}
