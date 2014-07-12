/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.safac.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector Rodriguez
 */
public class DatosAportacion implements Serializable{
    private String numeroContrato;
    private String indicativo;
    private Integer año;
    private Integer quincena;
    private List<Double> aportacion;

    public DatosAportacion() {
    }

    public DatosAportacion(String numeroContrato, Date fecha, Double importe) {
        this.numeroContrato = numeroContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getQuincena() {
        return quincena;
    }

    public void setQuincena(Integer quincena) {
        this.quincena = quincena;
    }

    public List<Double> getAportacion() {
        return aportacion;
    }

    public void setAportacion(List<Double> aportacion) {
        this.aportacion = aportacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.numeroContrato != null ? this.numeroContrato.hashCode() : 0);
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
        final DatosAportacion other = (DatosAportacion) obj;
        if ((this.numeroContrato == null) ? (other.numeroContrato != null) : !this.numeroContrato.equals(other.numeroContrato)) {
            return false;
        }
        return true;
    }
    
}
