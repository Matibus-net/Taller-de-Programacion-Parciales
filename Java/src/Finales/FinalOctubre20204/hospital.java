/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalOctubre20204;

/**
 *
 * @author Usuario
 */
public class hospital {
    private String nombre;
    private String direccion;
    private cama[][] camas;
    
    public hospital(String nombre,String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.camas=new cama[10][20];
        int id=1;
        for(int i = 0; i< 10; i++){
            for(int j =0; j<20;j++){
                camas[i][j]=new cama(id,false);
                id++;
            }
        }
    }
    public void ingresarPaciente(persona p,int piso,int numCama){
        if(camas[piso-1][numCama-1].isOcupada()){
            System.out.println("La cama seleccionada se encuentra ocupada por otro paciente ");
        }else camas[piso-1][numCama-1].agregarPaciente(p);
    }
    
    public void liberarCama(int DNI){
        for(int i=0; i<10;i++){
            for(int j=0;j<20;j++){
                if((camas[i][j].isOcupada())&&(camas[i][j].getPaciente().getDNI()==DNI)){
                    camas[i][j].liberarPaciente();
                }
            }
        }
    }
    public void actualizarDias(){
        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                if(camas[i][j].isOcupada()){
                    camas[i][j].incrementarDias();
                }
            }
        }
    }   
    public int pisosLlens(){
        int pisos=0;
        for(int i=0;i<10;i++){
            int cantCamas=0;
            for(int j=0;j<20;j++){
                if(camas[i][j].isOcupada()){
                    cantCamas++;
                }
            }
            if(cantCamas==20) pisos++;
        }
        return pisos;
    }
}