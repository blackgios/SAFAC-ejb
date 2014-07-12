/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.safac.beans;

import java.io.Serializable;

/**
 *
 * @author Hector Rodriguez
 */
public class DescripcionAportacion implements Serializable{
    private String concepto;
    private String descripcion;

    public DescripcionAportacion() {
    }

    public DescripcionAportacion(String concepto, String descripcion) {
        this.concepto = concepto;
        this.descripcion = descripcion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.concepto != null ? this.concepto.hashCode() : 0);
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
        final DescripcionAportacion other = (DescripcionAportacion) obj;
        if ((this.concepto == null) ? (other.concepto != null) : !this.concepto.equals(other.concepto)) {
            return false;
        }
        return true;
    }
}
