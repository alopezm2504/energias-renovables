package com.talent.tech.energias.modelos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RegistrosProduccion")
public class RegistrosProduccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RegistroID")
    private int id;

    @Column(name = "plantaid", nullable = false)
    private Integer plantaID;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaProduccion", nullable = false)
    private Date fechaProduccion;

    @Column(name = "ProduccionMW", nullable = false)
    private float produccionMW;

    public RegistrosProduccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPlantaID() {
        return plantaID;
    }

    public void setPlantaID(Integer plantaID) {
        this.plantaID = plantaID;
    }

    public Date getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(Date fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public float getProduccionMW() {
        return produccionMW;
    }

    public void setProduccionMW(float produccionMW) {
        this.produccionMW = produccionMW;
    }
}
