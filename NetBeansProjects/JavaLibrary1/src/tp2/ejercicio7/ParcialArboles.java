/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio7;
import java.util.*;
import tp2.ejercicio1.BinaryTree;
/**
 *
 * @author Usuario
 */
public class ParcialArboles {
    private BinaryTree<Integer> a;
    
    private int contarUnicoHijo(BinaryTree<Integer> ab){
        int cant=0;
        if(ab.hasLeftChild()) cant+=contarUnicoHijo(ab.getLeftChild());
        if(ab.hasRightChild()) cant+=contarUnicoHijo(ab.getRightChild());
        if(ab.hasRightChild()&&!ab.hasLeftChild()|| ab.hasLeftChild()&&!ab.hasRightChild()) cant++;
        return cant;
    }

    public ParcialArboles(BinaryTree<Integer> a) {
        this.a = a;
    }
    
    private boolean isLeftTree(BinaryTree<Integer> ab){
        int left=-1;
        int right=-1;
        if(ab.hasLeftChild()) left=contarUnicoHijo(ab.getLeftChild() );
        if(ab.hasRightChild()) right=contarUnicoHijo(ab.getRightChild());
        return left>right;
    }
    private BinaryTree<Integer> Buscar(BinaryTree<Integer> ab , int i){
        if(ab.getData()==i){
            return ab;
        }
        BinaryTree<Integer> res= new BinaryTree<Integer>();
        if(ab.hasLeftChild()) {
            res= Buscar(ab.getLeftChild(),i);
        }
        if(ab.hasRightChild()){
            res=Buscar(ab.getRightChild(),i);
        }
        return res;   
    }
    private boolean isLeftTree(int i){
        BinaryTree<Integer> ab=Buscar(a,i) ;
        return (!ab.isEmpty()? isLeftTree(ab):false);
    
    
    }
     public static void main (String[] args) { 
        System.out.println("Test Ejercicio 7");
        
        BinaryTree<Integer> ab = new BinaryTree<Integer>(2);
        ab.addLeftChild(new BinaryTree<Integer>(7));
        ab.addRightChild(new BinaryTree<Integer>(-5));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(23));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(6));
        ab.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(-3));
        ab.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(55));
        ab.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(11));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(19));
        ab.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
        ab.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(18));
        ab.entreNiveles(0, 4);
        
        ParcialArboles parcialArb = new ParcialArboles(ab);
        System.out.println("Resultado=" + parcialArb.isLeftTree(7));
        System.out.println("Resultado=" + parcialArb.isLeftTree(2));
        System.out.println("Resultado=" + parcialArb.isLeftTree(-5));
        System.out.println("Resultado=" + parcialArb.isLeftTree(19));
        System.out.println("Resultado=" + parcialArb.isLeftTree(-3));
    }
}
    

