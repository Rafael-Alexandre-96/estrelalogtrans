package br.com.estrelalogtrans.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estrelalogtrans.domain.model.Motorista;
import br.com.estrelalogtrans.domain.service.MotoristaService;

@RestController
@RequestMapping("/api/v1/motorista")
public class MotoristaController {
    @Autowired
    private MotoristaService service;

    @GetMapping
    public ResponseEntity<List<Motorista>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motorista> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Motorista> create(@RequestBody Motorista motorista) {
        return new ResponseEntity<Motorista>(service.create(motorista), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Motorista> update(@PathVariable("id") String id, @RequestBody Motorista motorista) {
        return ResponseEntity.ok().body(service.update(id, motorista));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
