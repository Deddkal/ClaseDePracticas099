package com.mindhub.app_practica2.models.manyTomany;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Person1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "persons")
    private Set<Pet1> pets = new HashSet<>();

    public Person1() {
    }

    public Person1(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pet1> getPets() {
        return pets;
    }

    public void addPet(Pet1 pet1){
        pet1.addPerson(this);
        pets.add(pet1);
    }
}
