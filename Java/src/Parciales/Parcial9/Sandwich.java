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
public class Sandwich {
    private String nombre;
    private pan Pan;
    private ingrediente[] ingredientes;
    private int diml=0;
    private int dimf;

    public Sandwich(pan Pan, int dimf,String nombre) {
        this.nombre=nombre;
        this.Pan = Pan;
        this.dimf = dimf;
        ingredientes=new ingrediente[dimf];
    }
    
    public void agregarIngrediente(ingrediente i){
        if(dimf-diml>0){
            ingredientes[diml]=i;
            diml++;
        }else System.out.println("No hay espacio para mas ingredientes");
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString(){
        double costoS=this.Pan.costoFinal();
        String st ="Nombre: "+this.getNombre()+"\n";
        st+="Pan: "+this.Pan.toString()+"\n"+"Ingredientes: "+"\n";
        for(int i = 0; i<diml; i++){
            st+=ingredientes[i].toString()+"\n";
            costoS+=ingredientes[i].costoFinal();
        }
        st+="Costo del sandwich: "+costoS;
        return st;
    }
    
    
}
