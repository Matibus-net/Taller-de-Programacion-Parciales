/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales;

/**
 *
 * @author Usuario
 */
public class goleador {
    private String nombre;
    private String nombreEquipo;
    private int cantGoles;

    public goleador(String nombre, String nombreEquipo, int cantGoles) {
        this.nombre = nombre;
        this.nombreEquipo = nombreEquipo;
        this.cantGoles = cantGoles;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
    @Override
    
    public String toString(){
        String st="Nombre: "+this.getNombre()+" Equipo: "+this.getNombreEquipo()+" cantidad de goles: "+this.getCantGoles();
        return st;
    }
    
    
}
