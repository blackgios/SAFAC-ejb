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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
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
@Table(name = "Plaza", uniqueConstraints = {@UniqueConstraint(columnNames={"cvePlaza"})})
@NamedQueries({
@NamedQuery(name = "Plaza.findByCvePlaza", query = "SELECT p FROM Plaza AS p WHERE p.cvePlaza = :CvePlaza"),
@NamedQuery(name = "Plaza.findByAll", query ="SELECT p FROM Plaza AS p"),
@NamedQuery(name = "Plaza.findById", query ="SELECT p FROM Plaza AS p WHERE p.id = :id"),
//@NamedQuery(name = "Plaza.findByIdMax", query ="SELECT max(id) FROM Plaza")
})
@Alta
@Baja
@Listable
@Cambio

public class Plaza implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private int id = 0;
    
    @Column(name = "cvePlaza", length = 255)
    private String cvePlaza = "";
    
    @ManyToOne(targetEntity = Estado.class)
    @JoinColumn(name = "cveEstado" , referencedColumnName = "cveEstado")    
    private Estado cveEstado;
 
    @Column(name = "descripcion", length = 255)
    private String descripcion = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new java.util.Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new java.util.Date().getTime());;
    
    @Column ( name = "usuarioCapturo" , length = 20)
    private String usuarioCapturo = "";
    /**
     * <li>Constructor para la Entity Plaza con la Clave de Plaza</li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Clave de la Tabla  Plaza: CvePlaza
     */
    public Plaza(String cvePlaza) {
        this.cvePlaza = cvePlaza;
    }
    /**
     * <li>Constructor para la Entity Plaza</li>
     * <li>Tabla De referencia Plaza </li>
     * @param Sin Parametros
     */
    public Plaza() {
    }
     /**
     * <li>Obtiene: CvePlaza </li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Plaza.CvePlaza
     */
    
    public String getCvePlaza() {
        return cvePlaza;
    }
    
    @Override
    public Integer getID() {
        return id;
    }
    /**
     * <li>Establece: CvePlaza </li>
     * <li>Tabla De referencia: Plaza </li>
     * <li>Campo: Plaza.CvePlaza </li>
     * @param CvePlaza
     * @return 
     */
    
    public void setCvePlaza(String cvePlaza) {
        this.cvePlaza = cvePlaza;
    }
    
    public void setId(int id) {
        this.id = id;
    }
     /**
     * <li>Obtiene: Descripcion </li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Plaza.Descripcion
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * <li>Establece: Dscripcion </li>
     * <li>Tabla De referencia: Plaza </li>
     * <li>Campo: Plaza.Descripcion </li>
     * @param Descripcion
     * @return 
     */
    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    /**
     * <li>Obtiene: Fecha Captura </li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Plaza.FecCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }
    /**
     * <li>Establece: Fecha Captura </li>
     * <li>Tabla De referencia: Plaza </li>
     * <li>Campo: Plaza.FecCaptura </li>
     * @param FecCaptura
     * @return 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }
    /**
     * <li>Obtiene: HoraCaptura </li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Plaza.HoraCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }
    /**
     * <li>Establece: Hora Captura </li>
     * <li>Tabla De referencia: Plaza </li>
     * <li>Campo: Plaza.HoraCaptura</li>
     * @param HoraCaptura
     * @return 
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }
    /**
     * <li>Obtiene: UsuarioCapturo </li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Plaza.UsuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }
    /**
     * <li>Establece: Usuario Capturo </li>
     * <li>Tabla De referencia: Plaza </li>
     * <li>Campo: Plaza.UsuarioCapturo </li>
     * @param UsuarioCapturo
     * @return 
     */
    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }
  
    /**
     * <li>Obtiene: CveEstado </li>
     * <li>Tabla De referencia: Plaza </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Plaza.CveEstado
     */
    public String getCveEstado() {
        return cveEstado.getDescripcion();
    }
    /**
     * <li>Establece: CveEstado </li>
     * <li>Tabla De referencia: Plaza </li>
     * <li>Campo: Plaza.CveEstado </li>
     * @param CveEstado
     * @return 
     */
    public void setCveEstado(Estado cveEstado) {
        this.cveEstado = cveEstado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plaza other = (Plaza) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

}