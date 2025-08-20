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
public class Parcial3 {
    public static void main(String args[]){
        Torneo T =new Torneo ("Betson",5,5);
        goleador mati = new goleador ("mati","Edlp",5);
        T.agregarGoleador(1, mati);
        goleador juan = new goleador ("juan","Edlp",3);
        T.agregarGoleador(2, mati);
        T.agregarGoleador(2, juan);
        T.agregarGoleador(3, mati);
        T.agregarGoleador(4, mati);
        System.out.println("La cantidad de goleadores del torneo es de: "+T.cantGoleadoresTorneo());
        System.out.println("El goleador con menos goles de la fecha ingresada es: "+T.menorGoleador(2).toString());
        System.out.println(T.toString());
    }
}