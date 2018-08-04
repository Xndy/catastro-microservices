package com.eureka.client.catastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CatastroMicroservicesPredioCarateristicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatastroMicroservicesPredioCarateristicasApplication.class, args);
	}
}
