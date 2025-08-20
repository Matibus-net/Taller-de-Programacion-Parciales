/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio3;
import java.util.*;
import tp2.ejercicio1.BinaryTree;
import tp1.ejercicio8.Queue;
/**
 *
 * @author Usuario
 */
public class ContadorArbol {
    private BinaryTree<Integer> a;

    public ContadorArbol(BinaryTree<Integer> arb) {
            a=arb;
    }
    
    
    public List<Integer> numerosParesPre(){
        List<Integer> l= new LinkedList<Integer>();
        if(!a.isEmpty())
            this.nParesPre(l,a);
        return l;
    }
    
    public void nParesPre(List<Integer> l, BinaryTree<Integer> a){
        if(a.getData()%2==0){
            l.add(a.getData());
        }
        if(a.hasLeftChild()){
            nParesPre(l,a.getLeftChild());
        }
        if(a.hasRightChild()){
            nParesPre(l,a.getRightChild());
        }
    }
    public List<Integer> numerosParesPost(){
        List<Integer> l= new LinkedList<Integer>();
        if(!a.isEmpty())
            this.nParesPost(l,a);
        return l;
    }
        
        
    public void nParesPost(List<Integer> l, BinaryTree<Integer> a){
        if(a.hasLeftChild()){
            nParesPost(l,a.getLeftChild());
        }
        if(a.hasRightChild()){
            nParesPost(l,a.getRightChild());
        }
        if(a.getData()%2==0){
            l.add(a.getData());
        }
    }
    
    public List<Integer> numerosParesIn(){
        List<Integer> l= new LinkedList<Integer>();
        if(!a.isEmpty()){
            this.nParesIn(l,a);   
        }
        return l;
    }
    
    public void nParesIn(List<Integer> l, BinaryTree<Integer> a){
        if(a.hasLeftChild()){
            nParesIn(l,a.getLeftChild());
        }
        if(a.getData()%2==0){
            l.add(a.getData());
        }
        if(a.hasRightChild()){
            nParesIn(l,a.getRightChild());
        }
    }
    
 public void printLevelTraversal() {
        BinaryTree<Integer> ab = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        cola.enqueue(a);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            ab = cola.dequeue();
            if (ab != null) {
                System.out.print(ab.getData() + " | ");
                if (ab.hasLeftChild()) {
                    cola.enqueue(ab.getLeftChild());
                }
                if (ab.hasRightChild()) {
                    cola.enqueue(ab.getRightChild());
                }
            } else if (!cola.isEmpty()) {
                System.out.println();
                cola.enqueue(null);
            }
        }
 }

public static void main (String[] args) {
        System.out.println("Test numeros Pares");
        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
        ab.addLeftChild(new BinaryTree<Integer>(2));
        ab.addRightChild(new BinaryTree<Integer>(6));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
        
        ContadorArbol c = new ContadorArbol(ab);
        System.out.println("Imprimir por niveles:");
        c.printLevelTraversal();
        
        System.out.println("");
        List<Integer> lisIN = c.numerosParesIn();
        System.out.println("Los nodos pares del arbol en INORDER son: ");
        System.out.println(lisIN);
        
        List<Integer> lisPRE = c.numerosParesPre();
        System.out.println("Los nodos pares del arbol en PREORDER son: ");
        System.out.println(lisPRE);
        
        List<Integer> lisPOST = c.numerosParesPost();
        System.out.println("Los nodos pares del arbol en POSTORDER son: ");
        System.out.println(lisPOST);
    }
}