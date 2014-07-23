/**
 * Esta clase ha sido reescrita, se desconoce el autor de la misma,
 * se estructura como se hace normalmente, primero los campos,
 * despues los constructores, luego getters y setters, si aplica metodos
 * propios de procesamiento y al final se sobreescriben 
 * hashCode e equals().
 */
package mx.zazil.safac.entity.catalogos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.zazil.safac.entity.catalogos.Pais[ id=" + id + " ]";
    }
    
}
