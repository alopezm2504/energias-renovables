package com.talent.tech.energias.repositorio;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrosProduccionRepositorio extends JpaRepository<RegistrosProduccion, Integer> {
}
