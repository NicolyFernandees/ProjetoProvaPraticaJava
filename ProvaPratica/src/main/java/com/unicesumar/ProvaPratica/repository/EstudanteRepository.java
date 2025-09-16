package com.unicesumar.ProvaPratica.repository;

import com.unicesumar.ProvaPratica.entity.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante,Long> {
}
