package br.com.foguete.swapi.adapter.out.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Date;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)

public class FilmsDto {
    private String title;
    private Integer episodeId;
    private String openingCrawl;
    private String producer;
    private Date releaseDate;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> characters;
    private List<String> planets;
    private String url;
    private String created;
    private String edited;

    public String getTitle() {
        return title;
    }

    public FilmsDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public FilmsDto setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
        return this;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public FilmsDto setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public FilmsDto setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public FilmsDto setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public List<String> getSpecies() {
        return species;
    }

    public FilmsDto setSpecies(List<String> species) {
        this.species = species;
        return this;
    }

    public List<String> getStarships() {
        return starships;
    }

    public FilmsDto setStarships(List<String> starships) {
        this.starships = starships;
        return this;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public FilmsDto setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public FilmsDto setCharacters(List<String> characters) {
        this.characters = characters;
        return this;
    }

    public List<String> getPlanets() {
        return planets;
    }

    public FilmsDto setPlanets(List<String> planets) {
        this.planets = planets;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FilmsDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public FilmsDto setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getEdited() {
        return edited;
    }

    public FilmsDto setEdited(String edited) {
        this.edited = edited;
        return this;
    }
}
