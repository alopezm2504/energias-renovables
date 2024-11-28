package com.talent.tech.energias.serviciosImpl;

import com.talent.tech.energias.modelos.Persona;
import com.talent.tech.energias.repositorio.PersonaRepositorio;
import com.talent.tech.energias.servicios.PersonaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiciosImpl implements PersonaServicios {

    private PersonaRepositorio personaRepositorio;

    @Autowired
    public PersonaServiciosImpl(PersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepositorio.save(persona);
    }

    @Override
    public Persona obtenerPersonaLogin(String usuario, String contrasena) {
        return null;
        //return personaRepositorio.findByUsuarioAndContrasena(usuario, contrasena);
    }

    @Override
    public Persona obtenerPersonaPorId(Integer id) {
        return personaRepositorio.findById(id).orElse(null);
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepositorio.findAll();
    }

    @Override
    public Persona actualizarPersona(Persona persona) {
        return personaRepositorio.findById(persona.getId())
                .map(personaActualizada -> personaRepositorio.save(persona))
                .orElse(null);
    }

    @Override
    public void eliminarPersona(Integer id) {
        personaRepositorio.deleteById(id);
    }
}
