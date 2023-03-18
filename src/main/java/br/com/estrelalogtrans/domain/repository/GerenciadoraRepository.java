package br.com.estrelalogtrans.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.estrelalogtrans.domain.model.Gerenciadora;

public interface GerenciadoraRepository extends MongoRepository<Gerenciadora, String> { }
