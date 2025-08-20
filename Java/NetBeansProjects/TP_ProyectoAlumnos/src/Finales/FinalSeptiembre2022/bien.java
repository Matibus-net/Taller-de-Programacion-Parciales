/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finales;

/**
 *
 * @author Usuario
 */
public class bien {
    private String descripcion;
    private int cantidad;
    private double costoUnidad;

    public bien(String descripcion, int cantidad, double costoUnidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costoUnidad = costoUnidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }
    
    public double costoFinal(){
        return this.getCantidad()*this.getCostoUnidad();
    }
}
