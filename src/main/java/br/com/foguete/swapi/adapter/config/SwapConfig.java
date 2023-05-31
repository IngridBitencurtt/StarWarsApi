package br.com.foguete.swapi.adapter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;

@Configuration
public class SwapConfig {

    @Value("${swapi.host}")
    private String host;

    @Value("${swapi.paths.people}")
    private String peoplePath;

    @Value("${swapi.paths.planets}")
    private String planetsPath;

    @Value("${swapi.paths.films}")
    private String filmsPath;

    public String getPeopleUri(){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(peoplePath)
                .build()
                .toUriString();
    }

    public String getPeoplePathById(String id){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(peoplePath)
                .path(id)
                .build()
                .toUriString();
    }

    public String getPeopleWithPage(Integer page){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(peoplePath)
                .queryParam("page", page)
                .build()
                .toUriString();
    }

    public String getPlanetsUri(){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(planetsPath)
                .build()
                .toUriString();
    }

    public String getPlanetsWithPage(Integer page){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(planetsPath)
                .queryParam("page", page)
                .build()
                .toUriString();
    }

    public String getPlanetsById(String id){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(planetsPath)
                .path(id)
                .build()
                .toUriString();
    }

    public String getFilmsUri(){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(filmsPath)
                .build()
                .toUriString();
    }




}
