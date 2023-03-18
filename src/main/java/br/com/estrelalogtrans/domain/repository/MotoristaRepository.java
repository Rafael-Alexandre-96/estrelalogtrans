package br.com.estrelalogtrans.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.estrelalogtrans.domain.model.Motorista;

public interface MotoristaRepository extends MongoRepository<Motorista, String> { }
