package br.com.foguete.swapi.core;

import br.com.foguete.swapi.adapter.out.HttpRpgAdapterOut;
import br.com.foguete.swapi.adapter.out.SwapiControlPortOut;
import br.com.foguete.swapi.adapter.out.SwapiPortOut;
import br.com.foguete.swapi.adapter.out.dto.FilmsDto;
import br.com.foguete.swapi.adapter.out.dto.PersonDto;
import br.com.foguete.swapi.adapter.out.dto.PlanetsDto;
import br.com.foguete.swapi.adapter.out.dto.SwapiData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class SwapiCore implements SwapiPortIn {

    private final SwapiPortOut swapiPortOut;
    private  final HttpRpgAdapterOut rpgPortOut;
    private  final SwapiControlPortOut swapiControlPortOut;

    public SwapiCore(SwapiPortOut swapiPortOut, HttpRpgAdapterOut rpgPortOut, SwapiControlPortOut swapiControlPortOut) {
        this.swapiPortOut = swapiPortOut;
        this.rpgPortOut = rpgPortOut;
        this.swapiControlPortOut = swapiControlPortOut;
    }

    @Override
    public List<PersonDto> findPeople() {

        return this.swapiPortOut.findPeople();
    }

    @Override
    public PersonDto findPerson(String numberPerson) {

        return this.swapiPortOut.findPerson(numberPerson);
    }

    @Override
    public List<PlanetsDto> findPlanets() {
        return this.swapiPortOut.findPlanets();
    }

    @Override
    public PlanetsDto findplanet(String planetId) {

        return this.swapiPortOut.findplanet(planetId);
    }


    @Override
    public List<String> findPlanetsName() {
        Integer page = 1;
        SwapiData<PlanetsDto> swapiData;
        List<String> planetsName = new ArrayList<>();

        do {
            System.out.println(page);
            swapiData = this.swapiPortOut.findPlanet(page);

            for (PlanetsDto planetsDto : swapiData.getResults()) {
                planetsName.add((planetsDto.getName()));
            }
            page++;
        } while (!isNull(swapiData.getNext()));

        return planetsName;
    }

    @Override
    public List<String> findPeopleName() {
        Integer page = 1;
        SwapiData<PersonDto> swapiData;
        List<String> peopleName = new ArrayList<>();

        do {
            System.out.println(page);
            swapiData = this.swapiPortOut.findPeople(page);

            for (PersonDto personDto : swapiData.getResults()) {
                peopleName.add((personDto.getName()));
            }
            page++;
        } while (!isNull(swapiData.getNext()));

        return peopleName;
    }

    @Override
    public List<FilmsDto> findFilms() {
        return this.swapiPortOut.findFilms();

    }

    @Override
    public void syncNames() {
        List<String> peopleName = this.findPeopleName();

        peopleName.forEach(person ->{
            String personagemId = this.rpgPortOut.randomPersonagem(person);

            this.swapiControlPortOut.savePersonagem(personagemId, person);
        });
    }

    @Override
    public void syncNamesDice() {
        List<String> peopleName = this.findPeopleName();

        peopleName.forEach(person ->{
            String personagemId = this.rpgPortOut.randomPersonagemDice(person);

            this.swapiControlPortOut.savePersonagem(personagemId, person);
        });
    }
}
