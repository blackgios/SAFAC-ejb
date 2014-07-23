/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.safac.entity.catalogos;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import mx.zazil.cliente.entity.detalle.ColoniaTipoAsentamientoDetalle;
import mx.zazil.entity.Catalogo;
import mx.zazil.security.Alta;
import mx.zazil.security.Baja;
import mx.zazil.security.Cambio;
import mx.zazil.security.Listable;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
@Alta
@Baja
@Cambio
@Listable
@Table (name = "Colonia", uniqueConstraints = {@UniqueConstraint(columnNames={"cveColonia"})})
@NamedQueries({
    @NamedQuery(name = "Colonia.findByCveColonia", query= "SELECT c FROM Colonia as c WHERE c.claveColonia = :claveColonia"),
    @NamedQuery(name = "Colonia.findByCodPost", query= "SELECT c FROM Colonia as c WHERE c.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Colonia.findByAll" , query = "SELECT c FROM Colonia as c"),
    @NamedQuery(name = "Colonia.findByID" , query = "SELECT c FROM Colonia as c WHERE c.ID = :ID"),
    @NamedQuery(name = "Colonia.findByIDMax" , query = "SELECT max(ID) FROM Colonia")
})
public class Colonia implements Serializable, Catalogo{

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer ID = 0;
    @Column(name = "claveColonia",length = 6)
    private String claveColonia = "";
    @Column(name = "codigoPostal", length = 6)
    private String codigoPostal = "";
    @Column(name = "descripcion", length = 255)
    private String descripcion = "";
    @ManyToOne(targetEntity = Municipio.class)
    @JoinColumn(name = "claveMpioDel", referencedColumnName = "cveMpioDel") 
    private Municipio municipio;
    @Column(name = "tipoAsentamiento")
    @Enumerated(EnumType.STRING)
    private ColoniaTipoAsentamientoDetalle tipoAsentamiento;
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    @Column (name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    @Column (name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";
    
    /**
     * <li>Constructor para la Entity Colonia</li>
     * <li>Tabla de referencia Colonia </li>
     * @param Sin Parametros
     */
    public Colonia() {
    }
    /**
     * <li>Constructor para la Entity Colonia</li>
     * <li>Tabla de Referencia Colonia</li>
     * @param ID 
     */
    public Colonia(Integer ID) {
        this.ID = ID;
    }

    public String getClaveColonia() {
        return claveColonia;
    }

    public void setClaveColonia(String claveColonia) {
        this.claveColonia = claveColonia;
    }
    
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    /**
     * <li>Obtiene: Descripcion </li>
     * <li>Tabla de referencia: Colonia </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Colonia.Descripcion
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * <li>Establece: Descripcion</li>
     * <li>Tabla de referencia: Colonia</li>
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * <li>Obtiene: Clave Municipio</li>
     * <li>Tabla de referencia: Colonia</li>
     * @return 
     */
    public String getMunicipio() {
        return municipio.getDescripcion();
    }
    /**
     * <li>Establece: Clave Municipio </li>
     * <li>Tabla De referencia: Colonia </li>
     * <li>Campo: Actividad.CveMunicipio </li>
     * @param Clave de Municipio
     * @return 
     */
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
    public ColoniaTipoAsentamientoDetalle getTipoAsentamiento() {
        return tipoAsentamiento;
    }

    public void setTipoAsentamiento(ColoniaTipoAsentamientoDetalle tipoAsentamiento) {
        this.tipoAsentamiento = tipoAsentamiento;
    }
    
    
    

    public Date getFechaCaptura() {
        return fechaCaptura;
    }
     /**
     * <li>Establece: Fecha Captura </li>
     * <li>Tabla De referencia: Colonia </li>
     * <li>Campo: Colonia.FecCaptura </li>
     * @param Fecha Captura
     * @return 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }
    /**
     * <li>Obtiene: Hora Captura </li>
     * <li>Tabla De referencia: Colonia </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Colonia.FecCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }
     /**
     * <li>Establece: Hora Captura </li>
     * <li>Tabla De referencia: Colonia </li>
     * <li>Campo: Colonia.HoraCaptura </li>
     * @param Hora Captura
     * @return 
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }
    /**
     * <li>Obtiene: Usuario Capturo </li>
     * <li>Tabla De referencia: Colonia </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Colonia.FecCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }
     /**
     * <li>Establece: Usuario Capturo </li>
     * <li>Tabla De referencia: Colonia </li>
     * <li>Campo: Colonia.UsuarioCapturo </li>
     * @param Usuario Capturo
     * @return 
     */
    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }

    

    @Override
    public Integer getID() {
        return ID;
    }

    public void setId(Integer ID) {
        this.ID = ID;
    }

    

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Colonia other = (Colonia) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.ID;
        return hash;
    }
    
    
}