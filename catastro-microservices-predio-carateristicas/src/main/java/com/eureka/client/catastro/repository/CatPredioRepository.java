package com.eureka.client.catastro.repository;

import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;

import com.eureka.client.catastro.entities.CatPredio;


public interface CatPredioRepository  extends CrudRepository<CatPredio, Long>{

	public CatPredio findByNumPredio(BigInteger numPredio);
	
}
