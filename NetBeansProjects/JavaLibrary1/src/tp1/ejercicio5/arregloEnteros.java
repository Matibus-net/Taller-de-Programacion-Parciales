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
public class arregloEnteros {
    
    public static String devolverReturn(int[] arreglo){
        int max=-399999999;
        int min = 999999999;
        int suma=0;
        
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]>max){
                max=arreglo[i];
            }
            if(arreglo[i]<min){
                min=arreglo[i];
            }
            suma+=arreglo[i];
        }
        
        double promedio= suma/arreglo.length;
        return "Minimo: "+min+" Maximo: "+max+" promedio: "+promedio;
    }
    
    public static void devolverParametros(int arreglo[], int resultados[]){
        int max=-399999999;
        int min = 999999999;
        int suma=0;
        
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]>max){
                max=arreglo[i];
            }
            if(arreglo[i]<min){
                min=arreglo[i];
            }
            suma+=arreglo[i];
        }
        
        double promedio= suma/arreglo.length;
        resultados[0]=max;
        resultados[1]=min;
        resultados[2]=(int)promedio;
    }
    
    public static void main(String[] args){
        int[] a=new int[30];
        for(int i = 0; i < 30; i++){
            a[i]=i;
        }
        int [] r = new int [3];
        devolverParametros(a,r);
        System.out.println("Imprimiendo con parametros");
        for(int i = 0; i<3; i++){
            System.out.println(r[i]);
        }
        System.out.println("Imprimiendo con return: ");
        System.out.println(devolverReturn(a));
        DevolverSinRniP.calcular(a);
        System.out.println("ImPRIMIR SIN PARAMETROS NI RETURN:.");
        DevolverSinRniP.devolverResultados();
    }
   
    
}

