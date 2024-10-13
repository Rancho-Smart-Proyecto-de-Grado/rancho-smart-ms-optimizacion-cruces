package com.rancho_smart.ms_optimizacion_cruces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsOptimizacionCrucesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOptimizacionCrucesApplication.class, args);
	}

}
