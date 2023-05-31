package br.com.foguete.swapi.core;

import br.com.foguete.swapi.adapter.out.dto.FilmsDto;
import br.com.foguete.swapi.adapter.out.dto.PersonDto;
import br.com.foguete.swapi.adapter.out.dto.PlanetsDto;

import java.util.List;

public interface SwapiPortIn {
    List<PersonDto> findPeople();
    PersonDto findPerson(String numberPerson);

    List<PlanetsDto> findPlanets();

    PlanetsDto findplanet(String planetId);

    List<String> findPlanetsName();

    List<String> findPeopleName();

    List<FilmsDto> findFilms();
}
