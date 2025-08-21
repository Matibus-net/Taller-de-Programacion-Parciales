/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalOctubre20204;

/**
 *
 * @author Usuario
 */
public class persona {
    private int DNI;
    private String nombre;
    private String obraSocial;

    public persona(int DNI, String nombre, String obraSocial) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public int getDNI() {
        return DNI;
    }    
    
}
