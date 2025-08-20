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
public class Chico {
    private String nombre;
    private int Telefono;
    private boolean nada;

    public Chico(String nombre, int Telefono, boolean nada) {
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.nada = nada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public boolean isNada() {
        return nada;
    }

    public void setNada(boolean nada) {
        this.nada = nada;
    }
    @Override 
    public String toString(){
        return ("Nombre: "+ this.getNombre()+" Telefono: "+this.getTelefono()+" SabeNadar?: "+this.isNada());
    }
    
}
