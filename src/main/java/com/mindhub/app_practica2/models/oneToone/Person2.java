package com.mindhub.app_practica2.models.oneToone;

import jakarta.persistence.*;

@Entity
public class Person2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne()
    private Pet2 pet2;

    public Person2() {
    }

    public Person2(String name) {
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

    public Pet2 getPet2() {
        return pet2;
    }

    public void setPet2(Pet2 pet2) {
        this.pet2 = pet2;
    }
}
