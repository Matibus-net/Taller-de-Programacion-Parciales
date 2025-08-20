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
public class parcial8 {
    public static void main(String args[]){
        torneoAmateur ta= new torneoAmateur("AjedresAmateur","https://www.ajedresAmateur.com.ar");
        torneoProfecional tp= new torneoProfecional(3,"AjedresProfesional","https://www.ajedresProfecional.com.ar");
        ta.registrarTorneoAmateur(13);
        ta.registrarTorneoAmateur(10);
        torneo t= new torneo("Ajedre","12/08",150,20);
        torneo t1= new torneo("Ajedre","12/08",150,20);
        torneo t2= new torneo("Ajedre","12/08",150,20);
        torneo t3= new torneo("Ajedre","12/08",150,20);
        torneo t4= new torneo("Ajedre","12/08",150,20);
        System.out.println("Se pudo registrar?: "+tp.registrarTorneoProfesional(t));
        System.out.println("Se pudo registrar?: "+tp.registrarTorneoProfesional(t1));
        System.out.println("Se pudo registrar?: "+tp.registrarTorneoProfesional(t2));
        System.out.println("Se pudo registrar?: "+tp.registrarTorneoProfesional(t3));
        System.out.println("Se pudo registrar?: "+tp.registrarTorneoProfesional(t4));
        System.out.println(ta.representacion());
        System.out.println(tp.representacion());
    }
}
