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
@Alta
@Baja
@Cambio
@Listable
@NamedQueries({
    @NamedQuery(name = "Actividad.findByAll", query = "SELECT object(a) FROM Actividad a"),
    @NamedQuery(name = "Actividad.findByID",query = "SELECT a FROM Actividad AS a WHERE a.ID = :ID")
})
public class Actividad implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="claveActividad", length = 2)
    private Integer ID;
    @Column(name="descripcion", length = 255)
    private String descripcion;
    @Column(name="fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    @Column(name="horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    @Column(name="usuarioCapturo", length = 20)
    private String usuarioCapturo;

    public Actividad() {
    }

    public Actividad(Integer claveActividad) {
        this.ID = claveActividad;
    }

    @Override
    public Integer getID() {
        return ID;
    }

    public void setID(Integer claveActividad) {
        this.ID = claveActividad;
    }
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.ID != null ? this.ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actividad other = (Actividad) obj;
        if (this.ID != other.ID && (this.ID == null || !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }
    
}
