package com.unicesumar.ProvaPratica.service;

import com.unicesumar.ProvaPratica.entity.Estudante;
import com.unicesumar.ProvaPratica.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<Estudante> listar(){
        return estudanteRepository.findAll();
    }

    public Estudante criarEstudante(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public Estudante buscarPorId(Long id){
        return estudanteRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Estudante não encontrado."));
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }

}
