package br.com.foguete.swapi.adapter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
@Component
public class RpgConfig {
    @Value("${rpgProject.host}")
    private String host;

    @Value("${rpgProject.path.random}")
    private String randomPath;

    @Value("${rpgProject.path.random-dice}")
    private String randomDicePath;

    @Value("${rpgProject.playerId}")
    private String playerId;


    public String getRandomPath(){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(randomPath)
                .build()
                .toUriString();
    }

    public String getRandomDicePath(){
        return UriComponentsBuilder
                .fromHttpUrl(host)
                .path(randomDicePath)
                .build()
                .toUriString();
    }

    public String getPlayerId(){
        return playerId;
    }
}
