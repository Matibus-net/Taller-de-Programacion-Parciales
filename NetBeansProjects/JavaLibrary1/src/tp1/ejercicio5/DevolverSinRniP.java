/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio5;

/**
 *
 * @author Usuario
 */
public class DevolverSinRniP {
    
    
    private static int min;
    private static int max;
    private static double promedio;

 public static void calcular(int[] a ){
     min=999999999;
     max=-999999999;
     int suma=0;
     for(int i=0;i<a.length;i++){
         
         if(a[i]>max){
             max=a[i];
         }
         if(a[i]<min){
             min=a[i];
         }
         suma+=a[i];
     }
     promedio=suma/a.length;
 }
    
 public static void devolverResultados(){
    System.out.println( " Minimo: "+min+" Maximo: "+max+" Promedio: "+promedio);
 }
    
    
}
