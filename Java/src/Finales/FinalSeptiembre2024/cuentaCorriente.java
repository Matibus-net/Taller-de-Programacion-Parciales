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
public class cuentaCorriente extends cuenta{
    private double acuerdo;

    public cuentaCorriente(double acuerdo, int numeroCuenta, int DNI) {
        super(numeroCuenta, DNI);
        this.acuerdo = acuerdo;
    }

    public double getAcuerdo() {
        return acuerdo;
    }
    @Override
    public void depositar(double monto){
        double Saldo=monto+super.getSaldo();
        super.setSaldo(Saldo);
        super.actualizarHistorial(monto);
    }
    @Override
    public boolean esPosibleExtraer(double unMonto){
        if(super.getSaldo()+this.getAcuerdo()>unMonto){
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
        if(this.esPosibleExtraer(this.getAcuerdo()*50)){
            this.extraer(this.getAcuerdo()*50);
        }else super.setEstado(false);
    }
    @Override
    public String resumen(){
        String st =super.toString();
        st+="\n"+"Acuerdo: "+this.getAcuerdo();
        return st;
    }
}
