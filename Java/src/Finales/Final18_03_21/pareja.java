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
public class pareja {
    private participante p1;
    private participante p2;
    private String estiloBaile;

    public pareja(participante p1, participante p2, String estiloBaile) {
        this.p1 = p1;
        this.p2 = p2;
        this.estiloBaile = estiloBaile;
    }

    public participante getP1() {
        return p1;
    }

    public participante getP2() {
        return p2;
    }

    
    
    public String getEstiloBaile() {
        return estiloBaile;
    }
    
    public int diffEdad(){
        if(p1.getEdad()>p2.getEdad())
            return p1.getEdad()-p2.getEdad();
        else
            return p2.getEdad()-p1.getEdad();
    }
    
    
}
