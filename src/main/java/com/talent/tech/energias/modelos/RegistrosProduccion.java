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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlantaID", nullable = false)
    private Plantas plantas;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaProduccion", nullable = false)
    private Date fechaProduccion;

    @Column(name = "ProduccionMW", nullable = false)
    private float produccionMW;

    public RegistrosProduccion() {
    }

    // Getters y Setters
}
