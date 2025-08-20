/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio7;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String DNI;
    private String Legajo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String Legajo) {
        this.Legajo = Legajo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiantes other = (Estudiantes) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
    public Estudiantes(String nombre, String apellido, String DNI, String Legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.Legajo = Legajo;
    }
    @Override
    public String toString(){
        String st=("Nombre: "+this.getNombre()+" | Apellido: "+ this.getApellido()+" | DNI: "+this.getDNI()+" | Legajo: "+this.getLegajo());
        return st;
    }
}
