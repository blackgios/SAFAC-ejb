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
@Table (name = "Municipio")
@NamedQueries({
    @NamedQuery(name = "Municipio.findByCveMpioDel", query = "SELECT mp FROM Municipio AS mp WHERE mp.claveMunicipioDel = :cveMpioDel"),
    @NamedQuery(name = "Municipio.findById", query = "SELECT mp FROM Municipio AS mp WHERE mp.claveMunicipioDel = :id"),
    @NamedQuery(name = "Municipio.findByAll" , query = "SELECT md FROM Municipio AS md"),
    @NamedQuery(name = "Municipio.findByIdEstado" , query = "SELECT md FROM Municipio as md WHERE  md.idEstado = :idEstado")
})
public class Municipio implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "claveMunicipioDel" )
    private Integer claveMunicipioDel = 0;
    
    @ManyToOne(targetEntity = Estado.class)
    @JoinColumn(name = "idEstado", referencedColumnName = "id")
    private Estado idEstado;
    
    @Column (name = "descripcion" , length = 255)
    private String descripcion = "";
    
    @Column (name = "codPostIni" , length = 6)
    private String codPostIni = "";
    
    @Column(name = "codPostFin" , length = 6)
    private String codPostfin = "";
    
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new java.util.Date().getTime());
    
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new java.util.Date().getTime());
    
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCaptura = "";
   
    /**
     * <li>Constructor para la Entity Municipio</li>
     * <li>Tabla De referencia Municipio </li>
     * @param Sin Parametros
     */
    public Municipio(){
    }
    
    /**
     * <li>Constructor para la Entity Municipio con la Clave de Municipio</li>
     * <li>Tabla De referencia: Municipio </li>
     * @param Integer ClaveMunicipio 
     */
    public Municipio(Integer claveMunicipioDel){
        this.claveMunicipioDel = claveMunicipioDel;
    }
    
    /**
     * <li>Obtiene: claveMunicipioDel</li>
     * <li>Tabla de referencia: Municipio</li>
     * @return Integer claveMunicipioDel
     */
    public Integer getClaveMunicipioDel() {
        return claveMunicipioDel;
    }
    
    /**
     * <li>Establece: Clave Municipio </li>
     * <li>Tabla de referencia: Municipio </li>
     * @param Integer claveMpioDel
     */
    public void setClaveMunicipioDel(Integer claveMpioDel) {
        this.claveMunicipioDel = claveMpioDel;
    }
    
    @Override
    public Integer getID() {
        return this.claveMunicipioDel;
    }
    
    public void setID(Integer CveMpioDel) {
        this.claveMunicipioDel = CveMpioDel;
    }
    
    /**
     * <li>Obtiene: Clave Estado </li>
     * <li>Tabla De referencia: Municipio</li>
     * @return String getIDEstado
     */
    public String getIdEstado() {
        return idEstado.getDescripcion();
    }
    
    /**
     * <li>Establece: Clave Estado </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param Estado idEstado
     */
    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }
    
    /**
     * <li>Obtiene: Descripcion </li>
     * <li>Tabla De referencia: Municipio </li>
     * @return String descripcion
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * <li>Establece: Descripcion </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param String Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    
    /**
     * <li>Obtiene: CodigoPostalIni </li>
     * <li>Tabla De referencia: Municipio </li>
     * @return String codigoPostal
     */
    public String getCodPostIni() {
        return codPostIni;
    }
    /**
     * <li>Establece: Codigo PostIni </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param String codigoPostal
     */
    public void setCodPostIni(String codPostIni) {
        this.codPostIni = codPostIni;
    }
    /**
     * <li>Obtiene: Codigo Postalfin </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Municipio.CodPostFin
     */
    public String getCodPostfin() {
        return codPostfin;
    }
    /**
     * <li>Establece: Codigo PostFin </li>
     * <li>Tabla De referencia: Municipio </li>
     * <li>Campo: Municipio.CodPostFin </li>
     * @param Codigo PostalFin
     * @return 
     */
    public void setCodPostfin(String codPostfin) {
        this.codPostfin = codPostfin;
    }
    /**
     * <li>Obtiene: Fecha Captura  </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Municipio.FecCaptura
     */
    public Date getFechaCaptura() {
        return fechaCaptura;
    }
     /**
     * <li>Establece: Fecha Captura </li>
     * <li>Tabla De referencia: Municipio </li>
     * <li>Campo: Municipio.FecCaptura </li>
     * @param FecCaptura
     * @return 
     */
    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }
    /**
     * <li>Obtiene: Hora Captura </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Municipio.HoraCaptura
     */
    public Time getHoraCaptura() {
        return horaCaptura;
    }
     /**
     * <li>Establece: Hora Captura </li>
     * <li>Tabla De referencia: Municipio </li>
     * <li>Campo: Municipio.HoraCaptura </li>
     * @param Hora Captura
     * @return 
     */
    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }
    /**
     * <li>Obtiene: Usuario Capturo </li>
     * <li>Tabla De referencia: Municipio </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Municipio.UsuarioCapturo
     */
    public String getUsuarioCaptura() {
        return usuarioCaptura;
    }
     /**
     * <li>Establece: Usuario Capturo </li>
     * <li>Tabla De referencia: Municipio </li>
     * <li>Campo: Municipio.UsuarioCapturo </li>
     * @param Usuario Capturo
     * @return 
     */
    public void setUsuarioCaptura(String UsuarioCaptura) {
        this.usuarioCaptura = UsuarioCaptura;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Municipio other = (Municipio) obj;
        if (this.claveMunicipioDel != other.claveMunicipioDel) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.claveMunicipioDel;
        return hash;
    }

}