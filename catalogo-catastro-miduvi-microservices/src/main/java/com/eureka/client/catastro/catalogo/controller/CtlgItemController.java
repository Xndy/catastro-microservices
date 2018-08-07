package com.eureka.client.catastro.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.catastro.catalogo.repository.CtlgItemRepository;

@RestController
@RequestMapping("/api/catalogo")
public class CtlgItemController {

	@Autowired
	private CtlgItemRepository ctlgItemRepository;

	//Example
	@RequestMapping(value = "/items/{nombre}", method = RequestMethod.GET)
	public ResponseEntity<?> getSucursalByClient(@PathVariable String nombre) {
		return new ResponseEntity<>(ctlgItemRepository.getItemsByCatalogo(nombre), HttpStatus.OK);
	}

}
