package org.animalsaid.demo.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    public AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAllAnimals(){
        List<Animal> animals = new ArrayList<>();
        animalRepository.findAll().forEach(animals::add);
        return animals;
    }

    public List<Animal> getAnimalByPersonId(long id) {
        List<Animal> animalsPerson = new ArrayList<>();
        animalRepository.findAnimalByPersonId(id).forEach(animalsPerson::add);
        return animalsPerson;
    }

    public void addAnimal(Animal animal){
        animalRepository.save(animal);
    }
}
