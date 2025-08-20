/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finales;

/**
 *
 * @author Usuario
 */
public class subsidioBienes extends subsidio {
    private  bien[] bienes;
    private int diml=0;
    private int n;

    public subsidioBienes(int n, String nombreI, String nombrePlan, String fecha) {
        super(nombreI, nombrePlan, fecha);
        this.n = n;
        this.bienes=new bien[n];
        
    }
    
    
   
    public void agregarBien(bien b){
        if(n-diml>0){
            bienes[diml]=b;
            diml++;
        }else System.out.println("No hay espacio para mas bienes");
    }
    public double montoTotal(){
        double monto=0;
        for(int i =0 ; i<diml;i++){
            monto+=bienes[i].costoFinal();
        }
        return monto;
    }
    @Override
    public String toString(){
        String st= super.toString()+" Monto Total: "+this.montoTotal()+"\n"+"Descripcion de los bienes solicitados: ";
        for(int i = 0;i<diml;i++){
            st+=this.bienes[i].getDescripcion()+", ";
        }
        return st;
    }
}
