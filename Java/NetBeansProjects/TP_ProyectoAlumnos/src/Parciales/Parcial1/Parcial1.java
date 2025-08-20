/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Parciales;
import PaqueteLectura.*;

/**
 *
 * @author Usuario
 */
public class Parcial1 {
    public static void main(String args[]){
        Nadadores nadar = new Nadadores("Juan",15000,"Pedro",10000,10000000,25);
        Exploradores Explorar = new Exploradores(300,"Jec",10000,7500000,25);
        Chico juan= new Chico("Juan",221563333,false);
        if(nadar.añadirChico(juan)) System.out.println("Juan añadido con exito");
        else System.out.println("Juan no fue añadido");
        Chico mati= new Chico("mati",221579563,true);
        if(nadar.añadirChico(mati)) System.out.println("Mati añadido con exito");
        else System.out.println("Mati no fue añadido");
        Chico joako= new Chico("joako",22134323,true);
        if(nadar.añadirChico(joako)) System.out.println("Joako añadido con exito");
        else System.out.println("Joako no fue añadido");
        Chico seba= new Chico("seba",221563333,false);
        if(Explorar.añadirChico(seba)) System.out.println("seba añadido con exito");
        else System.out.println("seba no fue añadido");
        Chico mate= new Chico("mate",221579563,true);
        if(Explorar.añadirChico(mate)) System.out.println("mate añadido con exito");
        else System.out.println("mate no fue añadido");
        Chico jose= new Chico("jose",22134323,true);
        if(Explorar.añadirChico(jose)) System.out.println("jose añadido con exito");
        else System.out.println("jose no fue añadido");
        System.out.println(nadar.toString());
        System.out.println(Explorar.toString());
        if(nadar.esRentable()) System.out.println("El grupo de nado es rentable");
        else  System.out.println("El grupo de nado no es rentable");
        if(Explorar.esRentable()) System.out.println("El grupo de Exploracion es rentable");
        else  System.out.println("El grupo de Exploracion no es rentable");
    }
}
