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
public class ingrediente {
    private String nombre;
    private char grupo;
    private double costo;

    public ingrediente(String nombre, char grupo, double costo) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGrupo() {
        return grupo;
    }

    public double getCosto() {
        return costo;
    }
    
    public double costoFinal(){
        if(this.getGrupo()=='B'){
            return this.getCosto()+this.getCosto()%10;
        }else return this.getCosto();
    }
    @Override
    public String toString(){
        String st="Nombre: "+this.getNombre()+" CostoFinal: "+this.costoFinal()+" Grupo: "+this.getGrupo();
        return st;
    }
}
