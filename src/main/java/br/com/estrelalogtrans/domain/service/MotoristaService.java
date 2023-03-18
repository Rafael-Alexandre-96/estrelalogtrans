package br.com.estrelalogtrans.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estrelalogtrans.domain.model.Motorista;
import br.com.estrelalogtrans.domain.model.composition.Consulta;
import br.com.estrelalogtrans.domain.repository.MotoristaRepository;

@Service
public class MotoristaService {
    @Autowired
    private MotoristaRepository repository;

    @Autowired
    private GerenciadoraService gerenciadoraService;

    public List<Motorista> findAll() {
        return repository.findAll();
    }

    public Motorista findById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Motorista não encontrada!"));
    }

    public Motorista create(Motorista motorista) {
        var gerenciadoras = gerenciadoraService.findAll();
        gerenciadoras.forEach((gerenciadora) -> {
            Consulta consulta = new Consulta();
            consulta.setGerenciadora(gerenciadora);
            motorista.getConsultas().add(consulta);
        });
        return repository.save(motorista);
    }

    public Motorista update(String id, Motorista motorista) {
        var finded = this.findById(id);
        motorista.setId(finded.getId());
        return repository.save(motorista);
    }

    public void deleteById(String id) {
        var finded = this.findById(id);
        repository.delete(finded);
    }
}
