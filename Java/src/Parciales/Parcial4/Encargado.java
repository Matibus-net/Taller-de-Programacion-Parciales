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
public class Encargado extends Empleado {
    private int cantEmpleados;

    public Encargado(int cantEmpleados, String nombre, int dni, int añoingreso, double sueldo) {
        super(nombre, dni, añoingreso, sueldo);
        this.cantEmpleados = cantEmpleados;
    }



    public int getCantEmpleados() {
        return cantEmpleados;
    }
    public double sueldoCobrar(){
        double sueldo= super.getSueldo();
        if(2025-super.getAñoIngreso()>=20)
            sueldo+=super.getSueldo()%10;
        sueldo+=1000*cantEmpleados;
        return sueldo;
    }
    @Override
    public String toString(){
        String st=super.toString();
        st+=" Sueldo a cobrar: "+this.sueldoCobrar();
        return st;
    }
    
}
