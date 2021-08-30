package org.animalsaid.demo.animals;

import org.animalsaid.demo.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals")
    public List<Animal> getAll(){

        return animalService.getAllAnimals() ;
    }
    @GetMapping("/persons/{personId}/animals")
    public List<Animal> getAnimalsById(@PathVariable long personId) {
        return animalService.getAnimalByPersonId(personId);
    }

    @PostMapping("persons/{personId}/animals")
    public Animal addAnimal(@RequestBody Animal animal, @PathVariable long personId){
        animal.setPerson(new Person(personId, ""));
       return  animalService.addAnimal(animal);
    }
   }
