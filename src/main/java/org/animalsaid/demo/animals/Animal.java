package org.animalsaid.demo.animals;

import org.animalsaid.demo.person.Person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    private String description;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate birthDate;
    private String photo;

    private boolean isVisible = false;

    @ManyToOne(targetEntity = Person.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Animal() {
    }

    public Animal(long id, String name, String description, Gender gender, LocalDate birthDate, String photo, boolean isVisible) {
        this.id = id;

        this.name = name;
        this.description = description;
        this.gender = gender;
        this.birthDate = birthDate;
        this.photo = photo;
        this.isVisible = isVisible;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                 ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}

enum Gender {
    MALE, FEMALE
}

