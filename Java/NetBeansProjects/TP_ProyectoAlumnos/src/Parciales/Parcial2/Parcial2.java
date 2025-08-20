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
public class Parcial2 {
    public static void main(String args[]){
        supermercado chino=new supermercado("Chino","22 Y 60",2,2);
        producto mayonesa= new producto(01,"mayonesa","Helmans",5,15.00);
        chino.añadirProducto(mayonesa);
        producto mostaza= new producto(02,"mostaza","Helmans",2,10.00);
        chino.añadirProducto(mostaza);
        producto ketchup= new producto(03,"ketchup","Helmans",10,15.00);
        chino.añadirProducto(ketchup);
        producto mayo= new producto(04,"mayonesa","Natura",5,12.00);
        chino.añadirProducto(mayo);
        
        System.out.println(chino.listarMarcaxGondola(1, "Natura")+"\n");
        
        System.out.println(chino.listarMarcaxGondola(1, "Helmans")+"\n");
        
        System.out.println("La gondola con mayor cantidad de productos es la gondola numero: "+chino.mayorGondola());
        System.out.println(chino.toString());
    }
}
