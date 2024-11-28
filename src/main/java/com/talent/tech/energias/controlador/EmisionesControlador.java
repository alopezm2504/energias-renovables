package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.Emisiones;
import com.talent.tech.energias.serviciosImpl.EmisionesServiciosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmisionesControlador {
    @Autowired
    private EmisionesServiciosImpl emisionesServiciosImpl;

    @PostMapping("/crear-emisiones")

    public ResponseEntity<Emisiones> crearEmisiones(@RequestBody Emisiones emisiones) {
        Emisiones emisionesCreada = emisionesServiciosImpl.crearEmisiones(emisiones);
        return ResponseEntity.ok(emisionesCreada);
    }

    @GetMapping("/obtener-emisiones/{id}")
    public ResponseEntity<Emisiones> obtenerEmisionesPorId(@PathVariable Integer id) {
        Emisiones emisiones = emisionesServiciosImpl.obtenerEmisionesPorId(id);
        if (emisiones == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(emisiones);
    }

    @GetMapping ("/obtener-emisiones")
    public ResponseEntity<List<Emisiones>> obtenerEmisiones() {
        List<Emisiones> emisiones = emisionesServiciosImpl.obtenerEmisiones();
        return ResponseEntity.ok(emisiones);
    }

    @PutMapping("/actualizar-emisiones")
    public ResponseEntity<Emisiones> actualizarEmisiones(@RequestBody Emisiones emisiones) {
        Emisiones emisionesActualizada = emisionesServiciosImpl.actualizarEmisiones(emisiones);
        if (emisionesActualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(emisionesActualizada);
    }

    @DeleteMapping("/eliminar-emisiones/{id}")
    public ResponseEntity<Void> eliminarEmisiones(@PathVariable Integer id) {
        emisionesServiciosImpl.eliminarEmisiones(id);
        return ResponseEntity.ok(null);
    }
}
