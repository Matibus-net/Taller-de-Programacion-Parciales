/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio7;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class capicua {
    public boolean esCapicua(ArrayList<Integer> lista){
        int i = 0;
        int j = lista.size() - 1;
        while (i < j) {
            if (!lista.get(i).equals(lista.get(j))) {
                return false;
            }
            i++;
            j--;
    }
        return true;
    }
        
}