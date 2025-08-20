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
public class parcial9 {
    public static void main(String args[]){
        pan P = new pan("Salvado",99.00,"Premium");
        Sandwich s =new Sandwich(P,4,"Sanguchito");
        ingrediente i =new ingrediente("queso",'B',8.00);
        ingrediente i2 =new ingrediente("jamon",'A',88.00);
        ingrediente i3 =new ingrediente("rucula",'A',4.00);
        ingrediente i4 =new ingrediente("tomate",'B',8.00);
        ingrediente i5 =new ingrediente("otro",'B',8.00);
        s.agregarIngrediente(i);
        s.agregarIngrediente(i2);
        s.agregarIngrediente(i3);
        s.agregarIngrediente(i4);
        s.agregarIngrediente(i5);
        System.out.println(s.toString());
    }
}
