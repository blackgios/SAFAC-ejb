/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.safac.entity.catalogos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import mx.zazil.cliente.entity.detalle.EstatusVigenciaDetalle;
import mx.zazil.safac.entity.operacion.Contrato;
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
@NamedQueries({
    @NamedQuery(name = "Beneficiario.findByAll", query = "SELECT n FROM Beneficiario AS n"),
    @NamedQuery(name = "Beneficiario.findById", query = "SELECT n FROM Beneficiario AS n WHERE n.numeroBeneficiario = :numeroBeneficiario")
})
@Table(name = "Beneficiario", uniqueConstraints = {@UniqueConstraint(columnNames = {"numeroBeneficiario","idContrato"})})
public class Beneficiario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "numeroBeneficiario", length = 8)
    private Integer numeroBeneficiario = 0;
    @ManyToOne(targetEntity = Contrato.class)
    @JoinColumn(name = "idContrato", referencedColumnName = "idContrato")
    private Contrato idContrato;
    @Column(name = "tituloBiliario", length = 8)
    private String tituloBiliario = "";
    @Column(name = "nombre", length = 32)
    private String nombre = "";
    @Column(name = "paterno", length = 32)
    private String paterno = "";
    @Column(name = "materno")
    private String materno = "";
    @Column(name = "porcentajeBeneficio", precision = 9,scale = 8)
    private Double porcentajeBeneficio = 0.0;
    @Column(name = "estatus")
    @Enumerated(EnumType.STRING)
    private EstatusVigenciaDetalle estatus = EstatusVigenciaDetalle.V;
    @Column(name = "fechaCancelacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCancelacion = new Date(new Date().getTime());

    public Beneficiario() {
    }

    public Integer getNumeroBeneficiario() {
        return numeroBeneficiario;
    }
    
    public Integer getID(){
        return this.numeroBeneficiario;
    }
    
    public void setID(Integer numeroBeneficiario){
        this.numeroBeneficiario = numeroBeneficiario;
    }

    public void setNumeroBeneficiario(Integer numeroBeneficiario) {
        this.numeroBeneficiario = numeroBeneficiario;
    }

    public Contrato getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Contrato idContrato) {
        this.idContrato = idContrato;
    }

    public String getTituloBiliario() {
        return tituloBiliario;
    }

    public void setTituloBiliario(String tituloBiliario) {
        this.tituloBiliario = tituloBiliario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(Double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public EstatusVigenciaDetalle getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusVigenciaDetalle estatus) {
        this.estatus = estatus;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.numeroBeneficiario != null ? this.numeroBeneficiario.hashCode() : 0);
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
        final Beneficiario other = (Beneficiario) obj;
        if (this.numeroBeneficiario != other.numeroBeneficiario && (this.numeroBeneficiario == null || !this.numeroBeneficiario.equals(other.numeroBeneficiario))) {
            return false;
        }
        return true;
    }
    
}
