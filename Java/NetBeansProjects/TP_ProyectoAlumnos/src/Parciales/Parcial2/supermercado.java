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
public class supermercado {
    private String nombre;
    private String direccion;
    private producto[][] gondolas;
    private int[] dimension;
    private int G;
    private int E;

    public supermercado(String nombre, String direccion,int G, int E) {
        this.nombre = nombre;
        this.direccion = direccion;
        gondolas=new producto[G][E];
        dimension=new int[E];
        for(int i=0; i<E;i++){
            dimension[i]=0;
        }
        this.G=G;
        this.E=E;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void añadirProducto(producto p){
        int i =0;
        while(this.dimension[i]==this.E){
            i++;
        }
        this.gondolas[i][dimension[i]]=p;
        dimension[i]++;
    }
    public String listarMarcaxGondola(int X, String M){
        String s="Productos de la Gondola: "+X+" que son de la marca: "+M+"\n";
        for(int i=0; i<dimension[X-1];i++){
            if(gondolas[X-1][i].getMarca().equals(M)){
                s+=gondolas[X-1][i].toString()+" | ";
            }
        }
        return s;
    }
    public int mayorGondola(){
        int max=0;
        int maxima=-1;
        int cant=0;
        for(int i =0;i<G;i++){
            for(int j=0; j<dimension[i];j++){
                cant+=gondolas[i][j].getCantUnidades();
            }
            if(cant>max){
                max=cant;
                maxima=i;
            }
        }
        return (maxima+1);
    }
    
    @Override 
    public String toString(){
        String s="Supermercado: "+this.getNombre()+" Direccion: "+this.getDireccion()+"\n";
        for(int i = 0; i<G;i++){
            s+="Gondola: "+(i+1)+"\n";
            for(int j=0;j<dimension[i];j++){
                s+="("+(i+1)+","+(j+1)+") "+gondolas[i][j].toString()+" | ";
            }
            s+="\n";
        }
        return s;
    }
}
