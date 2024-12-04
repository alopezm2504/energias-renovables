package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.Emisiones;
import com.talent.tech.energias.modelos.Plantas;
import com.talent.tech.energias.serviciosImpl.PlantasServiciosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlantasControlador {

    private PlantasServiciosImpl plantasServiciosImpl;
    @Autowired
    public PlantasControlador(PlantasServiciosImpl plantasServiciosImpl) {
        this.plantasServiciosImpl = plantasServiciosImpl;
    }

    @PostMapping("/crear-planta")
    public ResponseEntity<Plantas> crearPlanta(@RequestBody Plantas plantas) {
        Plantas plantaCreada = plantasServiciosImpl.crearPlanta(plantas);
        return ResponseEntity.ok(plantas);
    }

    @GetMapping("/obtener-plantas")
    public ResponseEntity<?> obtenerPlantas() {
        return ResponseEntity.ok(plantasServiciosImpl.trerTodasLasPlantas());
    }

    @GetMapping("/obtener-planta-por-id/{id}")
    public ResponseEntity<?> obtenerPlantaPorId(Integer id) {
        return ResponseEntity.ok(plantasServiciosImpl.obtenerPlantaPorId(id));
    }

    @PutMapping("/actualizar-planta")
    public ResponseEntity<?> actualizarPlanta(@RequestBody Plantas plantas) {
        Plantas plantaActualizada = plantasServiciosImpl.actualizarPlanta(plantas);
        if (plantaActualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(plantaActualizada);
    }

    @DeleteMapping("/eliminar-planta-por/{id}")
    public ResponseEntity<?> eliminarPlanta(@PathVariable Integer id) {
        plantasServiciosImpl.eliminarPlanta(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/top3-plantas-mayor-produccion")
    public ResponseEntity<?> top3PlantasConMayorProduccion() {
        return ResponseEntity.ok(plantasServiciosImpl.findTop3PlantasConMayorProduccionNativo());
    }

    @GetMapping("/plantas-emisiones-co2-mayores-a-1_5")
    public ResponseEntity<?> plantasConEmisionesCO2MayoresA1_5() {
        return ResponseEntity.ok(plantasServiciosImpl.findPlantasConEmisionesCO2MayoresA1_5Nativo());
    }
}
