package com.singtel.animal.service;

import com.singtel.animal.activities.SingAbility;
import com.singtel.animal.activities.SwimAbility;
import com.singtel.animal.activities.WalkAbility;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalServiceTest {

    private AnimalService animalService = new AnimalService();

    @Test
    public void test_animals_which_can_walk() {
        List<String> walkingAnimals = animalService.listAnimals(WalkAbility.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"Cat", "Caterpillar", "Chicken", "Dog",
                "Duck", "Parrot living with Cat", "Parrot living with Dog",
                "Parrot living with Rooster", "Rooster"};

        assertEquals(Arrays.asList(animalNames), walkingAnimals);

    }

    @Test
    public void test_count_animals_which_can_walk() {
        int count = animalService.count(WalkAbility.class);
        assertEquals(9, count);
    }

    @Test
    public void test_animals_which_can_swim() {
        List<String> walkingAnimals = animalService.listAnimals(SwimAbility.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"ClownFish", "Dolphin", "Duck", "Shark"};

        assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }

    @Test
    public void test_animals_which_can_sing() {
        List<String> walkingAnimals = animalService.listAnimals(SingAbility.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"Parrot living with Cat", "Parrot living with Dog",
                "Parrot living with Rooster"};

        assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }
}
