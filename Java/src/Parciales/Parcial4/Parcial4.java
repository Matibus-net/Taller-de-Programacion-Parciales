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
public class Parcial4 {
    public static void main (String args[]){
        Director D= new Director(125.00,"Matias",334343,2000,200.00);
        Empresa E=new Empresa("Aplle","22 Y 60",D,5);
        Encargado EN=new Encargado(30,"Maxi",33123,2000,200.00);
        E.agregarEmpleado(1, EN);
        E.agregarEmpleado(2, EN);
        E.agregarEmpleado(3, EN);
        E.agregarEmpleado(1, EN);
        E.agregarEmpleado(4, EN);
        System.out.println(E.toString());
    }
}
