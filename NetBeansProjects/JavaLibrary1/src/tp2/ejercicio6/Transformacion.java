/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio6;
import java.util.*;
import tp2.ejercicio1.BinaryTree;
/**
 *
 * @author Usuario
 */
public class Transformacion {
    private BinaryTree<Integer> ab;

    public Transformacion(BinaryTree<Integer> a) {
        this.ab = a;
    }
    
    public BinaryTree<Integer> getAb(){
        return ab;
    }
    
    public BinaryTree<Integer> suma(){
        suma(ab);
        return ab;
    }
    private int suma(BinaryTree<Integer> ab){
        int sum = 0;
        if(ab.isLeaf()) {
            sum = ab.getData();
            ab.setData(0);
            return sum;
        }
        else{
            if(ab.hasLeftChild()) {
                sum+= suma(ab.getLeftChild());
            }
            if(ab.hasRightChild()) {
                sum+= suma(ab.getRightChild());
            }
        }
        int act = ab.getData();
        ab.setData(sum);
        return sum+act;
    }
}
