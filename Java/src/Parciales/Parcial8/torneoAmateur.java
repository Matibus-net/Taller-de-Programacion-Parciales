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
public class torneoAmateur extends sitio {
    private int cantTorneos;
    private int cantClicks;

    public torneoAmateur( String nombre, String direccion) {
        super(nombre, direccion);
        this.cantTorneos = 0;
        this.cantClicks = 0;
    }

    public int getCantTorneos() {
        return cantTorneos;
    }

    public int getCantClicks() {
        return cantClicks;
    }
    
    public void registrarTorneoAmateur(int clicks){
        this.cantClicks+=clicks;
        this.cantTorneos++;
    }

    @Override
    public double cotizarSitio(){
        return (10*this.getCantClicks()+50*super.getCantUsuarios());
    }
    public String representacion(){
        String st="Nombre del sitio: "+super.getNombre()+" Direccion: "+super.getDireccion()+" Cantidad de Usuarios: "+super.getCantUsuarios()+" Cotizacion: "+this.cotizarSitio();
        return st;
    }
}
