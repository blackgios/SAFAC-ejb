/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.safac.entity.catalogos;

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;
import mx.zazil.security.Alta;
import mx.zazil.security.Baja;
import mx.zazil.security.Cambio;
import mx.zazil.security.Listable;

/**
 *
 * @author Hector Rodriguez
 */
@Entity
@Table(name = "Parametros", uniqueConstraints = {@UniqueConstraint(columnNames={"parametro"})})
@NamedQueries({
    @NamedQuery(name = "Parametros.findByParametro", query = "SELECT p FROM Parametros p WHERE  p.parametro= :Parametro"),
    @NamedQuery(name = "Parametros.findByAll", query = "SELECT p FROM Parametros p")
})
@Alta
@Baja
@Cambio
@Listable
public class Parametros  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "parametro")
    private String parametro = "";
    @Column(name = "valNum")
    private Double valorNumero = 0.0;
    @Column(name = "valorFecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date valorFecha = new Date(new java.util.Date().getTime());
    @Column(name = "valStr")
    private String valorString = "";
    @Column(name = "valorEntero", precision=8)
    private Long valorEntero = 0L;

    public Parametros() {
    }

    public Parametros(String parametro) {
        this.parametro = parametro;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public Date getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(Date valor) {
        this.valorFecha = valor;
    }

    public Double getValorNumero() {
        return valorNumero;
    }

    public void setValorNumero(Double valorNumero) {
        this.valorNumero = valorNumero;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parametros other = (Parametros) obj;
        if ((this.parametro == null) ? (other.parametro != null) : !this.parametro.equals(other.parametro)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.parametro != null ? this.parametro.hashCode() : 0);
        return hash;
    }



    @Override
    public String toString() {
        return String.format("mx.balam.propiedades.entity.parametros");
    }

    /**
     * @return the valorEntero
     */
    public Long getValorEntero() {
        return valorEntero;
    }

    /**
     * @param valorEntero the valorEntero to set
     */
    public void setValorEntero(Long valorEntero) {
        this.valorEntero = valorEntero;
    }
}