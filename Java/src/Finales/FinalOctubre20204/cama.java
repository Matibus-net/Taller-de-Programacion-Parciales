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
public class cama {
    private int ID;
    private boolean ocupada;
    private persona paciente;
    private int cantDiasOcupada;
    
    
    public cama(int id, boolean ok){
        this.ID=id;
        this.ocupada=ok;
        this.paciente=null;
        this.cantDiasOcupada=0;
    }

    public int getID() {
        return ID;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public persona getPaciente() {
        return paciente;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setPaciente(persona paciente) {
        this.paciente = paciente;
    }
    
    
    
    public void agregarPaciente(persona p){
        this.setOcupada(true);
        this.setPaciente(p);
    }
    public void liberarPaciente(){
        this.setOcupada(false);
        this.setPaciente(null);
    }
    public void incrementarDias(){
        this.cantDiasOcupada++;
    }
}
