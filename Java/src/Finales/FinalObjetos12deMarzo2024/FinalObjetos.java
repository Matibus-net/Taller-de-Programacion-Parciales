/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalObjetos12deMarzo2024;

/**
 *
 * @author Usuario
 */
public class FinalObjetos {
    public static void main(String args[]){
        sector s= new sector("Camionetas",6);
        empleado e1 = new empleado("Matias","Buscemi",11);
        empleado e2 =new empleado("Serena","Buscemi",7);
        empleado jefe = new empleado("Simba", "Buscemi",1);
        producto p=new producto(1);
        producto p1= new producto(2);
        s.agregarEmpleado(e2, false);
        s.agregarEmpleado(e1, false);
        s.agregarEmpleado(jefe, true);
        s.agregarProducto(p1);
        s.agregarProducto(p);
        s.cambiarEtapa(1, 100.00);
        s.cambiarEtapa(1, 100.00);
        s.cambiarEtapa(1, 100.00);
        s.cambiarEtapa(1, 100.55);
        s.cambiarEtapa(1, 100.00);
        System.out.println(s.toString());
    }
}
