package com.talent.tech.energias.modelos.queriesDtos;

public class ProduccionPlantaDTO {
    private String nombrePlanta;
    private Double produccionTotal;

    public ProduccionPlantaDTO(String nombrePlanta, Double produccionTotal) {
        this.nombrePlanta = nombrePlanta;
        this.produccionTotal = produccionTotal;
    }

    // Getters y setters
    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public Double getProduccionTotal() {
        return produccionTotal;
    }

    public void setProduccionTotal(Double produccionTotal) {
        this.produccionTotal = produccionTotal;
    }
}

