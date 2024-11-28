package com.talent.tech.energias.repositorio;

import com.talent.tech.energias.modelos.Plantas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantasRepositorio extends JpaRepository<Plantas, Integer> {
}
