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
public class parcial5 {
    public static void main(String args[]){
        concurso c= new concurso(3);
        participante p=new participante("Mati",46990222,19);
        participante p2=new participante("juan",50876455,15);
        participante p3=new participante("silvi",23000909,50);
        participante p4=new participante("ser",20440804,56);
        pareja pareja1=new pareja(p,p3,"zumba");
        pareja pareja2= new pareja(p2,p4,"Rock");
        c.agregarPareja(pareja2);
        c.agregarPareja(pareja1);
        pareja mayorDiff=c.diferenciaMayor();
        System.out.println("la pareja con mas diferencia de edad es la pareja conformada por: "+mayorDiff.getUno().getNombre()+" y por: "+mayorDiff.getDos().getNombre());
    }
}
