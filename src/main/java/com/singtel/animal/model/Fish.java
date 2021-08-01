package com.singtel.animal.model;


import com.singtel.animal.activities.SwimAbility;
import com.singtel.animal.activities.FishAbility;

public abstract class Fish implements Animal, SwimAbility, FishAbility {
    private String size;
    private String colour;

    public Fish(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }
}
