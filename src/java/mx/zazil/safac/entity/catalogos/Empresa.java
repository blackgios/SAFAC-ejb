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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
@Table(name = "Empresa")
@NamedQueries({
    @NamedQuery(name = "Empresa.findByAll", query = "SELECT e FROM Empresa AS e"),
    @NamedQuery(name = "Empresa.findByClaveEmpresa", query = "SELECT e FROM Empresa AS e WHERE e.claveEmpresa = :claveEmpresa "),
    @NamedQuery(name = "Empresa.findById", query = "SELECT e FROM Empresa AS e WHERE e.claveEmpresa = :claveEmpresa"),
    @NamedQuery(name = "Empresa.findByRazonSocial", query = "SELECT e FROM Empresa AS e WHERE e.razonSocial = :razonSocial")
})
public class Empresa implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "claveEmpresa")
    private Integer claveEmpresa = 0;

    @Column(name = "descripcion", length = 255)
    private String descripcion = "";
    
    @Column(name = "razonSocial", length = 255)
    private String razonSocial = "";
    
    @Column(name = "RFC", length = 15)
    private String RFC = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";

    public Empresa() {
    }
    
    public Empresa(Integer claveEmpresa){
        this.claveEmpresa = claveEmpresa;
    }

    /**
     * <li>Obtiene: claveEmpresa</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return Integer claveEmpresa
     */
    public Integer getClaveEmpresa() {
        return claveEmpresa;
    }

    /**
     * <li>Establece: claveEmpresa</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param Integer claveEmpresa 
     */
    public void setClaveEmpresa(Integer claveEmpresa) {
        this.claveEmpresa = claveEmpresa;
    }
    
    /**
     * <li>Obtiene: claveEmpresa</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return Integer claveEmpresa
     */
    @Override
    public Integer getID() {
        return claveEmpresa;
    }

    /**
     * <li>Establece: claveEmpresa</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param Integer claveEmpresa 
     */
    public void setID(Integer id) {
        this.claveEmpresa = id;
    }

    /**
     * <li>Obtiene: descripcion</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return String descripcion
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * <li>Establece: descripcion</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param String descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * <li>Obtiene: razonSocial</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return String razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * <li>Establece: razonSocial</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param String razonSocial
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * <li>Obtiene: rfc</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return String rfc
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * <li>Establece: rfc</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param String rfc
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * <li>Obtiene: fechaCaptura</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return Date fechaCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    /**
     * <li>Establece: fechaCaptura</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param Date fechaCaptura 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    /**
     * <li>Obtiene: horaCaptura</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return Time horaCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }

    /**
     * <li>Establece: horaCaptura</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param Time horaCaptura 
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }

    /**
     * <li>Obtiene: usuarioCapturo</li>
     * <li>Tabla de referencia: Empresa</li>
     * @return String usuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }

    /**
     * <li>Establece: usuarioCapturo</li>
     * <li>Tabla de referencia: Empresa</li>
     * @param String usuarioCapturo
     */
    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.claveEmpresa != null ? this.claveEmpresa.hashCode() : 0);
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
        final Empresa other = (Empresa) obj;
        if (this.claveEmpresa != other.claveEmpresa && (this.claveEmpresa == null || !this.claveEmpresa.equals(other.claveEmpresa))) {
            return false;
        }
        return true;
    }
    
}
