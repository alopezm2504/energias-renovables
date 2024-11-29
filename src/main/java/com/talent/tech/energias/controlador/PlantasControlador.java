package com.talent.tech.energias.controlador;

import com.talent.tech.energias.modelos.Plantas;
import com.talent.tech.energias.serviciosImpl.PlantasServiciosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/top3-plantas-mayor-produccion")
    public ResponseEntity<?> top3PlantasConMayorProduccion() {
        return ResponseEntity.ok(plantasServiciosImpl.findTop3PlantasConMayorProduccionNativo());
    }
}
