/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio9;
import tp2.ejercicio1.BinaryTree;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ParcialArboles {
    public BinaryTree<sumDiff> sumAndDif(BinaryTree<Integer> arbol){
        BinaryTree<sumDiff> ab=new BinaryTree<sumDiff>();
        if(!arbol.isEmpty()) {
            this.sumAndDif(arbol,ab,0,0);
        }
        return ab;     
    }
    
    private void sumAndDif(BinaryTree<Integer> arbol,BinaryTree<sumDiff> ab,int sum, int padre  ){
        int dato=arbol.getData();
        sumDiff sad = new sumDiff(dato+sum, dato - padre);
        ab.setData(sad);
        if(arbol.hasLeftChild()){
            ab.addLeftChild(new BinaryTree<sumDiff>());
            sumAndDif(arbol.getLeftChild(),ab.getLeftChild(),dato+sum,dato);
        }
        if(arbol.hasRightChild()){
            ab.addRightChild(new BinaryTree<sumDiff>());
            sumAndDif(arbol.getRightChild(),ab.getRightChild(),dato+sum,dato);
        }
    }
        public static void main(String[] args) {
        System.out.println("Test Ejercicio9");
        ParcialArboles parcialArb = new ParcialArboles();
        
        BinaryTree<Integer> ab = new BinaryTree<Integer>(20);
        ab.addLeftChild(new BinaryTree<Integer>(5));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(-5));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(10));
        ab.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(1));
        ab.addRightChild(new BinaryTree<Integer>(30));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(50));
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(-9));
        ab.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
        ab.getRightChild().getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(6));
        
        ab.entreNiveles(0, 4);
        System.out.println();
        System.out.println("Nuevo arbol:");
        parcialArb.sumAndDif(ab).entreNiveles(0, 4);
    }
}
