package com.eureka.client.catastro.catalogo.entities;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ctlg_item", schema = "sgm_app", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"catalogo", "codename"})})
public class CtlgItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor", nullable = false)
    private String valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "codename", nullable = false, length = 40)
    private String codename;
    @Column(name = "referencia")
    private BigInteger referencia;
    @Column(name = "padre")
    private BigInteger padre;
    @Column(name = "orden")
    private Integer orden;
    @Column(name = "hijo")
    private BigInteger hijo;

    @Column(name = "is_default")
    private Boolean isDefault = false;
    @JsonIgnore
    @JoinColumn(name = "catalogo", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private CtlgCatalogo catalogo;
    
    public CtlgItem() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public BigInteger getReferencia() {
		return referencia;
	}

	public void setReferencia(BigInteger referencia) {
		this.referencia = referencia;
	}

	public BigInteger getPadre() {
		return padre;
	}

	public void setPadre(BigInteger padre) {
		this.padre = padre;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public BigInteger getHijo() {
		return hijo;
	}

	public void setHijo(BigInteger hijo) {
		this.hijo = hijo;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public CtlgCatalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(CtlgCatalogo catalogo) {
		this.catalogo = catalogo;
	}
	
	

}
