package br.com.foguete.swapi.adapter.out.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PersonDto {

    private String name;
    private String birthYear;
    private String eyeColor;
    private String gender;
    private String hairColor;
    private String height;
    private String mass;
    private String skinColor;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> starships;

    private List<String> vehicles;
    private String uri;
    private String created;
    private String edited;

    public String getName() {
        return name;
    }

    public PersonDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public PersonDto setBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public PersonDto setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public PersonDto setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getHairColor() {
        return hairColor;
    }

    public PersonDto setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public PersonDto setHeight(String height) {
        this.height = height;
        return this;
    }

    public String getMass() {
        return mass;
    }

    public PersonDto setMass(String mass) {
        this.mass = mass;
        return this;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public PersonDto setSkinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public PersonDto setHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    public List<String> getFilms() {
        return films;
    }

    public PersonDto setFilms(List<String> films) {
        this.films = films;
        return this;
    }

    public List<String> getSpecies() {
        return species;
    }

    public PersonDto setSpecies(List<String> species) {
        this.species = species;
        return this;
    }

    public List<String> getStarships() {
        return starships;
    }

    public PersonDto setStarships(List<String> starships) {
        this.starships = starships;
        return this;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public PersonDto setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public PersonDto setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public PersonDto setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getEdited() {
        return edited;
    }

    public PersonDto setEdited(String edited) {
        this.edited = edited;
        return this;
    }
}