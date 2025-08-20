/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;
import tp3.ejercicio1y2y3y5.GeneralTree;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Parcial {
    public int resolver(GeneralTree<Integer> ab){
        if(!ab.isEmpty()){
            sumaNodos sum = new sumaNodos();
            this.resolver(ab,sum);
            return(sum.getSuma()%2==1)? sum.getNegativos(): sum.getPositivos();
        }
        else
            return 0;
    }
    
    public void resolver(GeneralTree<Integer>ab,sumaNodos sum){
        List<GeneralTree<Integer>> childrens= ab.getChildren();
        if(ab.hasChildren()){
            resolver(childrens.get(0),sum);
        }
        sum.incrementar();
        if(ab.getData()>0) sum.incrementarPos();
        else sum.incrementarNeg();
        for(int i=1;i<childrens.size();i++){
            resolver(childrens.get(i),sum);
        }
    }
    
    public static void main(String[] args) {
        List<GeneralTree<Integer>> subChildren1 = new LinkedList<GeneralTree<Integer>>();
        subChildren1.add(new GeneralTree<Integer>(1));
        GeneralTree<Integer> subA = new GeneralTree<Integer>(6, subChildren1);
        List<GeneralTree<Integer>> subChildren2 = new LinkedList<GeneralTree<Integer>>();
        subChildren2.add(new GeneralTree<Integer>(10));
        subChildren2.add(subA);
        GeneralTree<Integer> a1 = new GeneralTree<Integer>(17, subChildren2);
        
        List<GeneralTree<Integer>> subChildren3 = new LinkedList<GeneralTree<Integer>>();
        subChildren3.add(new GeneralTree<Integer>(8));
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(9, subChildren3);
        
        List<GeneralTree<Integer>> subChildren4 = new LinkedList<GeneralTree<Integer>>();
        subChildren4.add(new GeneralTree<Integer>(16));
        subChildren4.add(new GeneralTree<Integer>(7));
        GeneralTree<Integer> subB = new GeneralTree<Integer>(14, subChildren4);
        List<GeneralTree<Integer>> subChildren5 = new LinkedList<GeneralTree<Integer>>();
        subChildren5.add(subB);
        subChildren5.add(new GeneralTree<Integer>(18));
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(15, subChildren5);
        
        List<GeneralTree<Integer>> arbol = new LinkedList<GeneralTree<Integer>>();
        arbol.add(a1);
        arbol.add(a2);
        arbol.add(a3);
        GeneralTree<Integer> a = new GeneralTree<Integer>(12, arbol);
}
}
