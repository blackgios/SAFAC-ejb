/**
 * Esta clase ha sido reescrita, se desconoce el autor de la misma,
 * se estructura como se hace normalmente, primero los campos,
 * despues los constructores, luego getters y setters, si aplica metodos
 * propios de procesamiento y al final se sobreescriben 
 * hashCode e equals().
 */
package mx.zazil.safac.entity.catalogos;

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;
import mx.zazil.cliente.entity.detalle.TipoDireccionDetalle;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
@Table(name = "Direccion", uniqueConstraints = {@UniqueConstraint(columnNames = {"claveDireccion"})})
@NamedQueries({
    @NamedQuery(name = "Direccion.findByClaveDireccion", query = "SELECT d FROM Direccion AS d WHERE d.claveDireccion = :claveDireccion"),
    @NamedQuery(name = "Direccion.findByAll", query = "SELECT d FROM Direccion AS d"),
    @NamedQuery(name = "Direccion.findByID", query = "SELECT d FROM Direccion AS d WHERE d.ID = :ID"),
    //@NamedQuery(name = "Direccion.findByIdMax", query = "SELECT MAX(id) FROM Direccion")
})
public class Direccion implements Serializable, Catalogo{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer ID = 0;
    
    @ManyToOne(targetEntity = Estado.class)
    @JoinColumn(name = "claveEstado", referencedColumnName = "id")
    private Estado claveEstado;
    
    @ManyToOne(targetEntity = Colonia.class)
    @JoinColumn(name = "claveEstado", referencedColumnName = "id")
    private Colonia claveColonia;
    
    @ManyToOne(targetEntity = Municipio.class)
    @JoinColumn(name = "claveMunicipioDel", referencedColumnName = "claveMunicipioDel")
    private Municipio claveMunicipioDel;
    
    @Column(name = "calleNumero", length = 255)
    private String calleNumero = "";
    
    @Column(name = "claveDireccion", length = 255)
    private String claveDireccion = "";
    
    @Column(name = "tipoDireccion")
    @Enumerated(EnumType.STRING)
    private TipoDireccionDetalle tipoDireccion;

    public Direccion() {
    }
    
    /**
     * <li>Obtiene: ID</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return Integer ID
     */
    @Override
    public Integer getID() {
        return this.ID;
    }

    /**
     * <li>Establece: ID</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param Integer ID
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    /**
     * <li>Obtiene: claveDireccion</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return String claveDireccion
     */
    @Override
    public String getDescripcion() {
        return this.claveDireccion;
    }

    /**
     * <li>Obtiene: claveEstado</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return Integer claveEstado
     */
    public Estado getClaveEstado() {
        return claveEstado;
    }

    /**
     * <li>Establece: claveEstado</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param Estado claveEstado
     */
    public void setClaveEstado(Estado claveEstado) {
        this.claveEstado = claveEstado;
    }

    /**
     * <li>Obtiene: claveColonia</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return Colonia claveColonia
     */
    public Colonia getClaveColonia() {
        return claveColonia;
    }

    /**
     * <li>Establece: claveColonia</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param Colonia claveColonia
     */
    public void setClaveColonia(Colonia claveColonia) {
        this.claveColonia = claveColonia;
    }

    /**
     * <li>Obtiene: claveMunicipioDel</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return Municipio Delegacion
     */
    public Municipio getClaveMunicipioDel() {
        return claveMunicipioDel;
    }

    /**
     * <li>Establece: claveMunicipioDel</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param Municipio claveMunicipioDel
     */
    public void setClaveMunicipioDel(Municipio claveMunicipioDel) {
        this.claveMunicipioDel = claveMunicipioDel;
    }

    /**
     * <li>Obtiene: calleNumero</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return String calleNumero
     */
    public String getCalleNumero() {
        return calleNumero;
    }

    /**
     * <li>Establece: calleNumero</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param String calleNumero
     */
    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    /**
     * <li>Obtiene: claveDireccion</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return String claveDireccion
     */
    public String getClaveDireccion() {
        return claveDireccion;
    }

    /**
     * <li>Establece: claveDireccion</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param String claveDireccion
     */
    public void setClaveDireccion(String claveDireccion) {
        this.claveDireccion = claveDireccion;
    }

    /**
     * <li>Obtiene: tipoDireccion</li>
     * <li>Tabla de referencia: Direccion</li>
     * @return TipoDireccionDetalle tipoDireccion
     */
    public TipoDireccionDetalle getTipoDireccion() {
        return tipoDireccion;
    }

    /**
     * <li>Establece: tipoDireccion</li>
     * <li>Tabla de referencia: Direccion</li>
     * @param TipoDireccionDetalle tipoDireccion
     */
    public void setTipoDireccion(TipoDireccionDetalle tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.ID != null ? this.ID.hashCode() : 0);
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
        final Direccion other = (Direccion) obj;
        if (this.ID != other.ID && (this.ID == null || !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }
    
}
