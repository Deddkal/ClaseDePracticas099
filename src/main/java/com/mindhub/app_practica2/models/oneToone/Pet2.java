package com.mindhub.app_practica2.models.oneToone;

import jakarta.persistence.*;

@Entity
public class Pet2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne()
    private Person2 person2;

    public Pet2() {
    }

    public Pet2(String name) {
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

    public Person2 getPerson2() {
        return person2;
    }

    public void setPerson2(Person2 person2) {
        this.person2 = person2;
    }
}
