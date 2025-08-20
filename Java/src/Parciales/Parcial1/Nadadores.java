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
public class Nadadores extends grupo{
    private String nombreBañero;
    private double sueldoBañero;

    public Nadadores(String nombreBañero, double sueldoBañero, String nombreInstructor, double sueldo, double costoInscripcion, int N) {
        super(nombreInstructor, sueldo, costoInscripcion, N);
        this.nombreBañero = nombreBañero;
        this.sueldoBañero = sueldoBañero;
    }

    public String getNombreBañero() {
        return nombreBañero;
    }

    public void setNombreBañero(String nombreBañero) {
        this.nombreBañero = nombreBañero;
    }

    public double getSueldoBañero() {
        return sueldoBañero;
    }

    public void setSueldoBañero(double sueldoBañero) {
        this.sueldoBañero = sueldoBañero;
    }

    public boolean añadirChico(Chico c){
        if(c.isNada()){
            return super.agregarAlVector(c);
        }
        else return false;
    }
    public double gananciaNeta(){
        return super.getGanancia()-this.getSueldoBañero();
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
