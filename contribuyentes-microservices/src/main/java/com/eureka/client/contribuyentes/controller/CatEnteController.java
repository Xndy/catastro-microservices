package com.eureka.client.contribuyentes.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.contribuyentes.entities.CatEnte;
import com.eureka.client.contribuyentes.repository.CatEnteRepository;


@RestController
@RequestMapping("/api/contribuyentes")
public class CatEnteController {
	
	@Autowired
	private CatEnteRepository catEnteRepository;

	@RequestMapping(value = "/ciRuc/{ciRuc}", method = RequestMethod.GET)
	public ResponseEntity<?> findPredioByCiRuc(@PathVariable String ciRuc) {
		CatEnte contribuyente = catEnteRepository.findByCiRuc(ciRuc);
		return new ResponseEntity<>(contribuyente, HttpStatus.OK);
	}

}
