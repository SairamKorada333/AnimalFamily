package com.singtel.animal.model;


import com.singtel.animal.activities.SoundAbility;
import com.singtel.animal.activities.SwimAbility;

public class Duck extends FlyingBird implements SoundAbility, SwimAbility {

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
