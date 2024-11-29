package com.talent.tech.energias.modelos.queriesDtos;

public class EmisionesCo2PlantaDTO {
    private String nombrePlanta;
    private Double co2;

    public EmisionesCo2PlantaDTO(String nombrePlanta, Double co2) {
        this.nombrePlanta = nombrePlanta;
        this.co2 = co2;
    }

    // Getters y setters
    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public Double getco2() {
        return co2;
    }

    public void setco2(Double co2) {
        this.co2 = co2;
    }
}


