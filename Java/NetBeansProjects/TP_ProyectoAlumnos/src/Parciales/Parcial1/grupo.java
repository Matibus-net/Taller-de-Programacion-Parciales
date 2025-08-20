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
public abstract class grupo {
    private String nombreInstructor;
    private double sueldo;
    private double costoInscripcion;
    private Chico[] chicos;
    private int cantChicos;
    private int N;

    public grupo(String nombreInstructor, double sueldo, double costoInscripcion,int N) {
        this.nombreInstructor = nombreInstructor;
        this.sueldo = sueldo;
        this.costoInscripcion = costoInscripcion;
        chicos = new Chico[N];
        this.N=N;
        this.cantChicos=0;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getCostoInscripcion() {
        return costoInscripcion;
    }

    public int getCantChicos() {
        return cantChicos;
    }

    public void setCantChicos(int cantChicos) {
        this.cantChicos = cantChicos;
    }

    public void setCostoInscripcion(double costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }
    
    public boolean agregarAlVector(Chico c)
    {
        if(cantChicos<this.N){
            this.chicos[cantChicos]=c;
            cantChicos++;
            return true;
        }
        else return false;
    }
    
    public double getGanancia(){
        return (this.cantChicos*this.costoInscripcion)-this.sueldo;
    }
    @Override 
    public String toString(){
        String a="Nombre del Instructor: "+this.getNombreInstructor()+" Cantidad de Inscriptos: "+this.getCantChicos()+"\n";
        for(int i=0; i<cantChicos;i++){
            a+="|"+chicos[i].toString();
        }
        return a;
    }
    public abstract boolean añadirChico(Chico c);
    public abstract double gananciaNeta();
    public abstract boolean esRentable();
}
