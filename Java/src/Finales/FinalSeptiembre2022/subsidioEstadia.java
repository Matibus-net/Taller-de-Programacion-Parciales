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
public class subsidioEstadia extends subsidio{
    private String lugarDestino;
    private double costoPasaje;
    private int cantDias;
    private double diaHotel;

    public subsidioEstadia(String lugarDestino, double costoPasaje, int cantDias, double diaHotel, String nombreI, String nombrePlan, String fecha) {
        super(nombreI, nombrePlan, fecha);
        this.lugarDestino = lugarDestino;
        this.costoPasaje = costoPasaje;
        this.cantDias = cantDias;
        this.diaHotel = diaHotel;
    }

    

    public String getLugarDestino() {
        return lugarDestino;
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public int getCantDias() {
        return cantDias;
    }

    public double getDiaHotel() {
        return diaHotel;
    }
    
    public double montoTotal(){
        return this.getCostoPasaje()+this.getCantDias()*this.getDiaHotel();
    }
    @Override
    public String toString(){
        String st=super.toString()+" Monto Total: "+this.montoTotal()+" Lugar de destino: "+this.getLugarDestino()+" Dias de estadia: "+this.getCantDias();
        return st;
    }
}
