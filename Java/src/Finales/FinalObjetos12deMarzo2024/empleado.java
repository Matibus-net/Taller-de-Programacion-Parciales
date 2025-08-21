/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalObjetos12deMarzo2024;

/**
 *
 * @author Usuario
 */
public class empleado {
    private String nombre;
    private String apellido;
    private int antiguedadEnAños;

    public empleado(String nombre, String apellido, int antiguedadEnAños) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedadEnAños = antiguedadEnAños;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAntiguedadEnAños() {
        return antiguedadEnAños;
    }
    
    @Override
    public String toString(){
        String st="Nombre: "+this.getNombre()+" | Apellido: "+this.getApellido()+" | Antiguedad: "+this.getAntiguedadEnAños();
        return st;
    }
    
}
