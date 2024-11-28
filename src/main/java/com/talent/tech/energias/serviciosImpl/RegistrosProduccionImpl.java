package com.talent.tech.energias.serviciosImpl;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import com.talent.tech.energias.repositorio.RegistrosProduccionRepositorio;
import com.talent.tech.energias.servicios.RegistrosProduccionServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrosProduccionImpl implements RegistrosProduccionServicios {
    private RegistrosProduccionRepositorio registrosProduccionRepositorio;
    @Autowired
    public RegistrosProduccionImpl(RegistrosProduccionRepositorio registrosProduccionRepositorio) {
        this.registrosProduccionRepositorio = registrosProduccionRepositorio;
    }


    @Override
    public RegistrosProduccion crearRegistrosProduccion(RegistrosProduccion registrosProduccion) {
        return registrosProduccionRepositorio.save(registrosProduccion);
    }
}
