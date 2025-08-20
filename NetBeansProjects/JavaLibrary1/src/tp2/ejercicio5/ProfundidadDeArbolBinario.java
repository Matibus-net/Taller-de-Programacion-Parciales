/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio5;
import java.util.*;
import tp2.ejercicio1.BinaryTree;
/**
 *
 * @author Usuario
 */
public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> a;

    public ProfundidadDeArbolBinario(BinaryTree<Integer> a) {
        this.a = a;
    }
    
   public  int sumaElementosProfundidad (int p){
        return(!a.isEmpty()? sumaElementosProfundidad(a,p,0):0);
   } 
   
   private int sumaElementosProfundidad(BinaryTree<Integer> a,int p,int act){
       if(p==act)
        return a.getData();
       else {
           int suma=0;
           if(a.hasLeftChild()) suma+=sumaElementosProfundidad(a,p,act+1);
           if(a.hasRightChild()) suma+= sumaElementosProfundidad(a,p,act+1);
           return suma;               
       }
   }
}
