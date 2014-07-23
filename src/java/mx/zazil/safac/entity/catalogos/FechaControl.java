/**
 * Esta clase ha sido reescrita, se desconoce el autor de la misma,
 * se estructura como se hace normalmente, primero los campos,
 * despues los constructores, luego getters y setters, si aplica metodos
 * propios de procesamiento y al final se sobreescriben 
 * hashCode e equals().
 */
package mx.zazil.safac.entity.catalogos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "FechaControl.findByAll", query = "SELECT fc FROM FechaControl AS fc"),
    @NamedQuery(name = "FechaControl.findByFechaHoy",query = "SELECT fc FROM FechaControl as fc WHERE fc.fechaHoy = :fechaHoy"),
    @NamedQuery(name = "FechaControl.findById",query = "SELECT fc FROM FechaControl as fc WHERE fc.id = :id")
})
public class FechaControl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id = 0;
    
    @Column(name = "fechaHoy")
    @Temporal(TemporalType.DATE)
    private Date fechaHoy = new Date(new Date().getTime());
    
    @Column(name = "fechaAyer")
    @Temporal(TemporalType.DATE)
    private Date fechaAyer = new Date(new Date().getTime());
    
    @Column(name = "fecha24Hrs")
    @Temporal(TemporalType.DATE)
    private Date fecha24Hrs = new Date(new Date().getTime());
    
    @Column(name = "fecha48Hrs")
    @Temporal(TemporalType.DATE)
    private Date fecha48Hrs = new Date(new Date().getTime());
    
    @Column(name = "fecha72Hrs")
    @Temporal(TemporalType.DATE)
    private Date fecha72Hrs = new Date(new Date().getTime());
    
    @Column(name = "fecha96Hrs")
    @Temporal(TemporalType.DATE)
    private Date fecha96Hrs = new Date(new Date().getTime());
    
    @Column(name = "fecha120Hrs")
    @Temporal(TemporalType.DATE)
    private Date fecha120Hrs = new Date(new Date().getTime());
    
    @Column(name = "fechaInicioMes")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioMes = new Date(new Date().getTime());
    
    @Column(name = "fechaFinMes")
    @Temporal(TemporalType.DATE)
    private Date fechaFinMes = new Date(new Date().getTime());
    
    @Column(name = "fechaInicioAño")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioAño = new Date(new Date().getTime());
    
    @Column(name = "fechaFinAño")
    @Temporal(TemporalType.DATE)
    private Date fechaFinAño = new Date(new Date().getTime());
    
    @Column(name = "fechaIniMesAnterior")
    @Temporal(TemporalType.DATE)
    private Date fechaIniMesAnterior = new Date(new Date().getTime());
    
    @Column(name = "fechaFinMesAnterior")
    @Temporal(TemporalType.DATE)
    private Date fechaFinMesAnterior = new Date(new Date().getTime());
    
    @Column(name = "fechaIniAñoAnterior")
    @Temporal(TemporalType.DATE)
    private Date fechaIniAñoAnterior = new Date(new Date().getTime());
    
    @Column(name = "fechaFinAñoAnterior")
    @Temporal(TemporalType.DATE)
    private Date fechaFinAñoAnterior = new Date(new Date().getTime());
    
    @Column(name = "fechaIniMesAntNat")
    @Temporal(TemporalType.DATE)
    private Date fechaIniMesAntNat = new Date(new Date().getTime());
    
    @Column(name = "fechaFinMesAntNat")
    @Temporal(TemporalType.DATE)
    private Date fechaFinMesAntNat = new Date(new Date().getTime());
    
    @Column(name = "fechaIniAñoAntNat")
    @Temporal(TemporalType.DATE)
    private Date fechaIniAñoAntNat = new Date(new Date().getTime());
    
    @Column(name = "fechaFinAñoAntNat")
    @Temporal(TemporalType.DATE)
    private Date fechaFinAñoAntNat = new Date(new Date().getTime());

    public FechaControl() {
    }

    public FechaControl(Integer id) {
        this.id = id;
    }

    public FechaControl(Integer id, Date fechaHoy) {
        this.id = id;
        this.fechaHoy = fechaHoy;
    }
    
    /**
     * <li>Obtiene: ID</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Integer ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <li>Establece: ID</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Integer ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <li>Obtiene: fechaHoy</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaHoy
     */
    public Date getFechaHoy() {
        return fechaHoy;
    }

    /**
     * <li>Establece: fechaHoy</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaHoy
     */
    public void setFechaHoy(Date fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    /**
     * <li>Obtiene: fechaAyer</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaAyer
     */
    public Date getFechaAyer() {
        return fechaAyer;
    }

    /**
     * <li>Establece: fechaAyer</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaAyer
     */
    public void setFechaAyer(Date fechaAyer) {
        this.fechaAyer = fechaAyer;
    }

    /**
     * <li>Obtiene: fecha24Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fecha24Hrs
     */
    public Date getFecha24Hrs() {
        return fecha24Hrs;
    }

    /**
     * <li>Establece: fecha24Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fecha24Hrs
     */
    public void setFecha24Hrs(Date fecha24Hrs) {
        this.fecha24Hrs = fecha24Hrs;
    }

    /**
     * <li>Obtiene: fecha48Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fecha48Hrs
     */
    public Date getFecha48Hrs() {
        return fecha48Hrs;
    }

    /**
     * <li>Establece: fecha48Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fecha48Hrs
     */
    public void setFecha48Hrs(Date fecha48Hrs) {
        this.fecha48Hrs = fecha48Hrs;
    }

    /**
     * <li>Obtiene: fecha72Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fecha72Hrs
     */
    public Date getFecha72Hrs() {
        return fecha72Hrs;
    }

    /**
     * <li>Establece: fecha72Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fecha72Hrs
     */
    public void setFecha72Hrs(Date fecha72Hrs) {
        this.fecha72Hrs = fecha72Hrs;
    }

    /**
     * <li>Obtiene: fecha96Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fecha96Hrs
     */
    public Date getFecha96Hrs() {
        return fecha96Hrs;
    }

    /**
     * <li>Establece: fecha96Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fecha96Hrs
     */
    public void setFecha96Hrs(Date fecha96Hrs) {
        this.fecha96Hrs = fecha96Hrs;
    }

    /**
     * <li>Obtiene: fecha120Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fecha120Hrs
     */
    public Date getFecha120Hrs() {
        return fecha120Hrs;
    }

    /**
     * <li>Establece: fecha120Hrs</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fecha120Hrs
     */
    public void setFecha120Hrs(Date fecha120Hrs) {
        this.fecha120Hrs = fecha120Hrs;
    }

    /**
     * <li>Obtiene: fechaInicioMes</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaInicioMes
     */
    public Date getFechaInicioMes() {
        return fechaInicioMes;
    }

    /**
     * <li>Establece: fechaInicioMes</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaInicioMes
     */
    public void setFechaInicioMes(Date fechaInicioMes) {
        this.fechaInicioMes = fechaInicioMes;
    }

    /**
     * <li>Obtiene: fechaFinMes</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaFinMes
     */
    public Date getFechaFinMes() {
        return fechaFinMes;
    }

    /**
     * <li>Establece: fechaFinMes</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaFinMes
     */
    public void setFechaFinMes(Date fechaFinMes) {
        this.fechaFinMes = fechaFinMes;
    }

    /**
     * <li>Obtiene: fechaInicioAño</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaInicioAño
     */
    public Date getFechaInicioAño() {
        return fechaInicioAño;
    }

    /**
     * <li>Establece: fechaInicioAño</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaInicioAño
     */
    public void setFechaInicioAño(Date fechaInicioAño) {
        this.fechaInicioAño = fechaInicioAño;
    }

    /**
     * <li>Obtiene: fechaFinAño</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaFinAño
     */
    public Date getFechaFinAño() {
        return fechaFinAño;
    }

    /**
     * <li>Establece: fechaFinAño</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaFinAño
     */
    public void setFechaFinAño(Date fechaFinAño) {
        this.fechaFinAño = fechaFinAño;
    }

    /**
     * <li>Obtiene: fechaIniMesAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaIniMesAnterior
     */
    public Date getFechaIniMesAnterior() {
        return fechaIniMesAnterior;
    }

    /**
     * <li>Establece: fechaIniMesAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaIniMesAnterior
     */
    public void setFechaIniMesAnterior(Date fechaIniMesAnterior) {
        this.fechaIniMesAnterior = fechaIniMesAnterior;
    }

    /**
     * <li>Obtiene: fechaFinMesAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaFinMesAnterior
     */
    public Date getFechaFinMesAnterior() {
        return fechaFinMesAnterior;
    }

    /**
     * <li>Establece: fechaFinMesAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaFinMesAnterior
     */
    public void setFechaFinMesAnterior(Date fechaFinMesAnterior) {
        this.fechaFinMesAnterior = fechaFinMesAnterior;
    }

    /**
     * <li>Obtiene: fechaIniAñoAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaIniAñoAnterior
     */
    public Date getFechaIniAñoAnterior() {
        return fechaIniAñoAnterior;
    }

    /**
     * <li>Establece: fechaIniAñoAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaIniAñoAnterior
     */
    public void setFechaIniAñoAnterior(Date fechaIniAñoAnterior) {
        this.fechaIniAñoAnterior = fechaIniAñoAnterior;
    }

    /**
     * <li>Obtiene: fechaFinAñoAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaFinAñoAnterior
     */
    public Date getFechaFinAñoAnterior() {
        return fechaFinAñoAnterior;
    }

    /**
     * <li>Establece: fechaFinAñoAnterior</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaFinAñoAnterior
     */
    public void setFechaFinAñoAnterior(Date fechaFinAñoAnterior) {
        this.fechaFinAñoAnterior = fechaFinAñoAnterior;
    }

    /**
     * <li>Obtiene: fechaIniMesAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaIniMesAntNat
     */
    public Date getFechaIniMesAntNat() {
        return fechaIniMesAntNat;
    }

    /**
     * <li>Establece: fechaIniMesAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaIniMesAntNat
     */
    public void setFechaIniMesAntNat(Date fechaIniMesAntNat) {
        this.fechaIniMesAntNat = fechaIniMesAntNat;
    }

    /**
     * <li>Obtiene: fechaFinMesAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaFinMesAntNat
     */
    public Date getFechaFinMesAntNat() {
        return fechaFinMesAntNat;
    }

    /**
     * <li>Establece: fechaFinMesAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaFinMesAntNat
     */
    public void setFechaFinMesAntNat(Date fechaFinMesAntNat) {
        this.fechaFinMesAntNat = fechaFinMesAntNat;
    }

    /**
     * <li>Obtiene: fechaIniAñoAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaIniAñoAntNat
     */
    public Date getFechaIniAñoAntNat() {
        return fechaIniAñoAntNat;
    }

    /**
     * <li>Establece: fechaIniAñoAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaIniAñoAntNat
     */
    public void setFechaIniAñoAntNat(Date fechaIniAñoAntNat) {
        this.fechaIniAñoAntNat = fechaIniAñoAntNat;
    }

    /**
     * <li>Obtiene: fechaFinAñoAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @return Date fechaFinAñoAntNat
     */
    public Date getFechaFinAñoAntNat() {
        return fechaFinAñoAntNat;
    }

    /**
     * <li>Establece: fechaFinAñoAntNat</li>
     * <li>Tabla de referencia: FechaControl</li>
     * @param Date fechaFinAñoAntNat
     */
    public void setFechaFinAñoAntNat(Date fechaFinAñoAntNat) {
        this.fechaFinAñoAntNat = fechaFinAñoAntNat;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final FechaControl other = (FechaControl) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
