package com.eureka.client.catastro.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cat_predio", schema = "sgm_app", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "num_predio" }) })
public class CatPredio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/*
	 * DATOS PREDIO
	 */
	@Column(name = "provincia")
	private Short provincia;
	@Column(name = "canton")
	private Short canton;
	@Column(name = "parroquia")
	private Short parroquia;
	@Basic(optional = false)
	@NotNull
	@Column(name = "zona", nullable = false)
	private Short zona;
	@Basic(optional = false)
	@NotNull
	@Column(name = "sector", nullable = false)
	private Short sector;
	@Column(name = "mz")
	private Short mz;
	@Column(name = "lote")
	private Short lote;
	@Column(name = "solar")
	private Short solar;
	@Basic(optional = false)
	@NotNull
	@Column(name = "bloque", nullable = false)
	private Short bloque;
	@Basic(optional = false)
	@NotNull
	@Column(name = "piso", nullable = false)
	private Short piso;
	@Basic(optional = false)
	@NotNull
	@Column(name = "unidad", nullable = false)
	private Short unidad;
	@Size(max = 100)
	@Column(name = "clave_cat", length = 100)
	private String claveCat;
	@Size(max = 150)
	@Column(name = "predialant", length = 150)
	private String predialant;
	@Column(name = "num_predio")
	private BigInteger numPredio;

	@Column(name = "area_solar", precision = 12, scale = 2)
	private BigDecimal areaSolar;
	@Column(name = "area_obras", precision = 12, scale = 2)
	private BigDecimal areaObras;
	@Column(name = "area_cultivos", precision = 12, scale = 2)
	private BigDecimal areaCultivos;
	@Column(name = "area_declarada_const", precision = 12, scale = 2)
	private BigDecimal areaDeclaradaConst;

	@Size(max = 80)
	@Column(name = "nombre_urb", length = 80)
	private String nombreUrb;
	@Column(name = "urb_sec")
	private Short urbSec;
	@Column(name = "num_hogares")
	private Short numHogares;
	@Column(name = "num_espacios_banios")
	private Short numEspaciosBanios;
	@Column(name = "num_celulares")
	private Short numCelulares;
	@Column(name = "num_habitaciones")
	private Short numHabitaciones;
	@Column(name = "num_dormitorios")
	private Short numDormitorios;

	@Size(max = 20)
	@Column(name = "urb_mz", length = 20)
	private String urbMz;
	@Basic(optional = false)
	@NotNull
	@Column(name = "inst_creacion", nullable = false)
	private Date instCreacion;
	@Size(max = 100)
	@Column(name = "urb_solarnew", length = 100)
	private String urbSolarnew;
	@Size(max = 50)
	@Column(name = "urb_secnew", length = 50)
	private String urbSecnew;
	@Column(name = "observaciones", length = 5000)
	private String observaciones;
	@Size(max = 150)
	@Column(name = "calle", length = 150)
	private String calle;
	@Size(max = 150)
	@Column(name = "calle_s", length = 150)
	private String calleS;
	@Size(max = 150)
	@Column(name = "numero_vivienda", length = 150)
	private String numeroVivienda;
	@Column(name = "propiedad_horizontal")
	private Boolean propiedadHorizontal;
	@Column(name = "predio_raiz")
	private BigInteger predioRaiz;
	@Size(max = 1)
	@Column(name = "estado", length = 1)
	private String estado;
	@Column(name = "tipo_predio", length = 10)
	private String tipoPredio;

	@Column(name = "coordx", precision = 14, scale = 4)
	private BigDecimal coordx;
	@Column(name = "coordy", precision = 14, scale = 4)
	private BigDecimal coordy;
	@Column(name = "fec_mod")
	private Date fecMod;
	@Size(max = 50)
	@Column(name = "usr_mod", length = 50)
	private String usrMod;

	/*
	 * AVVALUOS INICIO
	 */

	@Column(name = "avaluo_solar", precision = 15, scale = 4)
	private BigDecimal avaluoSolar;
	@Column(name = "avaluo_construccion", precision = 15, scale = 4)
	private BigDecimal avaluoConstruccion;
	@Column(name = "avaluo_municipal", precision = 15, scale = 4)
	private BigDecimal avaluoMunicipal;
	@Column(name = "avaluo_cultivos", precision = 15, scale = 4)
	private BigDecimal avaluoCultivos;
	@Column(name = "avaluo_Obra_Complement", precision = 15, scale = 4)
	private BigDecimal avaluoObraComplement;
	@Column(name = "avaluo_plussolar", precision = 15, scale = 4)
	private BigDecimal avaluoPlussolar;
	@Column(name = "avaluo_plusconstruccion", precision = 15, scale = 4)
	private BigDecimal avaluoPlusconstruccion;
	@Column(name = "avaluo_plusmunicipal", precision = 15, scale = 4)
	private BigDecimal avaluoPlusmunicipal;
	@Column(name = "avaluo_pluscultivos", precision = 15, scale = 4)
	private BigDecimal avaluoPluscultivos;
	@Column(name = "avaluo_Plu_Obra_Complement", precision = 15, scale = 4)
	private BigDecimal avaluoPluObraComplement;

	/*
	 * AVVALUOS FIN
	 */

	@Column(name = "habitantes")
	private Integer habitantes;
	@Column(name = "tipo_vivienda_horizontal")
	private Boolean tipoViviendaHorizontal;
	@Column(name = "ocupacion_viv_horizontal")
	private Boolean ocupacionViviendaHorizontal;

	@Column(name = "requiere_perfeccionamiento")
	private Boolean requierePerfeccionamiento;
	@Column(name = "anios_sin_perfeccionamiento")
	private Integer aniosSinPerfeccionamiento;
	@Column(name = "anios_posesion")
	private Integer aniosPosesion;
	@Column(name = "nombre_pueblo_etnia")
	private String nombrePuebloEtnia;
	@Column(name = "ficha_madre")
	private Boolean fichaMadre;

