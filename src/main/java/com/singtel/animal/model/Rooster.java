package com.singtel.animal.model;

import com.singtel.animal.activities.SoundAbility;

public class Rooster extends WalkingAnimal implements SoundAbility {

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }
}
