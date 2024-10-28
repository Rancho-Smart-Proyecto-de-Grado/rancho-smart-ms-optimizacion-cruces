package com.rancho_smart.ms_optimizacion_cruces.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OPTIMIZACION")
public class Optimizacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOptimizacion;

    @Column(name = "ID_PADRE")
    private Long idPadre;

    @Column(name = "PADRE")
    private String padre;

    @Column(name = "ID_MADRE")
    private Long idMadre;

    @Column(name = "POTENCIAL_GENETICO")
    private Float potencialGenetico;

    public Optimizacion() {
    }

    public Optimizacion(Long idPadre, String padre, Long idMadre, Float potencialGenetico) {
        this.idPadre = idPadre;
        this.padre = padre;
        this.idMadre = idMadre;
        this.potencialGenetico = potencialGenetico;
    }

    public Long getIdOptimizacion() {
        return idOptimizacion;
    }

    public void setIdOptimizacion(Long idOptimizacion) {
        this.idOptimizacion = idOptimizacion;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public Float getPotencialGenetico() {
        return potencialGenetico;
    }

    public void setPotencialGenetico(Float potencialGenetico) {
        this.potencialGenetico = potencialGenetico;
    }

    

}
