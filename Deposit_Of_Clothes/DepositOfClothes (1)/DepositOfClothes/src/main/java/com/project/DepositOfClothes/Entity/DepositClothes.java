package com.project.DepositOfClothes.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class DepositClothes {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;

    private  String name;

    private String description;

    private double price;

    public DepositClothes(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public DepositClothes() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
