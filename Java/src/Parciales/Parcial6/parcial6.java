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
public class parcial6 {
    public static void main(String args[]){
        agenda a=new agenda();
        paciente p1 = new paciente("mati",200,true);
        paciente p2 = new paciente("juan",200,true);
        paciente p3 = new paciente("ser",200,true);
        paciente p4 = new paciente("sil",200,true);
        paciente p5 = new paciente("nati",200,true);
        paciente p6 = new paciente("ine",200,true);
        a.agendar(p6, 1, 2);
        a.agendar(p1, 2, 2);
        a.agendar(p2, 3, 2);
        a.agendar(p3,4 , 2);
        a.agendar(p4,5, 2);
        a.agendar(p5, 1, 1);
        a.agendar(p6, 4, 2);
        a.agendar(p6, 1, 5);
        a.liberarTurnos("ine");
       System.out.println( a.tieneTurno("ine", 1));
       System.out.println( a.tieneTurno("nati", 1));
       System.out.println(a.agendarPrimerdia(p6, 3));
       System.out.println(a.agendarPrimerdia(p6, 5));
       System.out.println( a.tieneTurno("ine", 1));
       System.out.println(a.cantidadTurnos("ine"));
       a.liberarDia("ine",1);
       System.out.println(a.cantidadTurnos("ine"));
       System.out.println(a.cantidadTurnos("mati"));
       
    }        
}
