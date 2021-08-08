package org.animalsaid.demo.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public List<Animal> getAll(){

        return animalService.getAllAnimals() ;
    }

    @PostMapping
    public void addAnimal(Animal animal){
        animalService.addAnimal(animal);
    }
   }
