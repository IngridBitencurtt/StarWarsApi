package br.com.foguete.swapi.adapter.out;

import br.com.foguete.swapi.adapter.config.RpgConfig;
import br.com.foguete.swapi.adapter.out.dto.NameDto;
import br.com.foguete.swapi.adapter.out.dto.PersonagemId;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HttpRpgAdapterOut implements RpgPortOut {

    private final RestTemplate restTemplate;

    private final RpgConfig rpgConfig;

    public HttpRpgAdapterOut(RestTemplateBuilder restTemplateBuilder, RpgConfig rpgConfig) {
        this.restTemplate = restTemplateBuilder.build();
        this.rpgConfig = rpgConfig;
    }

    @Override
    public String randomPersonagem (String person){
        String randomPath = this.rpgConfig.getRandomPath();

        HttpHeaders headers = new HttpHeaders();
        headers.add("player-id", this.rpgConfig.getPlayerId());
        headers.setContentType(MediaType.APPLICATION_JSON);

        NameDto nameDto =  new NameDto().setName(person);

        HttpEntity<NameDto> entity = new HttpEntity<>(nameDto, headers);

        ResponseEntity<PersonagemId> personagemIdResponseEntity =
                this.restTemplate.exchange(randomPath,
                        HttpMethod.POST,
                        entity,
                        PersonagemId.class);

        return  personagemIdResponseEntity.getBody().getId();
    }

    @Override
    public String randomPersonagemDice (String person){
        String randomPath = this.rpgConfig.getRandomDicePath();

        HttpHeaders headers = new HttpHeaders();
        headers.add("player-id", this.rpgConfig.getPlayerId());
        headers.setContentType(MediaType.APPLICATION_JSON);

        NameDto nameDto =  new NameDto().setName(person);

        HttpEntity<NameDto> entity = new HttpEntity<>(nameDto, headers);

        ResponseEntity<PersonagemId> personagemIdResponseEntity =
                this.restTemplate.exchange(randomPath,
                        HttpMethod.POST,
                        entity,
                        PersonagemId.class);

        return  personagemIdResponseEntity.getBody().getId();
    }


}
