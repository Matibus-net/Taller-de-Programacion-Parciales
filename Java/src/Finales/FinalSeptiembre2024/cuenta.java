/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro;

/**
 *
 * @author Usuario
 */
public abstract class cuenta {
    private int numeroCuenta;
    private int DNI;
    private double saldo;
    private boolean estado;
    private double[] movimientos;

    public cuenta(int numeroCuenta, int DNI) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = 0;
        this.estado = true;
        this.movimientos=new double[20];
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void actualizarHistorial(double monto){
        double aux;  
        double aux2;
        aux=movimientos[0];
        movimientos[0]=monto;
        for(int i=1; i<20;i++){
            aux2=movimientos[i];
            movimientos[i]=aux;
            aux=aux2;
        }
    }
    @Override
    public String toString(){
        String st="Numero de la cuenta: "+this.getNumeroCuenta()+" DNI del titular de la cuenta: "+this.getDNI();
        st+="\n"+"Movimientos: "+"\n";
        for(int i=0;i<20;i++){
            if(this.movimientos[i]!=0){
                st+="Movimiento: "+movimientos[i]+"\n";
            }
        }
        st+="Estado de la cuenta: ";
        if(this.isEstado())st+="Activa";
        else st+="Cancelada";
        st+="\n"+"           Saldo Disponible: "+this.getSaldo();
        return st;
    }
    
    public abstract void depositar(double monto);
    public abstract boolean esPosibleExtraer(double unMonto);
    public abstract boolean extraer(double umMonto);
    public abstract void cobrarMantenimiento();
    public abstract String resumen();
}
