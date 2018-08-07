package com.eureka.client.catastro.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.catastro.entities.CatPredio;
import com.eureka.client.catastro.repository.CatPredioRepository;

@RestController
@RequestMapping("/api/predio")
public class CatPredioController {

	@Autowired
	private CatPredioRepository catPredioRepository;

	@RequestMapping(value = "/numPredio/{numPredio}", method = RequestMethod.GET)
	public ResponseEntity<?> findPredioByNumPredio(@PathVariable BigInteger numPredio) {
		CatPredio predio = catPredioRepository.findByNumPredio(numPredio);
		return new ResponseEntity<>(predio, HttpStatus.OK);
	}
}
