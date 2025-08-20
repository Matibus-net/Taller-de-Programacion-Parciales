/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio9;

/**
 *
 * @author Usuario
 */
public class sumDiff {
    private int sum;
    private int dif;

    public sumDiff(int sum, int dif) {
        this.sum = sum;
        this.dif = dif;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getDif() {
        return dif;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }
    
    
        @Override
    public String toString() {
        return "Sum=" + sum + " Dif=" + dif; 
    }
}
