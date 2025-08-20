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
public class torneoProfecional extends sitio {
    private torneo[] torneos;
    private int dimf;
    private int diml=0;

    public torneoProfecional(int dimf, String nombre, String direccion) {
        super(nombre, direccion);
        this.dimf = dimf;
        torneos=new torneo[dimf];
    }
    public boolean registrarTorneoProfesional(torneo t){
        if(dimf-diml>0){
            torneos[diml]=t;
            diml++;
            return true;
        }else return false;
    }
    @Override
    public double cotizarSitio(){
        double suma=1000*diml;
        for(int i = 0; i < diml; i++){
            suma+= torneos[i].getMontoInscripciones()-torneos[i].getMontoPagado();
        }
        return suma;
    }
    public String representacion(){
        String st="Nombre del sitio: "+super.getNombre()+" Direccion: "+super.getDireccion()+" Cantidad de Usuarios: "+super.getCantUsuarios()+" Cotizacion: "+this.cotizarSitio();
        return st;
    }
}
