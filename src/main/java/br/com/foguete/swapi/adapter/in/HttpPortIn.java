package br.com.foguete.swapi.adapter.in;

import br.com.foguete.swapi.adapter.out.dto.FilmsDto;
import br.com.foguete.swapi.adapter.out.dto.PersonDto;
import br.com.foguete.swapi.adapter.out.dto.PlanetsDto;
import br.com.foguete.swapi.core.SwapiPortIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/swapi/v1")
public class HttpPortIn {
    public final SwapiPortIn swapiPortIn;

    public HttpPortIn(SwapiPortIn swapiPortIn) {
        this.swapiPortIn = swapiPortIn;

    }

    @GetMapping("/people")
    public ResponseEntity <List<PersonDto>> findPeople(){
        List<PersonDto> people = this.swapiPortIn.findPeople();

        return ResponseEntity.ok(people);
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<PersonDto> findPerson(@PathVariable("personId") String personId){
        PersonDto person = this.swapiPortIn.findPerson(personId);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/person-name")
    public ResponseEntity<List<String>> findPeopleName(){
        List<String> peopleName = this.swapiPortIn.findPeopleName();
        return ResponseEntity.ok(peopleName);
    }


    @GetMapping("/planets")
    public ResponseEntity <List<PlanetsDto>> findPlanets(){

        List<PlanetsDto> planets = this.swapiPortIn.findPlanets();

        return ResponseEntity.ok(planets);
    }


    @GetMapping("/planet/{planetId}")
    public ResponseEntity<PlanetsDto> findplanets(@PathVariable("planetId") String planetId){
        PlanetsDto planet = this.swapiPortIn.findplanet(planetId);
        return ResponseEntity.ok(planet);
    }

    @GetMapping("/planets-name")
    public ResponseEntity<List<String>> findPlanetNames() {
        List<String> planets = this.swapiPortIn.findPlanetsName();
        return ResponseEntity.ok(planets);
    }


@GetMapping("/films")
    public ResponseEntity<List<FilmsDto>> findFilms(){
    List<FilmsDto> films = this.swapiPortIn.findFilms();

    return ResponseEntity.ok(films);



}
@PostMapping("/sync-names")
    public ResponseEntity<Void> syncNames(){
        this.swapiPortIn.syncNames();
        return ResponseEntity.noContent().build();
}

    @PostMapping("/sync-names-dice")
    public ResponseEntity<Void> syncNamesDice(){
        this.swapiPortIn.syncNamesDice();
        return ResponseEntity.noContent().build();
    }

}
