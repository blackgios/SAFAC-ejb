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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
public class Banco implements Serializable, Catalogo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "claveBanco")
    private Integer claveBanco = 0;
    @Column(name = "claveMonedaSecoban", length = 4)
    private Integer claveMonedaSecoban = 0;
    @Column(name = "descripcion", length = 50)
    private String descripcion;
    @Column(name = "claveSecoban", length = 11)
    private String claveSecoban;
    @ManyToOne(targetEntity = SituacionCuentaBancaria.class)
    @JoinColumn(name = "estatusCuentaBancaria", referencedColumnName = "estatusCuentaBancaria")
    private SituacionCuentaBancaria estatusCuentaBancaria;
    @Column(name = "razonSocial")
    private String razonSocial = "";
    @Column(name = "RFC", length = 12)
    private String RFC = "";
    @Column(name = "fechaCaptura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura = new Date(new Date().getTime());
    @Column(name = "horaCaptura")
    private Time horaCaptura = new Time(new Date().getTime());
    @Column(name = "usuarioCapturo", length = 8)
    private String usuarioCapturo = "";

    public Banco() {
    }
    
    public Banco(Integer claveBanco) {
        this.claveBanco = claveBanco;
    }

    public Integer getClaveBanco() {
        return claveBanco;
    }

    public void setClaveBanco(Integer claveBanco) {
        this.claveBanco = claveBanco;
    }

    public Integer getClaveMonedaSecoban() {
        return claveMonedaSecoban;
    }

    public void setClaveMonedaSecoban(Integer claveMonedaSecoban) {
        this.claveMonedaSecoban = claveMonedaSecoban;
    }

    public String getClaveSecoban() {
        return claveSecoban;
    }

    public void setClaveSecoban(String claveSecoban) {
        this.claveSecoban = claveSecoban;
    }

    public SituacionCuentaBancaria getEstatusCuentaBancaria() {
        return estatusCuentaBancaria;
    }

    public void setEstatusCuentaBancaria(SituacionCuentaBancaria estatusCuentaBancaria) {
        this.estatusCuentaBancaria = estatusCuentaBancaria;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
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
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Integer getID() {
        return claveBanco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.claveBanco != null ? this.claveBanco.hashCode() : 0);
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
        final Banco other = (Banco) obj;
        if (this.claveBanco != other.claveBanco && (this.claveBanco == null || !this.claveBanco.equals(other.claveBanco))) {
            return false;
        }
        return true;
    }
    
}
