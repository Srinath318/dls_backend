package com.example.dirtyLittleSecret.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class dlsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    private String message;

    public dlsModel() {
        // JPA needs a default constructor
    }

    public dlsModel(String message) {
        this.message = message;
    }
}
