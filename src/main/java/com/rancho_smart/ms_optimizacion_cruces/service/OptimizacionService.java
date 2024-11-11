package com.rancho_smart.ms_optimizacion_cruces.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_optimizacion_cruces.entity.Optimizacion;
import com.rancho_smart.ms_optimizacion_cruces.repository.OptimizacionRepository;

@Service
public class OptimizacionService {

    @Autowired
    private OptimizacionRepository optimizacionRepository;

    public List<Optimizacion> getOptimizaciones() {
        return this.optimizacionRepository.findAll();
    }

    public Optional<Optimizacion> getOptimizacionById(Long id) {
        return this.optimizacionRepository.findById(id);
    }

    public Optimizacion saveOptimizacion(Optimizacion optimizacion) {
        return this.optimizacionRepository.save(optimizacion);
    }

    public void deleteOptimizacion(Long id) {
        this.optimizacionRepository.deleteById(id);
    }
}
