package com.mindhub.app_practica2.controllers;

import com.mindhub.app_practica2.dtos.NewPerson;
import com.mindhub.app_practica2.dtos.PersonDTO;
import com.mindhub.app_practica2.exceptions.UserNotFoundException;
import com.mindhub.app_practica2.models.Person;
import com.mindhub.app_practica2.repositories.PersonRepository;
import com.mindhub.app_practica2.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public PersonDTO getPersonById(@PathVariable Long id) throws UserNotFoundException {
        return personService.getPersonDTOById(id);
    }

    @PostMapping
    public ResponseEntity<?> createPerson(@RequestBody NewPerson newPerson){

        if(newPerson.name().isBlank()){
            return new ResponseEntity<>("El nombre no puede estar en blanco", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Se creo la persona", HttpStatus.CREATED);
    }
}
