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
public class pareja {
    private participante uno;
    private participante dos;
    private String estiloBaile;

    public pareja(participante uno, participante dos, String estiloBaile) {
        this.uno = uno;
        this.dos = dos;
        this.estiloBaile = estiloBaile;
    }

    public String getEstiloBaile() {
        return estiloBaile;
    }

    public participante getUno() {
        return uno;
    }

    public participante getDos() {
        return dos;
    }
    
    
    
    public int diferenciaEdad(){
        if(uno.getEdad()>dos.getEdad()) return uno.getEdad()-dos.getEdad();
        else return dos.getEdad()-uno.getEdad();
    }
    
}
