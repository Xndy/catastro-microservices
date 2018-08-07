package com.eureka.client.catastro.catalogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eureka.client.catastro.catalogo.entities.CtlgItem;
import com.eureka.client.catastro.catalogo.querys.Querys;


public interface CtlgItemRepository extends CrudRepository<CtlgItem, Long> {
	
	@Query(Querys.getItemsByCatalogo)
	public List<CtlgItem> getItemsByCatalogo(@Param("nombre") String nombre);

}
