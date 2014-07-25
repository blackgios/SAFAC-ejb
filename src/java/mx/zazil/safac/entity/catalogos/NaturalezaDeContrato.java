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
@Table(name = "NaturalezaDeContrato", uniqueConstraints = {@UniqueConstraint(columnNames={"cveNaturalezaContrato"})})
@NamedQueries({
    @NamedQuery(name = "NaturalezaDeContrato.findByCveNatCtr", query = "SELECT n FROM NaturalezaDeContrato AS n WHERE n.cveNaturalezaContrato = :CveNatCtr"),
    @NamedQuery(name = "NaturalezaDeContrato.findByAll",query = "SELECT n FROM NaturalezaDeContrato AS n"),
    @NamedQuery(name = "NaturalezaDeContrato.findById", query = "SELECT n FROM NaturalezaDeContrato AS n WHERE n.id = :id"),
//@NamedQuery(name = "NaturalezaDeContrato.findByIdMax", query = "SELECT max(id) FROM NaturalezaDeContrato")
})
public class NaturalezaDeContrato implements Serializable, Catalogo{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private int id = 0;
    
    @Column( name = "cveNaturalezaContrato",length = 20)
    private String cveNaturalezaContrato = "";
    
    @Column(name = "descripcion",length = 255)
    private String descripcion = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new java.util.Date().getTime());
    
    @Column (name = "horaCaptura")
    private Time horaCaptura = new Time(new java.util.Date().getTime());
    
    @Column(name = "usuarioCapturo" , length = 20)
    private String usuarioCapturo = "";
    /**
     * <li>Obtiene: Clave NaturalezaDeContrato </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: NaturalezaDeContrato.CveNatCrt
     */
    
    public String getCveNaturalezaContrato() {
        return cveNaturalezaContrato;
    }
    
    public Integer getID() {
        return id;
    }

    
    /**
     * <li>Establece: Clave NaturalezaDeContrato </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * <li>Campo: NaturalezaDeContrato.CveNatCrt </li>
     * @param CveNatCtr
     * @return 
     */
    
    public void setCveNaturalezaContrato(String cveNaturalezaContrato) {
        this.cveNaturalezaContrato = cveNaturalezaContrato;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    /**
     * <li>Obtiene: Descripcion </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: NaturalezaDeContrato.CveNatCrt
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * <li>Establece: Descripcion </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * <li>Campo: NaturalezaDeContrato.Descripcion </li>
     * @param Descripcion
     * @return 
     */
    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    /**
     * <li>Obtiene: Fecha Captura </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: NaturalezaDeContrato.FecCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }
    /**
     * <li>Establece: Fecha Captura </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * <li>Campo: NaturalezaDeContrato.FecCaptura </li>
     * @param FecCaptura
     * @return 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }
    /**
     * <li>Obtiene: Hora Captura </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: NaturalezaDeContrato.HoraCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }
    /**
     * <li>Establece: Hora Captura </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * <li>Campo: NaturalezaDeContrato.HoraCaptura </li>
     * @param HoraCaptura
     * @return 
     */
    public void setHoraCaptura(Time HoraCaptura) {
        this.horaCaptura = HoraCaptura;
    }
    /**
     * <li>Obtiene: Usuario Capturo </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: NaturalezaDeContrato.UsuarioCapturo
     */
    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }
    /**
     * <li>Establece: Usuario Capturo </li>
     * <li>Tabla De referencia: NaturalezaDeContrato </li>
     * <li>Campo: NaturalezaDeContrato.UsuarioCapturo </li>
     * @param Usuario Capturo
     * @return 
     */
    public void setUsuarioCapturo(String UsuarioCapturo) {
        this.usuarioCapturo = UsuarioCapturo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
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
        final NaturalezaDeContrato other = (NaturalezaDeContrato) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}