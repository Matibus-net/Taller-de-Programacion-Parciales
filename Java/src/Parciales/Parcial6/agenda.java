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
public class agenda {
    private paciente[][] pacientes;

    public agenda() {
        pacientes=new paciente[5][6];
    }
    
    public void agendar(paciente p, int dia, int turno){
        pacientes[dia-1][turno-1]=p;
       
    }
    public void liberarTurnos(String nombre){
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(pacientes[i][j]!=null && pacientes[i][j].getNombre().equals(nombre)){
                    pacientes[i][j]=null;
 
                }
            }
        }
    }
    public int agendarPrimerdia(paciente p , int turno){
        int dia=-1;
        int i =0;
        while(i<5 && dia==-1){
            if(pacientes[i][turno-1]==null){
                pacientes[i][turno-1]=p;
                dia=(i+1);
            }
            i++;
        }
        return dia;
    }
    
    public void liberarDia(String nombre,int dia){
        for(int i=0;i<6;i++){
            if(pacientes[dia-1][i]!=null && pacientes[dia-1][i].getNombre().equals(nombre)){
                pacientes[dia-1][i]=null;
            }
        }
    }
    
    public int cantidadTurnos(String nombre){
        int cant=0;
        for(int i=0; i < 5;i++){
            for(int j =0;j<6;j++){
                if(pacientes[i][j]!=null&&pacientes[i][j].getNombre().equals(nombre)){
                    cant++;
                }
            }
        }
        return cant;
    }
    
    public boolean tieneTurno(String nombre,int d){
        boolean ok=false;
        for(int i= 0; i < 6 ; i ++){
            if(pacientes[d-1][i]!=null && pacientes[d-1][i].getNombre().equals(nombre)){
                    ok=true;
            }
        }
        return ok;
    }
    
}
