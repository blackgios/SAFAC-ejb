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
@Alta
@Baja
@Cambio
@Listable
@Table(name = "InstruccionPago")
@NamedQueries({
@NamedQuery(name = "InstruccionPago.findByCveInstruccionPago", query = "SELECT i FROM InstruccionPago As i WHERE i.cveInstruccionPago = :cveInstruccionPago"),
@NamedQuery(name = "InstruccionPago.findById", query = "SELECT i FROM InstruccionPago As i WHERE i.cveInstruccionPago = :id"),
@NamedQuery(name = "InstruccionPago.findByAll", query = "SELECT ip FROM InstruccionPago AS ip")
})
public class InstruccionPago implements Serializable,  Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cveInstruccionPago", length = 2)
    private int cveInstruccionPago = 0;

    @Column(name = "descripcion", length = 255)
    private String descripcion = "";
    
    @Column(name = "fechaCaptura" )
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new java.util.Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new java.util.Date().getTime());
    
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";

    
     /**
     * <li>Constructor para la Entity InstruccionPago con CveInstruccionPago </li>
     * <li>Tabla De referencia: InstruccionPago </li>
     * @param Clave de la Tabla InstruccionPago: CveInstruccionPago
     */
    public InstruccionPago(int CveInstruccionPago) {
        this.cveInstruccionPago = CveInstruccionPago;
    }
    /**
     * <li>Constructor para la Entity InstruccionPago</li>
     * <li>Tabla De referencia InstruccionPago</li>
     * @param Sin Parametros
     */
    public InstruccionPago() {
    }
    /**
     * <li>Obtiene: Clave InstruccionPago </li>
     * <li>Tabla De referencia: InstruccionPago</li>
     * @param Sin Parametros
     * @return Campo en la Tabla: InstruccionPago.CveInstruccionPago
     */
    
    public int getCveInstruccionPago(){
        return cveInstruccionPago;
    }
    
    @Override
    public Integer getID() {
        return cveInstruccionPago;
    }
     /**
     * <li>Establece: Clave InstruccionPago </li>
     * <li>Tabla De referencia: InstruccionPago </li>
     * <li>Campo: InstruccionPago.CveInstruccionPago </li>
     * @param Clave de InstruccionPago
     * @return 
     */
    public void setCveInstruccionPago(int cveInstruccionPago){
        this.cveInstruccionPago = cveInstruccionPago;
    }
    
    public void setId(int CveInstruccionPago) {
        this.cveInstruccionPago = CveInstruccionPago;
    }
     /**
     * <li>Obtiene: Descripcion </li>
     * <li>Tabla De referencia: InstruccionPago</li>
     * @param Sin Parametros
     * @return Campo en la Tabla: InstruccionPago.Descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * <li>Establece: Descripcion </li>
     * <li>Tabla De referencia: InstruccionPago </li>
     * <li>Campo: InstruccionPago.Descripcion </li>
     * @param Descripcion
     * @return 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     /**
     * <li>Obtiene: Fecha Captura </li>
     * <li>Tabla De referencia: InstruccionPago</li>
     * @param Sin Parametros
     * @return Campo en la Tabla: InstruccionPago.FecCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }
    /**
     * <li>Establece: Fecha Captura </li>
     * <li>Tabla De referencia: InstruccionPago </li>
     * <li>Campo: InstruccionPago.FecCaptura </li>
     * @param Fecha Captura
     * @return 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }
     /**
     * <li>Obtiene: Hora Captura </li>
     * <li>Tabla De referencia: InstruccionPago</li>
     * @param Sin Parametros
     * @return Campo en la Tabla: InstruccionPago.HoraCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }
    /**
     * <li>Establece: Hora Captura </li>
     * <li>Tabla De referencia: InstruccionPago </li>
     * <li>Campo: InstruccionPago.HoraCaptura </li>
     * @param HoraCaptura
     * @return 
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }
     /**
     * <li>Obtiene: Usuario Capturo </li>
     * <li>Tabla De referencia: InstruccionPago</li>
     * @param Sin Parametros
     * @return Campo en la Tabla: InstruccionPago.UsuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }
     /**
     * <li>Establece: Usuario Capturo </li>
     * <li>Tabla De referencia: InstruccionPago </li>
     * <li>Campo: InstruccionPago.UsuarioCapturo </li>
     * @param Usuario Capturo
     * @return 
     */
    public void setUsuarioCapturo(String UsuarioCapturo) {
        this.usuarioCapturo = UsuarioCapturo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InstruccionPago other = (InstruccionPago) obj;
        if (this.cveInstruccionPago != other.cveInstruccionPago) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.cveInstruccionPago;
        return hash;
    }

}