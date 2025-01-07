package com.mindhub.app_practica2.services;

import com.mindhub.app_practica2.dtos.NewPerson;
import com.mindhub.app_practica2.dtos.PersonDTO;
import com.mindhub.app_practica2.exceptions.UserNotFoundException;
import com.mindhub.app_practica2.models.Person;

public interface PersonService {

    PersonDTO getPersonDTOById(Long id) throws UserNotFoundException;
    Person getPersonById(Long id) throws UserNotFoundException;

    Person savePerson(Person person);

    void createnewPerson(NewPerson newPerson);
}
