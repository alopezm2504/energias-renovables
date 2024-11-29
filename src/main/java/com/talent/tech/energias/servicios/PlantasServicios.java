package com.talent.tech.energias.servicios;

import com.talent.tech.energias.modelos.Plantas;
import com.talent.tech.energias.modelos.queriesDtos.ProduccionPlantaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlantasServicios {
    Plantas crearPlanta(Plantas plantas);
    List<ProduccionPlantaDTO> findTop3PlantasConMayorProduccionNativo();
    List<ProduccionPlantaDTO> findPlantasConEmisionesCO2MayoresA1_5Nativo();
}
