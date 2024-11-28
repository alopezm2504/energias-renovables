package com.talent.tech.energias.servicios;

import com.talent.tech.energias.modelos.Plantas;
import org.springframework.stereotype.Service;

@Service
public interface PlantasServicios {
    Plantas crearPlanta(Plantas plantas);
}
