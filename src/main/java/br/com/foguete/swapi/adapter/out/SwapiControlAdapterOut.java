package br.com.foguete.swapi.adapter.out;

import br.com.foguete.swapi.repository.PersonagemControl;
import br.com.foguete.swapi.repository.SwapiRpgRepository;
import org.springframework.stereotype.Service;

@Service
public class SwapiControlAdapterOut implements SwapiControlPortOut {
    private final SwapiRpgRepository swapiRpgRepository;

    public SwapiControlAdapterOut(SwapiRpgRepository swapiRpgRepository){
        this.swapiRpgRepository = swapiRpgRepository;
    }

    @Override
    public void savePersonagem(String id, String name){
        PersonagemControl personagemControl = new PersonagemControl(id, name);
        this.swapiRpgRepository.save(personagemControl);
    }
}
