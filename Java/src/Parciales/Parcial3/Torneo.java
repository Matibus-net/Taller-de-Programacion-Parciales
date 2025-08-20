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
public class Torneo {
    private String nombre;
    private goleador[][] goleadores;
    private int[] cantGoleadores;
    private int dimf ;

    public Torneo(String nombre, int m, int n) {
        this.nombre = nombre;
        goleadores=new goleador[n][m];
        cantGoleadores= new int[n];
        dimf=n;
        for (int i = 0; i<n; i++) {
             cantGoleadores[i]=0;
        }
    }

    public void agregarGoleador(int x , goleador g){
        goleadores[x-1][cantGoleadores[x-1]]=g;
        cantGoleadores[x-1]++;
    }
    
    public goleador menorGoleador(int x ){
        int min =999;
        goleador g= null;
        for (int i=0; i<cantGoleadores[x-1];i++){
            if(goleadores[x-1][i].getCantGoles()<min){
                min=goleadores[x-1][i].getCantGoles();
                g=goleadores[x-1][i];
            }
        }
        return g;
    }
    
    public int cantGoleadoresTorneo (){
        int suma=0;
        for (int i=0;i<dimf;i++){
            suma+=cantGoleadores[i];
        }
        return suma;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        String st=" Torneo: "+this.getNombre();
        st+="\n";
        
        for(int i=0;i<dimf;i++){
            st+="Fecha #"+(i+1)+" | "+(cantGoleadores[i])+" | Goleadores: ";
            for(int j = 0 ; j< cantGoleadores[i];j++){
                st+=goleadores[i][j].toString()+" | ";
            }
            st+="\n";
        }
        return st;
    }
    
}
