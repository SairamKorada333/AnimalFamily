package com.singtel.animal.activities;

public interface SwimAbility extends AnimalAbility {
    default void swim() {
        System.out.println("I am swimming");
    }
}
