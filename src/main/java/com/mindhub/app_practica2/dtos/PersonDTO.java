package com.mindhub.app_practica2.dtos;

import com.mindhub.app_practica2.models.Person;

import java.util.List;

public class PersonDTO {

    private final Long id;

    private String name, email;

    private List<PetDTO> pets;

    public PersonDTO(Person person){
        id = person.getId();
        name = person.getName();
        email= person.getEmail();
        pets = person // Objeto tipo Person
                .getPets() // Set<Pet>
                .stream() // Stream<Pet>
                .map( pet -> new PetDTO(pet) ) // Stream<PetDTO>
                .toList(); // List<PetDTO>
    }

    public Long getId() {
        return id;
    }

    public String getPepito() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<PetDTO> getPets() {
        return pets;
    }
}
