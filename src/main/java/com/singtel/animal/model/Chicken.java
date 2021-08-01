package com.singtel.animal.model;


import com.singtel.animal.activities.SoundAbility;

public class Chicken extends WalkingAnimal implements SoundAbility {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

}
