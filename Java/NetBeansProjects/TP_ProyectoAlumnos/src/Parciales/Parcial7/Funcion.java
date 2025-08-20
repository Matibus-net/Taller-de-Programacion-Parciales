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
public class Funcion {
    private String titulo;
    private String fecha;
    private String hora;
    private Butaca[][]butacas;
    private int n;
    private int m;
    

    public Funcion(String titulo, String fecha, String hora, int n,int m) {
        this.m=m;
        this.n=n;
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        butacas= new Butaca[n][m];
        for(int i=0;i<n;i++){
            for(int j=0 ;j<m;j++){
                Butaca b= new Butaca(i,j);
                butacas[i][j]=b;
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    public double ocuparButaca(int b, int f){
        butacas[b-1][f-1].ocupar();
        return butacas[b-1][f-1].getPrecio();
    }
    public void desocuparFila(int f){
        for(int i=0;i<m;i++){
            if(butacas[f-1][i].isOcupada())
                butacas[f-1][i].desocupar();
        }
    }
    public String representacionButacas(int b){
        String st="Butacas numero B: \n";
        for(int i=0; i<n;i++){
            st+=butacas[i][b-1].toString();
        }
        return st;
    }
    
    @Override
    public String toString(){
        String st="Titulo: "+this.getTitulo()+" Fecha: "+this.getFecha()+" Hora: "+this.getHora()+"\n";
        for(int i=0; i<n; i ++ ){
            for(int j=0;j<m;j++){
                st+=butacas[i][j].toString();
            }
            st+="\n";
        }
        return st;
    }
    
}
