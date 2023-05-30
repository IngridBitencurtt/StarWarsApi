package br.com.foguete.swapi.adapter.out.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PlanetsDto {

    private String name;
    private String diameter;
    private String rotationPeriod;
    private String orbitalPeriod;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surfaceWater;
    private List<String> residents;
    private List<String> films;
    private String url;
    private String created;
    private String edited;



    public String getName() {
        return name;
    }

    public PlanetsDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDiameter() {
        return diameter;
    }

    public PlanetsDto setDiameter(String diameter) {
        this.diameter = diameter;
        return this;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public PlanetsDto setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public PlanetsDto setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        return this;
    }

    public String getGravity() {
        return gravity;
    }

    public PlanetsDto setGravity(String gravity) {
        this.gravity = gravity;
        return this;
    }

    public String getPopulation() {
        return population;
    }

    public PlanetsDto setPopulation(String population) {
        this.population = population;
        return this;
    }

    public String getClimate() {
        return climate;
    }

    public PlanetsDto setClimate(String climate) {
        this.climate = climate;
        return this;
    }

    public String getTerrain() {
        return terrain;
    }

    public PlanetsDto setTerrain(String terrain) {
        this.terrain = terrain;
        return this;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public PlanetsDto setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
        return this;
    }

    public List<String> getResidents() {
        return residents;
    }

    public PlanetsDto setResidents(List<String> residents) {
        this.residents = residents;
        return this;
    }

    public List<String> getFilms() {
        return films;
    }

    public PlanetsDto setFilms(List<String> films) {
        this.films = films;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PlanetsDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public PlanetsDto setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getEdited() {
        return edited;
    }

    public PlanetsDto setEdited(String edited) {
        this.edited = edited;
        return this;
    }
}
