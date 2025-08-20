/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

/**
 *
 * @author Usuario
 */
public class sumaNodos {
    private int cant;
    private int neg;
    private int pos;
    
    public sumaNodos(){
        cant=0;
        pos=0;
        neg=0;
    }
    public int getSuma(){
        return cant;
    }
    public int getNegativos(){
        return neg;
    }
    public int getPositivos(){
        return pos;
    }
    
    public void incrementar(){
        cant++;
    }
    public void incrementarNeg(){
        neg++;
    }
    public void incrementarPos(){
        pos++;
    }
}