//	@OneToOne(mappedBy = "predio", fetch = FetchType.LAZY)
//	private CatPredioS4 catPredioS4;
//	@OneToOne(mappedBy = "predio", fetch = FetchType.LAZY)
//	private CatPredioS6 catPredioS6;
//	@JoinColumn(name = "tipo_conjunto", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatTipoConjunto tipoConjunto;
//	@JoinColumn(name = "responsable_actualizador_predial", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatEnte responsableActualizadorPredial;
//	@JoinColumn(name = "responsable_fiscalizador_predial", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatEnte responsableFiscalizadorPredial;
//	@JoinColumn(name = "ente_horizontal", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatEnte enteHorizontal;
//	@JoinColumn(name = "tenencia", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatTenenciaItem tenencia;
//	@JoinColumn(name = "propiedad", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatPropiedadItem propiedad;
//	@JoinColumn(name = "ciudadela", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatCiudadela ciudadela;
//	@JoinColumn(name = "usuario_creador", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private AclUser usuarioCreador;

//	@JoinColumn(name = "forma_solar", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem formaSolar;
//	@JoinColumn(name = "topografia_solar", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem topografiaSolar;
//
//	@JoinColumn(name = "tipo_via", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem tipovia;
//
//	@JoinColumn(name = "otro_tipo_via", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem otroTipovia;
//	@JoinColumn(name = "unidad_medida", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem unidadMedida;
//	@JoinColumn(name = "clasif_horizontal", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem clasificacionViviendaHorizontal;
//	@JoinColumn(name = "tipo_suelo", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem tipoSuelo;
//	@JoinColumn(name = "tenencia_vivienda", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem tenenciaVivienda;
//	@JoinColumn(name = "uso_solar", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem usoSolar;
//	@JoinColumn(name = "constructividad", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem constructividad;
//	@JoinColumn(name = "clasificacion_suelo", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem clasificacionSuelo;
//	@JoinColumn(name = "tipo_poseedor", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem tipoPoseedor;
//	@JoinColumn(name = "informante", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CatEnte informante;
//	@JoinColumn(name = "clasificacion_vivienda", referencedColumnName = "id")
//	@ManyToOne
//	private CtlgItem clasificacionVivienda;
//	@JoinColumn(name = "tipo_vivienda", referencedColumnName = "id")
//	@ManyToOne
//	private CtlgItem tipoVivienda;
//	@JoinColumn(name = "condicion_vivienda", referencedColumnName = "id")
//	@ManyToOne
//	private CtlgItem condicionVivienda;
//	@JoinColumn(name = "uso_via", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem usoVia;
//	@JoinColumn(name = "forma_adquisicion", referencedColumnName = "id")
//	@ManyToOne
//	private CtlgItem formaAdquisicion;
//	@JoinColumn(name = "viv_cencal_acabado_piso", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem vivCencalAcabadoPiso;
//	@JoinColumn(name = "viv_cencal_estado_acabado_piso", referencedColumnName = "id")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private CtlgItem vivCencalEstadoAcabadoPiso;
//
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "predio")
//	private List<CatPredioAlicuotaComponente> alicuotaComponentes;
//	@OneToMany(mappedBy = "predioColindante", fetch = FetchType.LAZY)
//	private List<CatPredioLinderos> catPredioLinderosList;
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "predio", fetch = FetchType.LAZY)
//	@Where(clause = "estado = 'A'")
//	@Expose
//	private List<CatPredioLinderos> predioList;
//	@OneToMany(mappedBy = "predio", fetch = FetchType.LAZY)
//	private List<CatEscritura> catEscrituraList;
//	@OneToMany(mappedBy = "predio", fetch = FetchType.LAZY)
//
//	@Where(clause = "estado = 'A'")
//	@OneToMany(mappedBy = "predio", fetch = FetchType.LAZY)
//	private List<CatPredioPropietario> catPredioPropietarioList;
//	@Where(clause = "estado = 'A'")
//	@OneToMany(mappedBy = "predio", fetch = FetchType.LAZY)
//	@Expose(serialize = true, deserialize = true)
//	private List<CatPredioPropietarioAnterior> catPredioPropietarioAnteriorList;
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "predio", fetch = FetchType.LAZY)
//	@Where(clause = "estado='A'")
//	@OrderBy(clause = "no_edificacion ASC")
//	private List<CatPredioEdificacion> catPredioEdificacionList;

	// columna para obtener los datossa de los avuos de lo pedios es el valor base
	// multiplicado por la sumatoria de llos coefic ientes de construccion
	@Column(name = "costo_directo")
	private BigDecimal valorAfectacionCoeficenteTerreno;

	@Column(name = "nombre_predio")
	@Size(max = 255)
	private String nombrePredio;
	@Column(name = "fecha_actualizador")
	private Date fechaActualizador;
	@Column(name = "fecha_fiscalizador")
	private Date fechaFiscalizador;
	@Column(name = "firma_actualizador")
	private String firmaActualizador;
	@Column(name = "firma_fiscalizador")
	private String firmaFiscalizador;
	@Column(name = "valor_m2")
	private BigDecimal valorM2;
	@Column(name = "es_calculo_cuantia")
	private Boolean esCalculoCuantia;
	@Column(name = "es_avaluo_verificado")
	private Boolean esAvaluoVerificado;

	@Column(name = "mac_addres_usuario_ingreso")
	private String macAddresUsuarioIngreso;

	@Column(name = "ip_user_session")
	private String ipUserSession;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getProvincia() {
		return provincia;
	}

	public void setProvincia(Short provincia) {
		this.provincia = provincia;
	}

	public Short getCanton() {
		return canton;
	}

	public void setCanton(Short canton) {
		this.canton = canton;
	}

	public Short getParroquia() {
		return parroquia;
	}

	public void setParroquia(Short parroquia) {
		this.parroquia = parroquia;
	}

	public Short getZona() {
		return zona;
	}

	public void setZona(Short zona) {
		this.zona = zona;
	}

	public Short getSector() {
		return sector;
	}

	public void setSector(Short sector) {
		this.sector = sector;
	}

	public Short getMz() {
		return mz;
	}

	public void setMz(Short mz) {
		this.mz = mz;
	}

	public Short getLote() {
		return lote;
	}

	public void setLote(Short lote) {
		this.lote = lote;
	}

	public Short getSolar() {
		return solar;
	}

	public void setSolar(Short solar) {
		this.solar = solar;
	}

	public Short getBloque() {
		return bloque;
	}

	public void setBloque(Short bloque) {
		this.bloque = bloque;
	}

	public Short getPiso() {
		return piso;
	}

	public void setPiso(Short piso) {
		this.piso = piso;
	}

	public Short getUnidad() {
		return unidad;
	}

	public void setUnidad(Short unidad) {
		this.unidad = unidad;
	}

	public String getClaveCat() {
		return claveCat;
	}

	public void setClaveCat(String claveCat) {
		this.claveCat = claveCat;
	}

	public String getPredialant() {
		return predialant;
	}

	public void setPredialant(String predialant) {
		this.predialant = predialant;
	}

	public BigInteger getNumPredio() {
		return numPredio;
	}

	public void setNumPredio(BigInteger numPredio) {
		this.numPredio = numPredio;
	}

	public BigDecimal getAreaSolar() {
		return areaSolar;
	}

	public void setAreaSolar(BigDecimal areaSolar) {
		this.areaSolar = areaSolar;
	}

	public BigDecimal getAreaObras() {
		return areaObras;
	}

	public void setAreaObras(BigDecimal areaObras) {
		this.areaObras = areaObras;
	}

	public BigDecimal getAreaCultivos() {
		return areaCultivos;
	}

	public void setAreaCultivos(BigDecimal areaCultivos) {
		this.areaCultivos = areaCultivos;
	}

	public BigDecimal getAreaDeclaradaConst() {
		return areaDeclaradaConst;
	}

	public void setAreaDeclaradaConst(BigDecimal areaDeclaradaConst) {
		this.areaDeclaradaConst = areaDeclaradaConst;
	}

	public String getNombreUrb() {
		return nombreUrb;
	}

	public void setNombreUrb(String nombreUrb) {
		this.nombreUrb = nombreUrb;
	}

	public Short getUrbSec() {
		return urbSec;
	}

	public void setUrbSec(Short urbSec) {
		this.urbSec = urbSec;
	}

	public Short getNumHogares() {
		return numHogares;
	}

	public void setNumHogares(Short numHogares) {
		this.numHogares = numHogares;
	}

	public Short getNumEspaciosBanios() {
		return numEspaciosBanios;
	}

	public void setNumEspaciosBanios(Short numEspaciosBanios) {
		this.numEspaciosBanios = numEspaciosBanios;
	}

	public Short getNumCelulares() {
		return numCelulares;
	}

	public void setNumCelulares(Short numCelulares) {
		this.numCelulares = numCelulares;
	}

	public Short getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(Short numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public Short getNumDormitorios() {
		return numDormitorios;
	}

	public void setNumDormitorios(Short numDormitorios) {
		this.numDormitorios = numDormitorios;
	}

	public String getUrbMz() {
		return urbMz;
	}

	public void setUrbMz(String urbMz) {
		this.urbMz = urbMz;
	}

	public Date getInstCreacion() {
		return instCreacion;
	}

	public void setInstCreacion(Date instCreacion) {
		this.instCreacion = instCreacion;
	}

	public String getUrbSolarnew() {
		return urbSolarnew;
	}

	public void setUrbSolarnew(String urbSolarnew) {
		this.urbSolarnew = urbSolarnew;
	}

	public String getUrbSecnew() {
		return urbSecnew;
	}

	public void setUrbSecnew(String urbSecnew) {
		this.urbSecnew = urbSecnew;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCalleS() {
		return calleS;
	}

	public void setCalleS(String calleS) {
		this.calleS = calleS;
	}

	public String getNumeroVivienda() {
		return numeroVivienda;
	}

	public void setNumeroVivienda(String numeroVivienda) {
		this.numeroVivienda = numeroVivienda;
	}

	public Boolean getPropiedadHorizontal() {
		return propiedadHorizontal;
	}

	public void setPropiedadHorizontal(Boolean propiedadHorizontal) {
		this.propiedadHorizontal = propiedadHorizontal;
	}

	public BigInteger getPredioRaiz() {
		return predioRaiz;
	}

	public void setPredioRaiz(BigInteger predioRaiz) {
		this.predioRaiz = predioRaiz;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoPredio() {
		return tipoPredio;
	}

	public void setTipoPredio(String tipoPredio) {
		this.tipoPredio = tipoPredio;
	}

	public BigDecimal getCoordx() {
		return coordx;
	}

	public void setCoordx(BigDecimal coordx) {
		this.coordx = coordx;
	}

	public BigDecimal getCoordy() {
		return coordy;
	}

	public void setCoordy(BigDecimal coordy) {
		this.coordy = coordy;
	}

	public Date getFecMod() {
		return fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public String getUsrMod() {
		return usrMod;
	}

	public void setUsrMod(String usrMod) {
		this.usrMod = usrMod;
	}

	public BigDecimal getAvaluoSolar() {
		return avaluoSolar;
	}

	public void setAvaluoSolar(BigDecimal avaluoSolar) {
		this.avaluoSolar = avaluoSolar;
	}

	public BigDecimal getAvaluoConstruccion() {
		return avaluoConstruccion;
	}

	public void setAvaluoConstruccion(BigDecimal avaluoConstruccion) {
		this.avaluoConstruccion = avaluoConstruccion;
	}

	public BigDecimal getAvaluoMunicipal() {
		return avaluoMunicipal;
	}

	public void setAvaluoMunicipal(BigDecimal avaluoMunicipal) {
		this.avaluoMunicipal = avaluoMunicipal;
	}

	public BigDecimal getAvaluoCultivos() {
		return avaluoCultivos;
	}

	public void setAvaluoCultivos(BigDecimal avaluoCultivos) {
		this.avaluoCultivos = avaluoCultivos;
	}

	public BigDecimal getAvaluoObraComplement() {
		return avaluoObraComplement;
	}

	public void setAvaluoObraComplement(BigDecimal avaluoObraComplement) {
		this.avaluoObraComplement = avaluoObraComplement;
	}

	public BigDecimal getAvaluoPlussolar() {
		return avaluoPlussolar;
	}

	public void setAvaluoPlussolar(BigDecimal avaluoPlussolar) {
		this.avaluoPlussolar = avaluoPlussolar;
	}

	public BigDecimal getAvaluoPlusconstruccion() {
		return avaluoPlusconstruccion;
	}

	public void setAvaluoPlusconstruccion(BigDecimal avaluoPlusconstruccion) {
		this.avaluoPlusconstruccion = avaluoPlusconstruccion;
	}

	public BigDecimal getAvaluoPlusmunicipal() {
		return avaluoPlusmunicipal;
	}

	public void setAvaluoPlusmunicipal(BigDecimal avaluoPlusmunicipal) {
		this.avaluoPlusmunicipal = avaluoPlusmunicipal;
	}

	public BigDecimal getAvaluoPluscultivos() {
		return avaluoPluscultivos;
	}

	public void setAvaluoPluscultivos(BigDecimal avaluoPluscultivos) {
		this.avaluoPluscultivos = avaluoPluscultivos;
	}

	public BigDecimal getAvaluoPluObraComplement() {
		return avaluoPluObraComplement;
	}

	public void setAvaluoPluObraComplement(BigDecimal avaluoPluObraComplement) {
		this.avaluoPluObraComplement = avaluoPluObraComplement;
	}

	public Integer getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}

	public Boolean getTipoViviendaHorizontal() {
		return tipoViviendaHorizontal;
	}

	public void setTipoViviendaHorizontal(Boolean tipoViviendaHorizontal) {
		this.tipoViviendaHorizontal = tipoViviendaHorizontal;
	}

	public Boolean getOcupacionViviendaHorizontal() {
		return ocupacionViviendaHorizontal;
	}

	public void setOcupacionViviendaHorizontal(Boolean ocupacionViviendaHorizontal) {
		this.ocupacionViviendaHorizontal = ocupacionViviendaHorizontal;
	}

	public Boolean getRequierePerfeccionamiento() {
		return requierePerfeccionamiento;
	}

	public void setRequierePerfeccionamiento(Boolean requierePerfeccionamiento) {
		this.requierePerfeccionamiento = requierePerfeccionamiento;
	}

	public Integer getAniosSinPerfeccionamiento() {
		return aniosSinPerfeccionamiento;
	}

	public void setAniosSinPerfeccionamiento(Integer aniosSinPerfeccionamiento) {
		this.aniosSinPerfeccionamiento = aniosSinPerfeccionamiento;
	}

	public Integer getAniosPosesion() {
		return aniosPosesion;
	}

	public void setAniosPosesion(Integer aniosPosesion) {
		this.aniosPosesion = aniosPosesion;
	}

	public String getNombrePuebloEtnia() {
		return nombrePuebloEtnia;
	}

	public void setNombrePuebloEtnia(String nombrePuebloEtnia) {
		this.nombrePuebloEtnia = nombrePuebloEtnia;
	}

	public Boolean getFichaMadre() {
		return fichaMadre;
	}

	public void setFichaMadre(Boolean fichaMadre) {
		this.fichaMadre = fichaMadre;
	}

	public BigDecimal getValorAfectacionCoeficenteTerreno() {
		return valorAfectacionCoeficenteTerreno;
	}

	public void setValorAfectacionCoeficenteTerreno(BigDecimal valorAfectacionCoeficenteTerreno) {
		this.valorAfectacionCoeficenteTerreno = valorAfectacionCoeficenteTerreno;
	}

	public String getNombrePredio() {
		return nombrePredio;
	}

	public void setNombrePredio(String nombrePredio) {
		this.nombrePredio = nombrePredio;
	}

	public Date getFechaActualizador() {
		return fechaActualizador;
	}

	public void setFechaActualizador(Date fechaActualizador) {
		this.fechaActualizador = fechaActualizador;
	}

	public Date getFechaFiscalizador() {
		return fechaFiscalizador;
	}

	public void setFechaFiscalizador(Date fechaFiscalizador) {
		this.fechaFiscalizador = fechaFiscalizador;
	}

	public String getFirmaActualizador() {
		return firmaActualizador;
	}

	public void setFirmaActualizador(String firmaActualizador) {
		this.firmaActualizador = firmaActualizador;
	}

	public String getFirmaFiscalizador() {
		return firmaFiscalizador;
	}

	public void setFirmaFiscalizador(String firmaFiscalizador) {
		this.firmaFiscalizador = firmaFiscalizador;
	}

	public BigDecimal getValorM2() {
		return valorM2;
	}

	public void setValorM2(BigDecimal valorM2) {
		this.valorM2 = valorM2;
	}

	public Boolean getEsCalculoCuantia() {
		return esCalculoCuantia;
	}

	public void setEsCalculoCuantia(Boolean esCalculoCuantia) {
		this.esCalculoCuantia = esCalculoCuantia;
	}

	public Boolean getEsAvaluoVerificado() {
		return esAvaluoVerificado;
	}

	public void setEsAvaluoVerificado(Boolean esAvaluoVerificado) {
		this.esAvaluoVerificado = esAvaluoVerificado;
	}

	public String getMacAddresUsuarioIngreso() {
		return macAddresUsuarioIngreso;
	}

	public void setMacAddresUsuarioIngreso(String macAddresUsuarioIngreso) {
		this.macAddresUsuarioIngreso = macAddresUsuarioIngreso;
	}

	public String getIpUserSession() {
		return ipUserSession;
	}

	public void setIpUserSession(String ipUserSession) {
		this.ipUserSession = ipUserSession;
	}
	
	
	

}
