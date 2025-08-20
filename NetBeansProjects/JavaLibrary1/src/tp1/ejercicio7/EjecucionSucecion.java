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
public class EjecucionSucecion {
    public List<Integer> calcularsucecion(int n){
        if(n==0){
            return null;
        }
        List<Integer> lista=new ArrayList<>();
        calcularRecursivo(n,lista);
        return lista;
    }
    public void calcularRecursivo(int n, List<Integer> L){
        L.add(n);
        if(n==1){
            return;
        }
        if(n%2==0){
            calcularRecursivo(n/2,L);
        }
        else
            calcularRecursivo(3*n+1,L);
    }
}
