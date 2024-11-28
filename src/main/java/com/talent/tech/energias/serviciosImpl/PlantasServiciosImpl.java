package com.talent.tech.energias.serviciosImpl;

import com.talent.tech.energias.modelos.Plantas;
import com.talent.tech.energias.repositorio.PlantasRepositorio;
import com.talent.tech.energias.servicios.PlantasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantasServiciosImpl implements PlantasServicios {
    private PlantasRepositorio plantasRepositorio;
    @Autowired
    public PlantasServiciosImpl(PlantasRepositorio plantasRepositorio) {
        this.plantasRepositorio = plantasRepositorio;
    }
    @Override
    public Plantas crearPlanta(Plantas plantas) {
        return plantasRepositorio.save(plantas);
    }
}
