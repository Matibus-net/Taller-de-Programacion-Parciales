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
public abstract class Empleado {
    private String nombre;
    private int dni;
    private int añoIngreso;
    private double sueldo;

    public Empleado(String nombre, int dni, int añoingreso, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.añoIngreso = añoingreso;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }
    @Override
    public String toString(){
        String st="Nombre: "+this.getNombre()+" DNI: "+this.getDni();
        return st;
    }
    
}
