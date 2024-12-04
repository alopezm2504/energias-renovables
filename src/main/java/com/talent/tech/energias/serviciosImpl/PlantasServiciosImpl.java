package com.talent.tech.energias.serviciosImpl;

import com.talent.tech.energias.modelos.Plantas;
import com.talent.tech.energias.modelos.queriesDtos.ProduccionPlantaDTO;
import com.talent.tech.energias.repositorio.PlantasRepositorio;
import com.talent.tech.energias.servicios.PlantasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Plantas> trerTodasLasPlantas() {
        return plantasRepositorio.findAll();
    }

    @Override
    public Plantas obtenerPlantaPorId(Integer id) {
        return plantasRepositorio.findById(id).orElse(null);
    }

    @Override
    public Plantas actualizarPlanta(Plantas plantas) {
        return plantasRepositorio.save(plantas);
    }

    @Override
    public void eliminarPlanta(Integer id) {
        plantasRepositorio.deleteById(id);
    }

    @Override
    public List<ProduccionPlantaDTO> findTop3PlantasConMayorProduccionNativo() {
        List<Object[]> resultados = plantasRepositorio.findTop3PlantasConMayorProduccionNativo();
        return resultados.stream()
                .map(obj -> new ProduccionPlantaDTO((String) obj[0], (Double) obj[1]))
                .toList();
    }

    @Override
    public List<ProduccionPlantaDTO> findPlantasConEmisionesCO2MayoresA1_5Nativo() {
        return plantasRepositorio.findPlantasConEmisionesCO2MayoresA1_5Nativo().stream()
                .map(obj -> new ProduccionPlantaDTO((String) obj[0], (Double) obj[1]))
                .toList();
    }
}
