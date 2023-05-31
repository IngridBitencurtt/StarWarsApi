package br.com.foguete.swapi.adapter.out;

import br.com.foguete.swapi.adapter.config.SwapConfig;
import br.com.foguete.swapi.adapter.out.dto.FilmsDto;
import br.com.foguete.swapi.adapter.out.dto.PersonDto;
import br.com.foguete.swapi.adapter.out.dto.PlanetsDto;
import br.com.foguete.swapi.adapter.out.dto.SwapiData;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class HttpSwapiAdapterOut implements SwapiPortOut {

    private final RestTemplate restTemplate;
    private final SwapConfig swapConfig;

    public HttpSwapiAdapterOut(RestTemplateBuilder restTemplateBuilder, SwapConfig swapConfig) {
        this.restTemplate = restTemplateBuilder.build();
        this.swapConfig = swapConfig;
    }

    @Override
    public List<PersonDto> findPeople() {
        String uriString = swapConfig.getPeopleUri();
        ResponseEntity<SwapiData<PersonDto>> exchange = restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        return exchange.getBody().getResults();
    }

    @Override
    public SwapiData<PersonDto> findPeople(Integer page) {
        String uriString = swapConfig.getPeopleWithPage(page);
        ResponseEntity<SwapiData<PersonDto>> response = this.restTemplate
                .exchange(uriString,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<>() {
                        });

        return response.getBody();
    }

    @Override
    public PersonDto findPerson(String numberPerson) {
        var uriString = swapConfig.getPeoplePathById(numberPerson);
        ResponseEntity<PersonDto> person = this.restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,   //body e header como n estamos passando nd é null
                PersonDto.class);
        return person.getBody();
    }

    @Override
    public List<PlanetsDto> findPlanets() {

        var uriString = swapConfig.getPlanetsUri();

        ResponseEntity<SwapiData<PlanetsDto>> exchange = this.restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        return exchange.getBody().getResults();

    }

    @Override
    public PlanetsDto findplanet(String planetId) {
        var uriString = swapConfig.getPlanetsById(planetId);
        ResponseEntity<PlanetsDto> planet = this.restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,   //body e header como n estamos passando nd é null
                PlanetsDto.class);
        return planet.getBody();
    }

    @Override
    public SwapiData<PlanetsDto> findPlanet(Integer page) {
        var uriString = swapConfig.getPlanetsWithPage(page);

        ResponseEntity<SwapiData<PlanetsDto>> exchange = this.restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        return exchange.getBody();
    }

    @Override
    public List<FilmsDto> findFilms() {
        String uriString = swapConfig.getFilmsUri();
        ResponseEntity<SwapiData<FilmsDto>> exchange = restTemplate.exchange(uriString,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});

        return exchange.getBody().getResults();
    }


}
