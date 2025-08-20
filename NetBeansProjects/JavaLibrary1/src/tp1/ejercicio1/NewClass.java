/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio1;

/**
 *
 * @author Usuario
 */
public class NewClass{

    public static void imprimirEnteros(int a,int b)
    {
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
    
    public static void imprimirConWhile(int a,int b){
        int i =a;
        while(i<=b){
            System.out.println(i);
            i++;
        }
    }
    
    public static void imprimirSinEstructuras(int a , int b ){
        if(a<=b){
            System.out.println(a);
            imprimirSinEstructuras(a+1,b);
        }
        
    }
    
    public static void main(String[] args) {
        // Valores de ejemplo
        int a = 1;
        int b = 10;

        System.out.println("Usando for:");
        imprimirEnteros(a, b);

        System.out.println("\nUsando while:");
        imprimirConWhile(a, b);

        System.out.println("\nUsando recursión (sin iterativas):");
        imprimirSinEstructuras(a, b);
    }
}
    