package br.com.foguete.swapi.adapter.out;

import br.com.foguete.swapi.adapter.out.dto.PersonDto;
import br.com.foguete.swapi.adapter.out.dto.PlanetsDto;
import br.com.foguete.swapi.adapter.out.dto.SwapiData;

import java.util.List;

public interface SwapiPortOut {
    List<PersonDto> findPeople();

    SwapiData<PersonDto> findPeople(Integer page);

    PersonDto findPerson(String numberPerson);

    List<PlanetsDto> findPlanets();

    PlanetsDto findplanet(String planetId);

    SwapiData<PlanetsDto> findPlanet(Integer page);
}
