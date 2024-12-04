package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import com.talent.tech.energias.serviciosImpl.RegistrosProduccionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/obtener-registros-producion")
    public ResponseEntity<List<RegistrosProduccion>> obtenerRegistrosProducion() {
        return ResponseEntity.ok(registrosProduccionImpl.obtenerRegistrosProduccion());
    }

    @GetMapping("/obtener-registro-producion-por/{id}")
    public ResponseEntity<RegistrosProduccion> obtenerRegistroProducionPorId(Integer id) {
        return ResponseEntity.ok(registrosProduccionImpl.obtenerRegistrosProduccionPorId(id));
    }

    @PutMapping("/actualizar-registro-producion")
    public ResponseEntity<RegistrosProduccion> actualizarRegistroProducionPorId(@RequestBody RegistrosProduccion registrosProduccion) {
        return ResponseEntity.ok(registrosProduccionImpl.actualizarRegistrosProduccionPorId(registrosProduccion));
    }

    @DeleteMapping("/eliminar-registro-producion/{id}")
    public ResponseEntity<Void> eliminarRegistroProducion(@PathVariable Integer id) {
        registrosProduccionImpl.eliminarRegistrosProduccion(id);
        return ResponseEntity.ok(null);
    }
}
