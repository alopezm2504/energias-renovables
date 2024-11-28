package com.talent.tech.energias.servicios;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import org.springframework.stereotype.Service;

@Service
public interface RegistrosProduccionServicios {
    RegistrosProduccion crearRegistrosProduccion(RegistrosProduccion registrosProduccion);
}
