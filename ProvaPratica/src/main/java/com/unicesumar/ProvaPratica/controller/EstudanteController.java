package com.unicesumar.ProvaPratica.controller;

import com.unicesumar.ProvaPratica.entity.Estudante;
import com.unicesumar.ProvaPratica.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {
    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<Estudante> findAll(){
        return estudanteService.listar();
    }

    @PostMapping
    public Estudante criar(@RequestBody Estudante estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Estudante> buscarEstudantePorId(@PathVariable Long id){
        return ResponseEntity.ok(estudanteService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }

}
