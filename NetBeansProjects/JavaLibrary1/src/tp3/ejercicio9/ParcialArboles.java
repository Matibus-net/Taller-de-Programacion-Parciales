/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio9;
import tp3.ejercicio1y2y3y5.GeneralTree;
import tp1.ejercicio8.Queue;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ParcialArboles {
    
     public static boolean esDeSeleccion (GeneralTree<Integer> arbol){
        Queue<GeneralTree<Integer>> cola= new Queue<GeneralTree<Integer>>(); // creo cola
        boolean ok= true; // creo var para ver si cumple todos
        if(!arbol.isEmpty()){
            cola.enqueue(arbol); //encolo arbol
            while(!cola.isEmpty()&&ok){
                GeneralTree<Integer> aux=cola.dequeue();
                int min = Integer.MAX_VALUE;
                for(GeneralTree<Integer> h: aux.getChildren()){
                    cola.enqueue(h);
                    min=Math.min(min, aux.getData());
                }
                if(!aux.isLeaf()&& aux.getData()!=min ) ok= false;
            }
        }
        return ok;
     }
}
