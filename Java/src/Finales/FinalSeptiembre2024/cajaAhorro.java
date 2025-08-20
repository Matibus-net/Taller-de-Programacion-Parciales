/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro;

import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class cajaAhorro extends cuenta {
    private boolean tieneTarjeta;

    public cajaAhorro(boolean tieneTarjeta, int numeroCuenta, int DNI) {
        super(numeroCuenta, DNI);
        this.tieneTarjeta = tieneTarjeta;
    }

    public boolean isTieneTarjeta() {
        return tieneTarjeta;
    }
    @Override
    public void depositar(double monto){
        double Saldo=monto+super.getSaldo();
        super.setSaldo(Saldo);
        super.actualizarHistorial(monto);
    }
    @Override
    public boolean esPosibleExtraer(double unMonto){
        if(super.getSaldo()>unMonto){
            return true;
        }else return false;
    }
    @Override
    public boolean extraer(double unMonto){
        if(this.esPosibleExtraer(unMonto)){
            double saldo=super.getSaldo()-unMonto;
            super.setSaldo(saldo);
            super.actualizarHistorial(-unMonto);
            return true;
        }else return false;
    }
    @Override
    public void cobrarMantenimiento(){
        double base;
        if(this.isTieneTarjeta()){
            base=2000;
        }else base=1000;
        double monto= base+(1/super.getSaldo()+1);
        if(this.esPosibleExtraer(monto)){
            this.extraer(monto);
        }else super.setEstado(false);
    }
    @Override
    public String resumen(){
        String st=super.toString();
        st+="\n"+"Tiene Tarjeta: ";
        if(this.isTieneTarjeta())st+="Si";
        else st+="No";
        return st;
    }
}
