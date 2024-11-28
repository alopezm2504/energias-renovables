package com.talent.tech.energias.repositorio;

import com.talent.tech.energias.modelos.Emisiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmisionesRepositorio extends JpaRepository<Emisiones, Integer> {
    
}
