package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Service;

import java.util.UUID;


public class Student {
    //private variable can not be found
    //but encapsulate requires us to take var as private
    //we can use getters and setters
    private UUID id;
    private String name;

    public Student(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    //when serialize, we not take name
    //@JsonIgnore
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
