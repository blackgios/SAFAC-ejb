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
@Alta
@Baja
@Cambio
@Listable
@Table(name = "Estado", uniqueConstraints = {@UniqueConstraint(columnNames = {"claveEstado"})})
@NamedQueries({
    @NamedQuery(name = "Estado.findByClaveEstado", query = "SELECT e FROM Estado AS e WHERE e.claveEstado = :claveEstado"),
    @NamedQuery(name = "Estado.findByAll", query = "SELECT e FROM Estado AS e"),
    @NamedQuery(name = "Estado.findByID", query = "SELECT e FROM Estado AS e WHERE e.id = :id"),
    //@NamedQuery(name = "Estado.findByIDMax", query = "SELECT max(e.id) FROM Estado")
})
public class Estado implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    private Integer id = 0;
    
    @Column(name = "claveEstado", length = 20)
    private String claveEstado;
    
    @ManyToOne(targetEntity = Pais.class)
    @JoinColumn(name = "clavePais", referencedColumnName = "id")
    private Pais clavePais;
    
    @Column(name = "descripcion", length = 255)
    private String descripcion = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";
    
    /**
     * <li>Constructor para la Entity Estado</li>
     * <li>Tabla de referencia: Estado</li>
     */
    public Estado() {
    }

    /**
     * <li>Constructor para la Entity Estado con la clave de Estado</li>
     * <li>Tabla de referencia: Estado</li>
     * @param String claveEstado 
     */
    public Estado(String claveEstado) {
        this.claveEstado = claveEstado;
    }
    
    /**
     * <li>Obtiene: ID</li>
     * <li>Tabla de referencia: Estado</li>
     * @return Integer ID
     */
    @Override
    public Integer getID() {
        return id;
    }
    
    /**
     * <li>Establece: ID</li>
     * <li>Tabla de referencia: Estado</li>
     * @param Integer ID 
     */
    public void setID(Integer id) {
        this.id = id;
    }
    
    /**
     * <li>Obtiene: Descripcion</li>
     * <li>Tabla de referencia: Estado</li>
     * @return String Descripcion
     */
    @Override
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
     * <li>Establece: Descripcion</li>
     * <li>Tabla de referencia: Estado</li>
     * @param String Descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * <li>Obtiene: claveEstado</li>
     * <li>Tabla de referencia: Estado</li>
     * @return String claveEstado
     */
    public String getClaveEstado() {
        return claveEstado;
    }

    /**
     * <li>Establece: claveEstado</li>
     * <li>Tabla de referencia: Estado</li>
     * @param String claveEstado
     */
    public void setClaveEstado(String claveEstado) {
        this.claveEstado = claveEstado;
    }

    /**
     * <li>Obtiene: clavePais</li>
     * <li>Tabla de referencia: Estado</li>
     * @return Pais clavePais
     */
    public Pais getClavePais() {
        return clavePais;
    }

    /**
     * <li>Establece: clavePais</li>
     * <li>Tabla de referencia: Estado</li>
     * @param Pais clavePais
     */
    public void setClavePais(Pais clavePais) {
        this.clavePais = clavePais;
    }

    /**
     * <li>Obtiene: fechaCaptura</li>
     * <li>Tabla de referencia: Estado</li>
     * @return Date fechaCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    /**
     * <li>Establece: fechaCaptura</li>
     * <li>Tabla de referencia: Estado</li>
     * @param Date fechaCaptura
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    /**
     * <li>Obtiene: horaCaptura</li>
     * <li>Tabla de referencia: Estado</li>
     * @return horaCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }

    /**
     * <li>Establece: horaCaptura</li>
     * <li>Tabla de referencia: Estado</li>
     * @param Time horaCaptura
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }

    /**
     * <li>Obtiene: usuarioCapturo</li>
     * <li>Tabla de referencia: Estado</li>
     * @return usuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }

    /**
     * <li>Establece: usuarioCapturo</li>
     * <li>Tabla de referencia: Estado</li>
     * @param String usuarioCapturo
     */
    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Estado other = (Estado) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
