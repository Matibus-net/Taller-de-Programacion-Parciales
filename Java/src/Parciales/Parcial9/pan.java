/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masparciales;

/**
 *
 * @author Usuario
 */
public class pan {
    private String nombre;
    private double costo;
    private String calidad;

    public pan(String nombre, double costo, String calidad) {
        this.nombre = nombre;
        this.costo = costo;
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public String getCalidad() {
        return calidad;
    }
    
    public double costoFinal(){
        if(this.getCalidad().equals("Premium"))
            return this.getCosto()+this.getCosto()%20;
        else
            return this.getCosto();
    }
    @Override
    public String toString(){
        String st="Nombre: "+this.getNombre()+" CostoFinal: "+this.costoFinal()+" Calidad: "+this.getCalidad();
        return st;
    }
}
