package com.singtel.animal.service;

import com.singtel.animal.activities.AnimalAbility;
import com.singtel.animal.model.*;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    private List<Animal> animals = new ArrayList<>();

    public AnimalService() {
        Animal[] animalTypes = new Animal[]{
                new Cat(),
                new Dog(),
                new Butterfly(),
                new Caterpillar(),
                new Chicken(),
                new Rooster(),
                new ClownFish(),
                new Dolphin(),
                new Duck(),
                new Parrot(new Dog()),
                new Parrot(new Cat()),
                new Parrot(new Rooster()),
                new Shark()
        };
        animals.addAll(Arrays.asList(animalTypes));
    }

    public int count(Class<? extends AnimalAbility> activity) {
        return (int) animals.stream().filter(activity::isInstance).count();
    }

    public List<String> listAnimals(Class<? extends AnimalAbility> activity) {
        return animals.stream().filter(activity::isInstance).map(Animal::getName)
                .collect(Collectors.toList());
    }

    public List<String> listAnimals() {
        return animals.stream().map(Animal::getName).collect(Collectors.toList());
    }

}
