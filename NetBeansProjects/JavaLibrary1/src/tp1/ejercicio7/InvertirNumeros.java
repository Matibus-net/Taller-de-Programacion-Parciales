/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio7;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class InvertirNumeros {
    public void Invertir(List<Integer> L){
        InvertirRecursivo(L,0,L.size()-1);
    }
    
    public void InvertirRecursivo(List<Integer> L,int i, int j){
        if(i>=j){
            return;
        }
        Integer temporal=L.get(i);
        L.set(i, L.get(j));
        L.set(j,temporal);
        InvertirRecursivo(L,i+1,j-1);
        
    }
}
