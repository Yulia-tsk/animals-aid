package org.animalsaid.demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
@Query("select p from Person p where p.id = ?1")
    Person findPersonByPersonID(long id);

//@Modifying
//    @Query("update person p set p.isActive = ?1 where p.id = ?2")
//    int setFixedActiveFor(long id);



}
