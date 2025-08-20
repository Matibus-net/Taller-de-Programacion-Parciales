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
public class Butaca {
    private String descriptor;
    private double precio;
    private boolean ocupada;

    public Butaca(int i,int j) {
        this.precio=800+100*(i+1);
        this.ocupada=false;
        this.descriptor="Butaca "+(i+1)+" , "+(j+1);
    }

    public String getDescriptor() {
        return descriptor;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }
    public void ocupar(){
        this.ocupada=true;
    }
    public void desocupar(){
        this.ocupada=false;
    }
    @Override
    public String toString(){
        String st= this.getDescriptor()+" | Precio: "+this.getPrecio()+" | Ocupada?: "+this.isOcupada()+" | ";
        return st;
    }
}
