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
public class Director extends Empleado {
    private double viaticos;

    public Director(double viaticos, String nombre, int dni, int añoingreso, double sueldo) {
        super(nombre, dni, añoingreso, sueldo);
        this.viaticos = viaticos;
    }


    
    public double getViaticos() {
        return viaticos;
    }
    
    public double sueldoCobrar(){
        double sueldo=super.getSueldo()+this.viaticos;
        if(2025-super.getAñoIngreso()>=20){
            sueldo+=super.getSueldo()%10;
        }
        return sueldo;
    }
    @Override
    public String toString(){
        String st=super.toString();
        st+=" Sueldo a cobrar: "+this.sueldoCobrar();
        return st;
    }
    
}
