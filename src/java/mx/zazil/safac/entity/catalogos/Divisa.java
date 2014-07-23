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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import mx.zazil.cliente.entity.detalle.EstatusVigenciaDetalle;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
@Table(name = "Divisa")
@NamedQueries({
    @NamedQuery(name = "Divisa.findByAll", query = "SELECT d FROM Divisa AS d"),
    @NamedQuery(name = "Divisa.findByClaveDivisa", query = "SELECT d FROM Divisa AS d WHERE d.claveDivisa = :claveDivisa"),
    @NamedQuery(name = "Divisa.findByID", query = "SELECT d FROM Divisa AS d WHERE d.id = :id")
})
public class Divisa implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    private Integer id = 0;
    @Column(name = "claveDivisa", length = 3)
    private String claveDivisa = "";
    @Column(name = "descripcion", length = 45)
    private String descripcion = "";
    @Column(name = "simbolo", length = 24)
    private String simbolo = "";
    @Column(name = "estatus")
    @Enumerated(EnumType.STRING)
    private EstatusVigenciaDetalle estatus;

    public Divisa() {
    }

    public Divisa(String claveDivisa) {
        this.claveDivisa = claveDivisa;
    }
    
    /**
     * <li>Obtiene: Descripcion</li>
     * <li>Tabla de referencia: Divisa</li>
     * @return String Descripcion
     */
    @Override
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
     * <li>Establece: descripcion</li>
     * <li>Tabla de referencia: Divisa</li>
     * @param String descripcion
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    /**
     * <li>Obtiene: ID</li>
     * <li>Tabla de referencia: Divisa</li>
     * @return Integer ID
     */
    @Override
    public Integer getID() {
        return this.id;
    }

    /**
     * <li>Establece: ID</li>
     * <li>Tabla de referencia: Divisa</li>
     * @param Integer id
     */
    public void setID(Integer id) {
        this.id = id;
    }

    /**
     * <li>Obtiene: claveDivisa</li>
     * <li>Tabla de referencia: Divisa</li>
     * @return String claveDivisa
     */
    public String getClaveDivisa() {
        return claveDivisa;
    }

    /**
     * <li>Establece: claveDivisa</li>
     * <li>Tabla de referencia: Divisa</li>
     * @param String claveDivisa
     */
    public void setClaveDivisa(String claveDivisa) {
        this.claveDivisa = claveDivisa;
    }

    /**
     * <li>Obtiene: simbolo</li>
     * <li>Tabla de referencia: Divisa</li>
     * @return String simbolo
     */
    public String getSimbolo() {
        return simbolo;
    }

    /**
     * <li>Establece: simbolo</li>
     * <li>Tabla de referencia: Divisa</li>
     * @param String simbolo
     */
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    /**
     * <li>Obtiene: estatus</li>
     * <li>Tabla de referencia: Divisa</li>
     * @return EstatusVigenciaDetalle estatus
     */
    public EstatusVigenciaDetalle getEstatus() {
        return estatus;
    }

    /**
     * <li>Establece: estatus</li>
     * <li>Tabla de referencia: Divisa</li>
     * @param EstatusVigenciaDetalle estatus
     */
    public void setEstatus(EstatusVigenciaDetalle estatus) {
        this.estatus = estatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Divisa other = (Divisa) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
