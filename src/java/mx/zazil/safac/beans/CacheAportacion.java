/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.safac.beans;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Hector Rodriguez
 */
public class CacheAportacion {
    private String[] cabezera;
    private List<DescripcionAportacion> bajas;
    private List<DescripcionAportacion> valorArchivo;
    private LinkedList<DatosAportacion> vector;
    private LinkedList<DatosAportacion> vectorAltas;
    private LinkedList<DescripcionAportacion> vectorCambioAltas;

    public CacheAportacion() {
    }

    public String[] getCabezera() {
        return cabezera;
    }

    public void setCabezera(String[] cabezera) {
        this.cabezera = cabezera;
    }

    public List<DescripcionAportacion> getBajas() {
        return bajas;
    }

    public void setBajas(List<DescripcionAportacion> bajas) {
        this.bajas = bajas;
    }

    public List<DescripcionAportacion> getValorArchivo() {
        return valorArchivo;
    }

    public void setValorArchivo(List<DescripcionAportacion> valorArchivo) {
        this.valorArchivo = valorArchivo;
    }

    public LinkedList<DatosAportacion> getVector() {
        return vector;
    }

    public void setVector(LinkedList<DatosAportacion> vector) {
        this.vector = vector;
    }

    public LinkedList<DatosAportacion> getVectorAltas() {
        return vectorAltas;
    }

    public void setVectorAltas(LinkedList<DatosAportacion> vectorAltas) {
        this.vectorAltas = vectorAltas;
    }

    public LinkedList<DescripcionAportacion> getVectorCambioAltas() {
        return vectorCambioAltas;
    }

    public void setVectorCambioAltas(LinkedList<DescripcionAportacion> vectorCambioAltas) {
        this.vectorCambioAltas = vectorCambioAltas;
    }
}
