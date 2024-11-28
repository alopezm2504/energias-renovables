package com.talent.tech.energias.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Emisiones")
public class Emisiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmisionID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlantaID", nullable = false)
    @JsonIgnore
    private Plantas plantas;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaMedicion", nullable = false)
    private String fechaMedicion;

    @Column(name = "EmisionesCO2", nullable = false)
    private float emisionesCO2;

    @Column(name = "EmisionesNOx", nullable = false)
    private float emisionesNOx;

    @Column(name = "EmisionesSOx", nullable = false)
    private float emisionesSOx;

    public Emisiones() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plantas getPlantas() {
        return plantas;
    }

    public void setPlantas(Plantas plantas) {
        this.plantas = plantas;
    }

    public String getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(String fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public float getEmisionesCO2() {
        return emisionesCO2;
    }

    public void setEmisionesCO2(float emisionesCO2) {
        this.emisionesCO2 = emisionesCO2;
    }

    public float getEmisionesNOx() {
        return emisionesNOx;
    }

    public void setEmisionesNOx(float emisionesNOx) {
        this.emisionesNOx = emisionesNOx;
    }

    public float getEmisionesSOx() {
        return emisionesSOx;
    }

    public void setEmisionesSOx(float emisionesSOx) {
        this.emisionesSOx = emisionesSOx;
    }
    // Getters y Setters
}
