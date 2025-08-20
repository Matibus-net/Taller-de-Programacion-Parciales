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
public abstract class sitio {
    private String nombre;
    private String direccion;
    private int cantUsuarios;

    public sitio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantUsuarios = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantUsuarios() {
        return cantUsuarios;
    }
    
    public abstract double cotizarSitio();
    public abstract String representacion();
}
