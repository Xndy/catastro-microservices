package com.eureka.client.catastro.catalogo.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
 import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ctlg_catalogo", schema = "sgm_app", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"nombre"})})
public class CtlgCatalogo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Size(min = 1, max = 30)
    @Column(name = "observacion")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalogo", fetch = FetchType.LAZY)
    @OrderBy("orden ASC")
    private List<CtlgItem> ctlgItemCollection;

    public CtlgCatalogo() {
    }

    public CtlgCatalogo(Long id) {
        this.id = id;
    }

    public CtlgCatalogo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CtlgItem> getCtlgItemCollection() {
        return ctlgItemCollection;
    }

    public void setCtlgItemCollection(List<CtlgItem> ctlgItemCollection) {
        this.ctlgItemCollection = ctlgItemCollection;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


}
