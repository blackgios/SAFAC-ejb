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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
public class SituacionCuentaBancaria implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "estatusCuentaBancaria")
    private Integer estatusCuentaBancaria = 0;
    
    @Column(name = "descripcion")
    private String descripcion = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    
    @Column(name = "usuarioCapturo")
    private String usuarioCapturo = "";
    
    /**
     * Constructor de clase sin argumentos
     */
    public SituacionCuentaBancaria() {
    }

    public SituacionCuentaBancaria(Integer estatusCuentaBancaria) {
        this.estatusCuentaBancaria = estatusCuentaBancaria;
    }
    
    
    /**
     * <li>Obtiene: estatusCuentaBancaria</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @return Campo en la tabla: estatusCuentaBancaria
     */
    public Integer getEstatusCuentaBancaria() {
        return estatusCuentaBancaria;
    }

    /**
     * <li>Establece: estatusCuentaBancaria</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @param estatusCuentaBancaria 
     */
    public void setEstatusCuentaBancaria(Integer estatusCuentaBancaria) {
        this.estatusCuentaBancaria = estatusCuentaBancaria;
    }

    /**
     * <li>Obtiene: Descripcion</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @return Campo en la tabla: Descripcion
     */
    @Override
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
     * <li>Establece: Descripcion</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @param Descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * <li>Obtiene: fechaCaptura</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @return Campo en la tabla: fechaCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    /**
     * <li>Establece: fechaCaptura</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @param fechaCaptura
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    /**
     * <li>Obtiene: horaCaptura</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @return Campo en la tabla: horaCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }

    /**
     * <li>Establece: horaCaptura</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @param horaCaptura 
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }

    /**
     * <li>Obtiene: usuarioCapturo</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @return Campo en la tabla: usuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }

    /**
     * <li>Establece: usuarioCapturo</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @param usuarioCapturo
     */
    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }
    
    /**
     * <li>Obtiene: estatusCuentaBancaria</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @return Campo en la tabla: estatusCuentaBancaria
     */
    @Override
    public Integer getID() {
        return this.estatusCuentaBancaria;
    }
    
    /**
     * <li>Establece: estatusCuentaBancaria</li>
     * <li>Tabla de referencia: SituacionCuentaBancaria</li>
     * @param estatusCuentaBancaria
     */
    public void setID(Integer ID){
        this.estatusCuentaBancaria = ID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.estatusCuentaBancaria != null ? this.estatusCuentaBancaria.hashCode() : 0);
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
        final SituacionCuentaBancaria other = (SituacionCuentaBancaria) obj;
        if (this.estatusCuentaBancaria != other.estatusCuentaBancaria && (this.estatusCuentaBancaria == null || !this.estatusCuentaBancaria.equals(other.estatusCuentaBancaria))) {
            return false;
        }
        return true;
    }
    
    
}
