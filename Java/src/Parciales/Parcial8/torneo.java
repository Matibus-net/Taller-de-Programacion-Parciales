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
public class torneo {
    private String nombre;
    private String fecha;
    private double montoInscripciones;
    private double montoPagado;

    public torneo(String nombre, String fecha, double montoInscripciones, double montoPagado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.montoInscripciones = montoInscripciones;
        this.montoPagado = montoPagado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMontoInscripciones() {
        return montoInscripciones;
    }

    public double getMontoPagado() {
        return montoPagado;
    }
    
}
