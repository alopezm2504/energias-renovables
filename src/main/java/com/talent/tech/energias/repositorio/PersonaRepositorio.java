package com.talent.tech.energias.repositorio;

import com.talent.tech.energias.modelos.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {
    //Persona findByUsuarioAndContrasena(String usuario, String contrasena);
}
