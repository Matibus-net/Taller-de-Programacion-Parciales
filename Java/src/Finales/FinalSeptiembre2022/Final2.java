/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finales;

/**
 *
 * @author Usuario
 */
public class Final2 {
    public static void main(String[] args){
        subsidioBienes sb = new subsidioBienes(3,"Maati","JUEGOS","15/7/25");
        subsidioEstadia se= new subsidioEstadia("Mardel",35.00,10,150.00,"Maati","JUEGOS","15/7/25");
        bien b1=new bien("Coca",3,5.00);
        bien b2=new bien("manaos",4,5.00);
        bien b3=new bien("7up",10,5.00);
        bien b4=new bien("fanta",3,5.00);
        sb.agregarBien(b1);
        sb.agregarBien(b2);
        sb.agregarBien(b3);
        sb.agregarBien(b4);
        System.out.println(sb.toString());
        System.out.println(se.toString());
    }
}
