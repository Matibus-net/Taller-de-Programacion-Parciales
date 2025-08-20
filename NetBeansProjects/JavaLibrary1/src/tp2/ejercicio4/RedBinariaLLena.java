/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio4;
import java.util.*;
import tp2.ejercicio1.BinaryTree;
/**
 *
 * @author Usuario
 */
public class RedBinariaLLena {
    private BinaryTree<Integer> red;

    public RedBinariaLLena(BinaryTree<Integer> red) {
        this.red = red;
    }

    public int retardoReenvio() {
        return (!red.isEmpty()) ? retardoReenvio(red) : 0;//si el arbol no esta vacio llamo al otro metodo con el arbol sino devuelvo 0 
    }
    
    private int retardoReenvio(BinaryTree<Integer> red) {
        int retHI = 0; //retardo hi
        int retHD = 0; //retardo hd
        if(red.hasLeftChild()) //si el arbol tiene hi
            retHI = retardoReenvio(red.getLeftChild()); //llamo con el hi
        if(red.hasRightChild()) // si tiene hd 
            retHD = retardoReenvio(red.getRightChild()); //llamo con hd
        return (Math.max(retHI, retHD)+ red.getData());//el maximo entre hi y hd le sumo el nodo actual
    }
    public static void main (String[] args) {
        System.out.println("Test mayor retardo");
        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
        ab.addLeftChild(new BinaryTree<Integer>(2));
        ab.addRightChild(new BinaryTree<Integer>(6));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
        
        RedBinariaLLena red = new RedBinariaLLena(ab);
        System.out.println("El mayor retardo posible es de: " + red.retardoReenvio() + " segundos");
    }
    
}
