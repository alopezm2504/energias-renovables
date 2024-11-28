package com.talent.tech.energias.servicios;

import com.talent.tech.energias.modelos.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaServicios {
    Persona crearPersona(Persona persona);
    Persona obtenerPersonaLogin(String usuario, String contrasena);
    Persona obtenerPersonaPorId(Integer id);
    List<Persona> obtenerPersonas();
    Persona actualizarPersona(Persona persona);
    void eliminarPersona(Integer id);
}
