/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masparciales;

/**
 *
 * @author Usuario
 */
public class parcial7 {
    public static void main(String args[]){
        Funcion f=new Funcion("Caperucita Roja","13/9/2025","12:00",5,5);
        System.out.println(f.ocuparButaca(1, 1));
        System.out.println(f.ocuparButaca(1, 2));
        System.out.println(f.ocuparButaca(3, 1));
        System.out.println(f.ocuparButaca(4, 1));
        System.out.println(f.ocuparButaca(5, 1));
        System.out.println(f.ocuparButaca(5, 2));
        System.out.println(f.toString());
        System.out.println(f.representacionButacas(1));
        f.desocuparFila(1);
        System.out.println(f.toString());
    }
}
