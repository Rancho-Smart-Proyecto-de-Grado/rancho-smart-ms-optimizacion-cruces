package com.rancho_smart.ms_optimizacion_cruces.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rancho_smart.ms_optimizacion_cruces.entity.Optimizacion;
import com.rancho_smart.ms_optimizacion_cruces.service.OptimizacionService;

@RestController
@RequestMapping(path = "/optimizaciones")
public class OptimizacionRESTController {

    @Autowired
    private OptimizacionService optimizacionService;

    @GetMapping
    public ResponseEntity<List<Optimizacion>> getAllOptimizaciones() {
        List<Optimizacion> listado = this.optimizacionService.getOptimizaciones();
        return new ResponseEntity<>(listado, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optimizacion> getOptimizacionById(@PathVariable Long id) {
        Optional<Optimizacion> optimizacion = this.optimizacionService.getOptimizacionById(id);
        return optimizacion.map(ResponseEntity::ok)
                           .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Optimizacion> saveOptimizacion(@RequestBody Optimizacion optimizacion) {
        Optimizacion optimizacionCreada = this.optimizacionService.saveOptimizacion(optimizacion);
        return new ResponseEntity<>(optimizacionCreada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optimizacion> updateOptimizacion(@PathVariable Long id, @RequestBody Optimizacion optimizacion) {
        if (!this.optimizacionService.getOptimizacionById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            optimizacion.setIdOptimizacion(id);
            Optimizacion optimizacionActualizada = this.optimizacionService.saveOptimizacion(optimizacion);
            return new ResponseEntity<>(optimizacionActualizada, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOptimizacion(@PathVariable Long id) {
        if (!this.optimizacionService.getOptimizacionById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.optimizacionService.deleteOptimizacion(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
