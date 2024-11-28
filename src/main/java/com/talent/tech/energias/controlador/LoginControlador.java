package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.Login;
import com.talent.tech.energias.modelos.Persona;
import com.talent.tech.energias.serviciosImpl.PersonaServiciosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControlador {
/*
    @Autowired
    private PersonaServiciosImpl personaServiciosImpl;
    public ResponseEntity<Persona> login(Login login) {
        Persona persona = personaServiciosImpl.obtenerPersonaLogin(login.getCorreo(), login.getContrasena());
        if (persona == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(persona);
    }*/
}
