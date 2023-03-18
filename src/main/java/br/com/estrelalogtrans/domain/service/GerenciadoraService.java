package br.com.estrelalogtrans.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estrelalogtrans.domain.model.Gerenciadora;
import br.com.estrelalogtrans.domain.repository.GerenciadoraRepository;

@Service
public class GerenciadoraService {
    @Autowired
    private GerenciadoraRepository repository;

    public List<Gerenciadora> findAll() {
        return repository.findAll();
    }

    public Gerenciadora findById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Gerenciadora não encontrada!"));
    }

    public Gerenciadora create(Gerenciadora gerenciadora) {
        return repository.save(gerenciadora);
    }

    public Gerenciadora update(String id, Gerenciadora gerenciadora) {
        var finded = this.findById(id);
        gerenciadora.setId(finded.getId());
        return repository.save(gerenciadora);
    }

    public void deleteById(String id) {
        var finded = this.findById(id);
        repository.delete(finded);
    }
}
