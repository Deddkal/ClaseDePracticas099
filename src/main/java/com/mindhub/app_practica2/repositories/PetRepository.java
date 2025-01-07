package com.mindhub.app_practica2.repositories;

import com.mindhub.app_practica2.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PetRepository extends JpaRepository<Pet, UUID> {
}
