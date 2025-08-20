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
public class Final1 {
    public static void main(String[] args){
        Concurso c = new Concurso(2);
        participante p = new participante(46990222,"Mati",19);
        participante p1 = new participante(50998232,"juan",15);
        participante p2 = new participante(34243243,"sil",50);
        participante p3 = new participante(20440804,"ser",55);
        pareja par1=new pareja(p,p1,"Rock");
        pareja par2= new pareja(p2,p3,"Zumba");
        c.añadirPareja(par1);
        c.añadirPareja(par2);
        System.out.println("La pareja con mas diferencia de edad es la pareja conformada por: "+c.mayorDiffEdad().getP1().getNombre()+" y por: "+c.mayorDiffEdad().getP2().getNombre());
    }
}
