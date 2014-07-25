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
import javax.persistence.TemporalType;
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
@Table (name = "Modulo")
@Alta
@Baja
@Cambio
@Listable
@NamedQueries({
    @NamedQuery(name = "Modulo.findByAll",query = "SELECT m FROM Modulo m"),
    @NamedQuery(name = "Modulo.findById",query = "SELECT m FROM Modulo AS m WHERE m.cveModulo = :id"),
    @NamedQuery(name = "Modulo.findByCveModulo",query = "SELECT m FROM Modulo AS m WHERE m.cveModulo = :cveModulo")
    
})
public class Modulo implements Serializable, Catalogo{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cveModulo")    
    private int cveModulo = 0;
    
    
    @Column(name = "descripcion",length = 255)
    private String descripcion = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new java.util.Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new java.util.Date().getTime());
    
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";
    
    public Modulo(int cveModulo) {
        this.cveModulo = cveModulo;
    }

    public Modulo() {
    }
  
    @Override
    public Integer getID() {
        return cveModulo;
    }

    public void setID(int cveModulo) {
        this.cveModulo = cveModulo;
    }

    public int getCveModulo() {
        return cveModulo;
    }

    public void setCveModulo(int cveModulo) {
        this.cveModulo = cveModulo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Time getHoraCaptura() {
        return horaCaptura;
    }

    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }

    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }

    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }

    

    
}