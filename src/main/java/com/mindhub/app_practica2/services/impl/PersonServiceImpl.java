package com.mindhub.app_practica2.services.impl;

import com.mindhub.app_practica2.dtos.NewPerson;
import com.mindhub.app_practica2.dtos.PersonDTO;
import com.mindhub.app_practica2.exceptions.UserNotFoundException;
import com.mindhub.app_practica2.models.Person;
import com.mindhub.app_practica2.repositories.PersonRepository;
import com.mindhub.app_practica2.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    //PetService

    @Override
    public PersonDTO getPersonDTOById(Long id) throws UserNotFoundException {
        return new PersonDTO(getPersonById(id));
    }

    @Override
    public Person getPersonById(Long id) throws UserNotFoundException {
        return personRepository.findById(id).orElseThrow( () -> new UserNotFoundException("No se encontro el usuario"));
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void createnewPerson(NewPerson newPerson) {
        validatePerson(newPerson);
        Person person = new Person(newPerson.name(), newPerson.email());
        savePerson(person);
    }

    public void validatePerson(NewPerson newPerson){

    }
}
