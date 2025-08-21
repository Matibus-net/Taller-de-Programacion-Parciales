/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalObjetos12deMarzo2024;

/**
 *
 * @author Usuario
 */
public class producto {
    private int codigo;
    private double costo;
    private int etapa;

    public producto(int codigo) {
        this.codigo = codigo;
        this.costo = 0;
        this.etapa = 1;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public double getCosto() {
        return costo;
    }

    public int getEtapa() {
        return etapa;
    }
    
    public boolean actualizar(double costo){
        if(this.etapa<5){
            this.etapa++;
            this.costo+=costo;
            return true;
        }else return false;
    }
}
