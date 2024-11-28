package com.talent.tech.energias.serviciosImpl;

import com.talent.tech.energias.modelos.Emisiones;
import com.talent.tech.energias.repositorio.EmisionesRepositorio;
import com.talent.tech.energias.servicios.EmisionesServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmisionesServiciosImpl implements EmisionesServicios {
    private EmisionesRepositorio emisionesRepositorio;
    @Autowired
    public EmisionesServiciosImpl(EmisionesRepositorio emisionesRepositorio) {
        this.emisionesRepositorio = emisionesRepositorio;
    }


    @Override
    public Emisiones crearEmisiones(Emisiones emisiones) {
        return emisionesRepositorio.save(emisiones);
    }

    @Override
    public Emisiones obtenerEmisionesPorId(Integer id) {
        return emisionesRepositorio.findById(id).orElse(null);
    }

    @Override
    public List<Emisiones> obtenerEmisiones() {
        return emisionesRepositorio.findAll();
    }

    @Override
    public Emisiones actualizarEmisiones(Emisiones emisiones) {
        return emisionesRepositorio.findById(emisiones.getId())
                .map(emisiones1 -> emisionesRepositorio.save(emisiones))
                .orElse(null);
    }

    @Override
    public void eliminarEmisiones(Integer id) {
        emisionesRepositorio.deleteById(id);
    }


}
