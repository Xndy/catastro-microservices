package com.eureka.client.contribuyentes.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.eureka.client.contribuyentes.entities.CatEnte;


public interface CatEnteRepository  extends CrudRepository<CatEnte, Long>{
	
	public CatEnte findByCiRuc(String ciRuc);

}
