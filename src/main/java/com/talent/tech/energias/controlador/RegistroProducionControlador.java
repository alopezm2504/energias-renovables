package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import com.talent.tech.energias.serviciosImpl.RegistrosProduccionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroProducionControlador {
    private final RegistrosProduccionImpl registrosProduccionImpl;
    @Autowired
    public RegistroProducionControlador(RegistrosProduccionImpl registrosProduccionImpl) {
        this.registrosProduccionImpl = registrosProduccionImpl;
    }
    @GetMapping("/crear-registro-producion")
    public ResponseEntity<RegistrosProduccion> crearRegistroProducion(@RequestBody RegistrosProduccion registrosProduccion) {
        RegistrosProduccion registrosProduccionCreado = registrosProduccionImpl.crearRegistrosProduccion(registrosProduccion);
        return ResponseEntity.ok(registrosProduccionCreado);
    }
}
