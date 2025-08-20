/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio8;
import tp3.ejercicio1y2y3y5.GeneralTree;
/**
 *
 * @author Usuario
 */
public class abetoNavideño {
    private GeneralTree<Integer> abeto;
    
    public abetoNavideño(GeneralTree<Integer> abe){
        abeto=abe;
    }
    public String esAbetoNavidenio() {
        boolean res = isAbeto(abeto);
        return res ? "Yes" : "No";
    }
    
    private boolean isAbeto(GeneralTree<Integer> ab) {
        int nodosHoja = 0;
        for(GeneralTree<Integer> h: ab.getChildren()) {
            if(h.isLeaf()) nodosHoja++;
            else if(!isAbeto(h)) return false;
        }
        return nodosHoja >= 3;
    }
}
