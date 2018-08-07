package com.eureka.client.catastro.catalogo.querys;

public class Querys {

	
	public final static String getItemsByCatalogo =
			"select c from CtlgItem c WHERE c.catalogo.nombre =:nombre";
}
