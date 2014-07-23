/**
 * Esta clase ha sido reescrita, se desconoce el autor de la misma,
 * se estructura como se hace normalmente, primero los campos,
 * despues los constructores, luego getters y setters, si aplica metodos
 * propios de procesamiento y al final se sobreescriben 
 * hashCode e equals().
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
@Alta
@Baja
@Cambio
@Listable
@Table(name = "FaseContrato", uniqueConstraints = {@UniqueConstraint(columnNames = {"claveFaseContrato"})})
@NamedQueries({
    @NamedQuery(name = "FaseContrato.findByClaveFaseContrato", query = "SELECT fc FROM FaseContrato AS fc WHERE fc.claveFaseContrato = :claveFaseContrato"),
    @NamedQuery(name = "FaseContrato.findById", query = "SELECT fc FROM FaseContrato AS fc WHERE fc.id = :id"),
    @NamedQuery(name = "FaseContrato.findByAll", query = "SELECT fc FROM FaseContrato AS fc"),
    //@NamedQuery(name = "FaseContrato.findByIdMax", query = "SELECT max(id) FROM FaseContrato")
})
public class FaseContrato implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id = 0;
    
    @Column(name = "claveFaseContrato")
    private String claveFaseContrato = "";
    
    @Column(name = "descripcion", length = 255)
    private String descripcion;
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());

    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";

    
    public FaseContrato() {
    }

    public FaseContrato(String claveFaseContrato) {
        this.claveFaseContrato = claveFaseContrato;
    }
    
    /**
     * <li>Obtiene: ID</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @return Integer ID
     */
    @Override
    public Integer getID() {
        return this.id;
    }

    /**
     * <li>Establece: ID</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @param Integer ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * <li>Obtiene: descripcion</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @return String descripcion
     */
    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * <li>Establece: descripcion</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @param String descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * <li>Obtiene: claveFaseContrato</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @return String claveFaseContrato
     */
    public String getClaveFaseContrato() {
        return claveFaseContrato;
    }

    /**
     * <li>Establece: claveFaseContrato</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @param String claveFaseContrato
     */
    public void setClaveFaseContrato(String claveFaseContrato) {
        this.claveFaseContrato = claveFaseContrato;
    }

    /**
     * <li>Obtiene: fechaCaptura</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @return Date fechaCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    /**
     * <li>Establece: fechaCaptura</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @param Date fechaCaptura
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    /**
     * <li>Obtiene: horaCaptura</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @return Time horaCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }

    /**
     * <li>Establece: horaCaptura</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @param Time horaCaptura
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }

    /**
     * <li>Obtiene: usuarioCapturo</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @return String usuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }

    /**
     * <li>Establece: usuarioCapturo</li>
     * <li>Tabla de referencia: FaseContrato</li>
     * @param String usuarioCapturo
     */
    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final FaseContrato other = (FaseContrato) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
}
