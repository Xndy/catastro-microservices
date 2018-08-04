package com.eureka.server.catastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CatastroEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatastroEurekaServerApplication.class, args);
	}
}
