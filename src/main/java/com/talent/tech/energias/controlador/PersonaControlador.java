package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.Persona;
import com.talent.tech.energias.servicios.PersonaServicios;
import com.talent.tech.energias.serviciosImpl.PersonaServiciosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaControlador {

    private final PersonaServiciosImpl personaServiciosImpl;

    @Autowired
    public PersonaControlador(PersonaServiciosImpl personaServiciosImpl) {
        this.personaServiciosImpl = personaServiciosImpl;
    }

    @PostMapping("/crear-persona")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        Persona personaCreada = personaServiciosImpl.crearPersona(persona);
        return ResponseEntity.ok(personaCreada);
    }

    @GetMapping("/obtener-persona/{id}")

    public ResponseEntity<Persona> obtenerPersonaLogin(@PathVariable Integer id) {
        Persona persona = personaServiciosImpl.obtenerPersonaPorId(id);
        return ResponseEntity.ok(persona);
    }

    @GetMapping("/obtener-personas")

    public ResponseEntity<List<Persona>> obtenerPersonas() {
        return ResponseEntity.ok(personaServiciosImpl.obtenerPersonas());
    }

    @GetMapping("/actualizar-persona")

    public ResponseEntity<Persona> actualizarPersona(@RequestBody Persona persona) {
        Persona personaActualizada = personaServiciosImpl.actualizarPersona(persona);
        return ResponseEntity.ok(personaActualizada);
    }

    @DeleteMapping("/eliminar-persona/{id}")

    public ResponseEntity<Void> eliminarPersona(@PathVariable Integer id) {
        personaServiciosImpl.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }


}
