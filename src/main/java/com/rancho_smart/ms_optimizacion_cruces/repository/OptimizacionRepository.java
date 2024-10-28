package com.rancho_smart.ms_optimizacion_cruces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_optimizacion_cruces.entity.Optimizacion;

@Repository
public interface OptimizacionRepository extends JpaRepository<Optimizacion, Long>{
    
}
