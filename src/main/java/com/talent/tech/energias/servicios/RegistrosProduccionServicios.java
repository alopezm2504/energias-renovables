package com.talent.tech.energias.servicios;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrosProduccionServicios {
    RegistrosProduccion crearRegistrosProduccion(RegistrosProduccion registrosProduccion);
    List<RegistrosProduccion> obtenerRegistrosProduccion();
    RegistrosProduccion obtenerRegistrosProduccionPorId(Integer id);
    RegistrosProduccion actualizarRegistrosProduccionPorId(RegistrosProduccion registrosProduccion);
    void eliminarRegistrosProduccion(Integer id);
}
