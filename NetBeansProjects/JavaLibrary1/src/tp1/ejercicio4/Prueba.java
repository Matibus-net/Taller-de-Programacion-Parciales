/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio4;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void swap1 (int x, int y) { 
        if (x < y) { 
            int tmp = x ; 
            x = y ; 
            y = tmp; 
        } 
    } 
    public static void swap2 (Integer x, Integer y) { 
        if (x < y) { 
            int tmp = x ; 
            x = y ; 
            y = tmp; 
        } 
    }

    public static void main(String[] args) { 
        int a = 1, b = 2; 
        Integer c = 3, d = 4; 
        swap1(a,b); //a=2,b=1
        swap2(c,d); //c=4,d=3
        System.out.println("a=" + a + " b=" + b) ;// 1 y 2
        System.out.println("c=" + c + " d=" + d) ; //3 y 4
    } 
} 
