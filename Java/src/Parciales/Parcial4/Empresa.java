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
public class Empresa {
    private String nombre;
    private String direccion;
    private Director DirectorEjecutivo;
    private Encargado[] Encargados;
    private int dimf;
    private int diml=0;

    public Empresa(String nombre, String direccion, Director DirectorEjecutivo, int dimf) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DirectorEjecutivo = DirectorEjecutivo;
        this.dimf = dimf;
        Encargados=new Encargado[dimf];
        for(int i=0;i<dimf;i++){
            Encargados[i]=null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void agregarEmpleado(int x, Encargado E){
        if(Encargados[x-1]!=null){
            System.out.println("ESA SUCURSAL YA TIENE ENCARGADO");
        }else {
            Encargados[x-1]=E;
            diml++;
        }
    }
    @Override
    public String toString(){
        String st="Nombre de l empresa: "+this.getNombre()+" Direccion: "+this.getDireccion()+"\n";
        st+="Director: "+this.DirectorEjecutivo.toString()+"\n";
        st+="------------------------------"+"\n";
        for(int i = 0 ; i<diml;i++){
           st+="Sucursal: "+(i+1)+" Encargado: "+Encargados[i].toString()+"\n";
           st+="---------------------------"+"\n";
        }
        if(dimf-diml!=0)
            st+="\n Hay "+(dimf-diml)+" Sucursales sin encargado";
        return st;
    }
}
