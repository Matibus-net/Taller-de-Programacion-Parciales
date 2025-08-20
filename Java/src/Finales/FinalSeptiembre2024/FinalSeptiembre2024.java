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
public class FinalSeptiembre2024 {
    public static void main(String[] args){
        cajaAhorro ca=new cajaAhorro(true,5,46990222);
        cuentaCorriente cc=new cuentaCorriente(100.00,6,46990222);
        ca.depositar(56.00);
        cc.depositar(10000.00);
        System.out.println(ca.extraer(5000.00));
        System.out.println(cc.extraer(5000.00));
        ca.cobrarMantenimiento();
        cc.cobrarMantenimiento();
        System.out.println(ca.resumen());
        System.out.println(cc.resumen());
    }
}
