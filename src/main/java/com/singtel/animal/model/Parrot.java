package com.singtel.animal.model;


import com.singtel.animal.activities.SoundAbility;
import com.singtel.animal.activities.SingAbility;

/*
Decorator pattern - Runtime behavioural change of parrot

 */
public class Parrot extends FlyingBird implements SingAbility {
    private SoundAbility livesWith;

    public Parrot(SoundAbility livesWith) {
        this.livesWith = livesWith;
    }

    @Override
    public void sing() {
        livesWith.makeSound();
    }

    @Override
    public String getName() {
        return super.getName().concat(" living with ").concat(livesWith.getClass().getSimpleName());
    }
}
