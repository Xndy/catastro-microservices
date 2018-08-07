package com.eureka.client.contribuyentes.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author xndy
 */
@Entity
@Table(name = "cat_ente", schema = "sgm_app")
@NamedQueries({
    @NamedQuery(name = "CatEnte.findAll", query = "SELECT c FROM CatEnte c")})
public class CatEnte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 20)
    @Column(name = "ci_ruc")
    private String ciRuc;
    @Size(max = 500)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 500)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "es_persona")
    private boolean esPersona;
    @Size(max = 500)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 500)
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    @Size(max = 500)
    @Column(name = "razon_social")
    private String razonSocial;
    
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado", nullable = false, length = 1)
    private String estado = "A";
    @Size(max = 100)
    @Column(name = "user_cre", length = 100)
    private String userCre;
    @Column(name = "fecha_cre")
    private Date fechaCre;
    @Column(name = "excepcionales")
    private Boolean excepcionales = false;
    @NotNull
    @Column(name = "personeria_juridica")
    private Boolean personeriaJuridica = false;
    @Column(name = "lleva_contabilidad")
    private Boolean llevaContabilidad;

    public CatEnte() {
    }

    public CatEnte(Long id) {
        this.id = id;
    }

    public CatEnte(Long id, boolean esPersona) {
        this.id = id;
        this.esPersona = esPersona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiRuc() {
        return ciRuc;
    }

    public void setCiRuc(String ciRuc) {
        this.ciRuc = ciRuc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean getEsPersona() {
        return esPersona;
    }

    public void setEsPersona(boolean esPersona) {
        this.esPersona = esPersona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUserCre() {
		return userCre;
	}

	public void setUserCre(String userCre) {
		this.userCre = userCre;
	}

	public Date getFechaCre() {
		return fechaCre;
	}

	public void setFechaCre(Date fechaCre) {
		this.fechaCre = fechaCre;
	}

	public Boolean getExcepcionales() {
		return excepcionales;
	}

	public void setExcepcionales(Boolean excepcionales) {
		this.excepcionales = excepcionales;
	}

	public Boolean getPersoneriaJuridica() {
		return personeriaJuridica;
	}

	public void setPersoneriaJuridica(Boolean personeriaJuridica) {
		this.personeriaJuridica = personeriaJuridica;
	}

	public Boolean getLlevaContabilidad() {
		return llevaContabilidad;
	}

	public void setLlevaContabilidad(Boolean llevaContabilidad) {
		this.llevaContabilidad = llevaContabilidad;
	}

}
