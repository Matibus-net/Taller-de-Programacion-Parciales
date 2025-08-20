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
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> V =new ArrayList<>() ;
        
        for (String arg : args) {
            try {
                int numero = Integer.parseInt(arg);
                V.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Ignorando argumento no numérico: " + arg);
            }
        }
        for(int i=0;i<V.size();i++ ){
            System.out.println(V.get(i));
        }
        
    }
}
/*el acceso seria mas lento si uso linked list
si se podria usar un while o un for each
*/