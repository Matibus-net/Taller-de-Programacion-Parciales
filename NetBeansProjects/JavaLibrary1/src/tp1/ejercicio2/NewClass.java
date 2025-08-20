/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class NewClass {
    

    public static int contar42 ( ) {
        Scanner s = new Scanner(System.in) ;
        int cantidad = 1 ;
        while (s.nextInt() != 42) {
            cantidad++;
        }
        return cantidad;
    }
    
    public static int[] generarArreglo(int n){
        int[] arreglo =new int[n];
        for(int i=1;i<=n;i++){
            arreglo[i-1]=i*n;
        }
        return arreglo;
    }
    
    public static void main(String[] args){
       Scanner scanner =new Scanner(System.in);
       System.out.print("Ingresa un número n: ");
       int n = scanner.nextInt();
       int[] multiplos = generarArreglo(n);
       System.out.println("Los primeros " + n + " múltiplos de " + n + " son:");
       for (int i = 0; i < multiplos.length; i++) {
            System.out.print(multiplos[i] + " ");
        }
    }
}
