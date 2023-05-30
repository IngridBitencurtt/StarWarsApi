package br.com.foguete.swapi.adapter.out;

import br.com.foguete.swapi.adapter.out.dto.PersonDto;
import br.com.foguete.swapi.adapter.out.dto.PlanetsDto;
import br.com.foguete.swapi.adapter.out.dto.SwapiData;
import br.com.foguete.swapi.adapter.out.dto.SwapiData2;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class HttpSwapiAdapterOut implements SwapiPortOut {

    private final RestTemplate restTemplate;

    public HttpSwapiAdapterOut(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    //o método faz uma chamada para a API SWAPI,
    // recupera informações sobre pessoas e
    // retorna uma lista de objetos PersonDto que representam essas pessoas.
    public List<PersonDto> findPeople() {

        ResponseEntity<SwapiData<PersonDto>> exchange = this.restTemplate.exchange("https://swapi.dev/api/people",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});

        return exchange.getBody().getResults();
    }

    @Override
    public SwapiData<PersonDto> findPeople(Integer page) {
        String uriString = UriComponentsBuilder
                .fromHttpUrl("https://swapi.dev/api/people")
                .queryParam("page", page)
                .build()
                .toUriString();

        ResponseEntity<SwapiData<PersonDto>> exchange = this.restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});

        return exchange.getBody();
    }

    @Override
    public PersonDto findPerson(String numberPerson) {
        var link = "https://swapi.dev/api/people/" + numberPerson;
       ResponseEntity<PersonDto> person = this.restTemplate.exchange(link,
                HttpMethod.GET,
                null,   //body e header como n estamos passando nd é null
                PersonDto.class);
        return person.getBody();
    }

    @Override
    public List<PlanetsDto> findPlanets() {
        ResponseEntity<SwapiData<PlanetsDto>> exchange = this.restTemplate.exchange("https://swapi.dev/api/planets",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});

        return exchange.getBody().getResults();

    }

    @Override
    public PlanetsDto findplanet(String planetId) {
        ResponseEntity<PlanetsDto> planet = this.restTemplate.exchange("https://swapi.dev/api/planets/" + planetId,
                HttpMethod.GET,
                null,   //body e header como n estamos passando nd é null
                PlanetsDto.class);
        return planet.getBody();
    }

    @Override
    public SwapiData<PlanetsDto> findPlanet(Integer page) {
        String uriString = UriComponentsBuilder
                .fromHttpUrl("https://swapi.dev/api/planets")
                .queryParam("page", page)
                .build()
                .toUriString();

        ResponseEntity<SwapiData<PlanetsDto>> exchange = this.restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});

        return exchange.getBody();
    }


}
