package com.mindhub.app_practica2.models.manyTomany;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Pet1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private Set<Person1> persons = new HashSet<>();

    public Pet1() {
    }

    public Pet1(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person1> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person1> persons) {
        this.persons = persons;
    }

    public void addPerson(Person1 person1){
        this.persons.add(person1);
    }
}
