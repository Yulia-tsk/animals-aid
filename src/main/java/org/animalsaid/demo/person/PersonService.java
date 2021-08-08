package org.animalsaid.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List getAllpersons(){

        List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public void addNewPerson(@RequestBody Person person){
        personRepository.save(person);
    }

    public Optional<Person> getPersonById(long id) {
        Optional<Person> person =  personRepository.findById(id);
        return person;

    }
}
