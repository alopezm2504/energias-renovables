package com.talent.tech.energias.servicios;

import com.talent.tech.energias.modelos.Emisiones;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmisionesServicios {
    Emisiones crearEmisiones(Emisiones emisiones);
    Emisiones obtenerEmisionesPorId(Integer id);
    List<Emisiones> obtenerEmisiones();
    Emisiones actualizarEmisiones(Emisiones emisiones);
    void eliminarEmisiones(Integer id);
}
