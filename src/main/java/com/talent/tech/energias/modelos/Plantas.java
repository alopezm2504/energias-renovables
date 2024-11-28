package com.talent.tech.energias.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.util.List;

@Entity
@Table(name = "Plantas")
public class Plantas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlantaID")
    private int id;

    @Column(name = "NombrePlanta", unique = true, nullable = false)
    private String nombrePlanta;

    @Column(name = "Ubicacion")
    private String ubicacion;

    @Column(name = "TipoEnergia")
    private String tipoEnergia;

    @Column(name = "CapacidadMW", nullable = false)
    @Check(constraints = "CapacidadMW > 0")
    private float capacidadMW;

    @Enumerated(EnumType.STRING)
    @Column(name = "Estatus", nullable = false)
    private Estatus estatus;

    @OneToMany(mappedBy = "plantas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RegistrosProduccion> registrosProduccion;

    @OneToMany(mappedBy = "plantas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emisiones> emisiones;

    // Getters y Setters
    public enum Estatus {
        OPERATIVA,
        INACTIVA
    }

    public Plantas() {
    }
}
