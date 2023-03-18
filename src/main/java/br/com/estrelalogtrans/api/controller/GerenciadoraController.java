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

import br.com.estrelalogtrans.domain.model.Gerenciadora;
import br.com.estrelalogtrans.domain.service.GerenciadoraService;

@RestController
@RequestMapping("/api/v1/gerenciadora")
public class GerenciadoraController {
    @Autowired
    private GerenciadoraService service;

    @GetMapping
    public ResponseEntity<List<Gerenciadora>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gerenciadora> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Gerenciadora> create(@RequestBody Gerenciadora gerenciadora) {
        return new ResponseEntity<Gerenciadora>(service.create(gerenciadora), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gerenciadora> update(@PathVariable("id") String id, @RequestBody Gerenciadora gerenciadora) {
        return ResponseEntity.ok().body(service.update(id, gerenciadora));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
