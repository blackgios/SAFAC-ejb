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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
@Table(name = "PerfilCliente")
@NamedQueries({
@NamedQuery(name = "PerfilCliente.findByCvePerfClte", query = "SELECT pc FROM PerfilCliente AS pc WHERE pc.cvePerfClte = :cvePerfClte"),
@NamedQuery(name = "PerfilCliente.findById", query = "SELECT pc FROM PerfilCliente AS pc WHERE pc.cvePerfClte = :id"),
@NamedQuery(name = "PerfilCliente.findByAll", query = "SELECT pc FROM PerfilCliente AS pc")
})
@Alta
@Baja
@Cambio
@Listable
public class PerfilCliente implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name ="cvePerfClte")
    private int cvePerfClte = 0;
    
    @Column(name = "descripcion", length = 255)
    private String descripcion = "";
    
    @Column(name = "rangoMin",precision = 9, scale = 8)
    private double rangoMinimo = 0.0;
    
    @Column(name = "rangoMax",precision = 9, scale = 8)
    private double rangoMaximo = 0.0;
    
    @Column(name = "fechaCaptura")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCaptura = new Date(new java.util.Date().getTime());;

    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new java.util.Date().getTime());;
        
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";
    /**
     * <li>Constructor para la Entity PerfilDeContrato con la CvePerfClte de PerfilCliente</li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param CvePerfClte de la Tabla  PerfilCliente: CvePerfClte
     */
    public PerfilCliente(int CvePerfClte) {
        this.cvePerfClte = CvePerfClte;
    }
     /**
     * <li>Constructor para la Entity PerfilDeContrato</li>
     * <li>Tabla De referencia PerfilCliente </li>
     * @param Sin Parametros
     */
    public PerfilCliente() {
    }

     /**
     * <li>Obtiene: CvePerfClte </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: PerfilCliente.CvePerfClte
     */
    public int getCvePerfClte() {
        return cvePerfClte;
    }

    
    @Override
    public Integer getID() {
        return cvePerfClte;
    }
    /**
     * <li>Establece: CvePerfClte </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * <li>Campo: PerfilCliente.CvePerfClte </li>
     * @param CvePerfClte
     * @return 
     */
    
    public void setCvePerfClte(int cvePerfClte) {
        this.cvePerfClte = cvePerfClte;
    }
    
    public void setId(int CvePerfClte) {
        this.cvePerfClte = CvePerfClte;
    }
    /**
     * <li>Obtiene: Descripcion </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: PerfilCliente.Descripcion
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * <li>Establece: Descripcion </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * <li>Campo: PerfilCliente.Descripcion </li>
     * @param Descripcion
     * @return 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * <li>Obtiene: Usuario Capturo </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: PerfilCliente.UsuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }
    /**
     * <li>Establece: Usuario Capturo </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * <li>Campo: PerfilCliente.UsuarioCapturo </li>
     * @param CvePerfClte
     * @return 
     */
    public void setUsuarioCapturo(String UCapturo) {
        this.usuarioCapturo = UCapturo;
    }
    /**
     * <li>Obtiene: RangoMinimo </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: PerfilCliente.RangoMin
     */
    public double getRangoMinimo() {
        return rangoMinimo;
    }
    /**
     * <li>Establece: Rango Minimo </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * <li>Campo: PerfilCliente.RangoMin </li>
     * @param RangoMin
     * @return 
     */
    public void setRangoMinimo(double rangoMin) {
        this.rangoMinimo = rangoMin;
    }
    /**
     * <li>Obtiene: RangoMaximo </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: PerfilCliente.RangoMax
     */
    public double getRangoMaximo() {
        return rangoMaximo;
    }
    /**
     * <li>Establece: Rango Maximo </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * <li>Campo: PerfilCliente.RangoMax </li>
     * @param Rango Maximo
     * @return 
     */
    public void setRangoMaximo(double rangoMax) {
        this.rangoMaximo = rangoMax;
    }
    /**
     * <li>Obtiene: Fecha Captura </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: PerfilCliente.FecCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }
    /**
     * <li>Establece: Fecha Captura </li>
     * <li>Tabla De referencia: PerfilCliente </li>
     * <li>Campo: PerfilCliente.FecCaptura </li>
     * @param FechaCaptura
     * @return 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PerfilCliente other = (PerfilCliente) obj;
        if (this.cvePerfClte != other.cvePerfClte) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.cvePerfClte;
        return hash;
    }
    
    /**
     * @return the horaCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }

    /**
     * @param horaCaptura the horaCaptura to set
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }
 }
