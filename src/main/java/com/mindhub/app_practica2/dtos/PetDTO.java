package com.mindhub.app_practica2.dtos;

import com.mindhub.app_practica2.models.Pet;

import java.util.UUID;

public class PetDTO {

    private UUID id;

    private String name;

    public PetDTO(Pet pet){
        id = pet.getId();
        name = pet.getName();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
