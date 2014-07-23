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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
public class CategoriaDeContrato implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "claveCategoriaContrato")
    private Integer claveCategoriaContrato;
    @Column(name = "personaDocto")
    private Boolean personaDocto = Boolean.FALSE;
    @Column(name = "esFondo")
    private Boolean esFondo = Boolean.FALSE;
    @Column(name = "esIP")
    private Boolean esIP = Boolean.FALSE;
    @Column(name = "descripcion", length = 255)
    private String descripcion;
    @Column(name = "utilizaCapacidad")
    private Boolean utilizaCapacidad = Boolean.FALSE;
    @Column(name = "cobroAsesoria")
    private String cobroAsesoria = "";
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    @Column(name = "usuarioCapturo", length = 20)
    private String usuarioCapturo = "";
    @Column(name = "operaPromocion")
    private Boolean operaPromocion = false;

    public CategoriaDeContrato() {
    }

    public CategoriaDeContrato(Integer claveCategoriaContrato) {
        this.claveCategoriaContrato = claveCategoriaContrato;
    }
    @Override
    public Integer getID() {
        return this.claveCategoriaContrato;
    }
    
    public void setID(Integer id){
        this.claveCategoriaContrato = id;
    }
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getClaveCategoriaContrato() {
        return claveCategoriaContrato;
    }

    public void setClaveCategoriaContrato(Integer claveCategoriaContrato) {
        this.claveCategoriaContrato = claveCategoriaContrato;
    }

    public Boolean getPersonaDocto() {
        return personaDocto;
    }

    public void setPersonaDocto(Boolean personaDocto) {
        this.personaDocto = personaDocto;
    }

    public Boolean getEsFondo() {
        return esFondo;
    }

    public void setEsFondo(Boolean esFondo) {
        this.esFondo = esFondo;
    }

    public Boolean getEsIP() {
        return esIP;
    }

    public void setEsIP(Boolean esIP) {
        this.esIP = esIP;
    }

    public Boolean getUtilizaCapacidad() {
        return utilizaCapacidad;
    }

    public void setUtilizaCapacidad(Boolean utilizaCapacidad) {
        this.utilizaCapacidad = utilizaCapacidad;
    }

    public String getCobroAsesoria() {
        return cobroAsesoria;
    }

    public void setCobroAsesoria(String cobroAsesoria) {
        this.cobroAsesoria = cobroAsesoria;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Time getHoraCaptura() {
        return horaCaptura;
    }

    public void setHoraCaptura(Time horaCaptura) {
        this.horaCaptura = horaCaptura;
    }

    public String getUsuarioCapturo() {
        return usuarioCapturo;
    }

    public void setUsuarioCapturo(String usuarioCapturo) {
        this.usuarioCapturo = usuarioCapturo;
    }

    public Boolean getOperaPromocion() {
        return operaPromocion;
    }

    public void setOperaPromocion(Boolean operaPromocion) {
        this.operaPromocion = operaPromocion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.claveCategoriaContrato != null ? this.claveCategoriaContrato.hashCode() : 0);
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
        final CategoriaDeContrato other = (CategoriaDeContrato) obj;
        if (this.claveCategoriaContrato != other.claveCategoriaContrato && (this.claveCategoriaContrato == null || !this.claveCategoriaContrato.equals(other.claveCategoriaContrato))) {
            return false;
        }
        return true;
    }
    
}
