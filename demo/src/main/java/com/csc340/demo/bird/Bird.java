package com.csc340.demo.bird;

import jakarta.persistence.*;


@Entity
@Table(name = "birds")
public class Bird {

    public Bird() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int birdId;

    private String name;

    private String description;

    private String species;

    private String color;


    public Bird(int birdId, String name, String description, String species, String color) {
        this.birdId = birdId;
        this.name = name;
        this.description = description;
        this.species = species;
        this.color = color;

    }

    public int getBirdId() {
        return birdId;
    }

    public void setBirdId(int birdId) {
        this.birdId = birdId;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}




