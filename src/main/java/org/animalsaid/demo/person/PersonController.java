package org.animalsaid.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public List getAllPersons(){
        return personService.getAllpersons();
    }
@GetMapping("/allpersons/{id}")
    public Optional<Person> getPersonById(@PathVariable long id){
        return personService.getPersonById(id);
    }
}
