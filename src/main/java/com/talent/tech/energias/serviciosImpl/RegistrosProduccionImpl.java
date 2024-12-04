package com.talent.tech.energias.serviciosImpl;

import com.talent.tech.energias.modelos.RegistrosProduccion;
import com.talent.tech.energias.repositorio.RegistrosProduccionRepositorio;
import com.talent.tech.energias.servicios.RegistrosProduccionServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<RegistrosProduccion> obtenerRegistrosProduccion() {
        return registrosProduccionRepositorio.findAll();
    }

    @Override
    public RegistrosProduccion obtenerRegistrosProduccionPorId(Integer id) {
        return registrosProduccionRepositorio.findById(id).orElse(null);
    }

    @Override
    public RegistrosProduccion actualizarRegistrosProduccionPorId(RegistrosProduccion registrosProduccion) {
        return registrosProduccionRepositorio.findById(registrosProduccion.getId())
                .map(registrosProduccion1 -> registrosProduccionRepositorio.save(registrosProduccion))
                .orElse(null);
    }

    @Override
    public void eliminarRegistrosProduccion(Integer id) {
        registrosProduccionRepositorio.deleteById(id);
    }
}
