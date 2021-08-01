package com.singtel.animal.controller;

import com.singtel.animal.service.AnimalService;
import com.singtel.animal.util.AnimalActivityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animalFamily")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals")
    public List<String> listAnimals() {
            return animalService.listAnimals();
    }

    @GetMapping("/animals/{activity}")
    public List<String> getAnimals(@PathVariable String activity) {
            return animalService.listAnimals(AnimalActivityFactory.getActivity(activity));
    }

    @GetMapping("/animals/{activity}/count")
    public Integer count(@PathVariable String activity) {
            return animalService.count(AnimalActivityFactory.getActivity(activity));
    }
}
