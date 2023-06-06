package br.com.foguete.swapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SwapiRpgRepository extends MongoRepository<PersonagemControl, String> {
}
