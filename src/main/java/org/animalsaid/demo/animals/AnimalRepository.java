package org.animalsaid.demo.animals;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

    public List<Animal> findAnimalByPersonId(long personId);
}
