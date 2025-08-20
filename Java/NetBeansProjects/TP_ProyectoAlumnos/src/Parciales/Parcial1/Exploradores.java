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
public class Exploradores extends grupo{
    private double costoAlquiler;

    public Exploradores(double costoAlquiler, String nombreInstructor, double sueldo, double costoInscripcion, int N) {
        super(nombreInstructor, sueldo, costoInscripcion, N);
        this.costoAlquiler = costoAlquiler;
    }

    public double getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(double costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }
    
    public boolean añadirChico(Chico c){
        return super.agregarAlVector(c);
    } 
    
    public double gananciaNeta(){
        return super.getGanancia()-this.getCostoAlquiler();
    }
    public boolean esRentable(){
        return this.gananciaNeta()>5000000;
    }
    @Override
    public String toString(){
        String s=super.toString();
        s+="\n";
        s+="Ganancia Neta del grupo: "+this.gananciaNeta();
        return s;
    }
}
