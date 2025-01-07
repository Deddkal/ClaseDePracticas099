package com.mindhub.app_practica2.repositories;

import com.mindhub.app_practica2.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

//    List<Person> findByEmail(String email);

//    Person findByAge(String age);

    boolean existsByEmail(String email);

    int countByEmail(String email);


}
