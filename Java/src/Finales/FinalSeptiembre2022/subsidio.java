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
public abstract class subsidio {
    private String nombreI;
    private String nombrePlan;
    private String fecha;

    public subsidio(String nombreI, String nombrePlan, String fecha) {
        this.nombreI = nombreI;
        this.nombrePlan = nombrePlan;
        this.fecha = fecha;
    }

    public String getNombreI() {
        return nombreI;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    public abstract double montoTotal();
    @Override
    public String toString(){
        String st="Nombre Investigador: "+this.getNombreI()+" NobrePlan: "+this.getNombrePlan()+" Fecha: "+this.getFecha();
        return st;
    }
}
