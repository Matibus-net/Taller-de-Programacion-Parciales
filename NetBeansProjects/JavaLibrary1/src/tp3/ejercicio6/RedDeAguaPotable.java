/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio6;
import tp3.ejercicio1y2y3y5.GeneralTree;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class RedDeAguaPotable {
    private GeneralTree<Character> ab;

    public RedDeAguaPotable(GeneralTree<Character> ab) {
        this.ab=ab;
    }
    
    
    
     public double minimoCaudal(double caudal){
         if(ab.isEmpty()) return 0;
         else return (!ab.isLeaf())? minimo(ab,caudal):caudal;
     }
     
     private double minimo(GeneralTree<Character> ab,double caudal){
         if(ab.isLeaf()) return caudal;
         double cantMin=Double.MAX_VALUE;
         double cant=caudal/ab.getChildren().size();
         for(GeneralTree<Character> h: ab.getChildren()){
             double caudalHijo = minimo(h,cant);
             cantMin=Math.min(cantMin, caudalHijo);
         }
         return cantMin;
     }
     
     public static void main(String[] args){
        GeneralTree<Character> ab1= new GeneralTree<Character>('B');
        List<GeneralTree<Character>> hijo0 =new LinkedList<GeneralTree<Character>>();
        hijo0.add(new GeneralTree<Character>('L'));
        GeneralTree<Character> a= new GeneralTree<Character>('G',hijo0);
        List<GeneralTree<Character>> hijo1 =new LinkedList<GeneralTree<Character>>();
        hijo1.add(a);
        hijo1.add(new GeneralTree<Character>('F'));
        GeneralTree<Character> ab2 =new GeneralTree<Character>('C',hijo1);
        List<GeneralTree<Character>> hijo3 =new LinkedList<GeneralTree<Character>>();
        hijo3.add(new GeneralTree<Character>('M'));
        hijo3.add(new GeneralTree<Character>('N'));
        GeneralTree<Character> J =new GeneralTree<Character>('J',hijo3);
        List<GeneralTree<Character>> hijo2 =new LinkedList<GeneralTree<Character>>();
        hijo2.add(new GeneralTree<Character>('H'));
        hijo2.add(new GeneralTree<Character>('I'));
        hijo2.add(J);
        hijo2.add(new GeneralTree<Character>('K'));
        hijo2.add(new GeneralTree<Character>('P'));
        GeneralTree<Character> ab3 =new GeneralTree<Character>('D',hijo2);
        GeneralTree<Character> ab4 = new GeneralTree<Character>('E');
        List<GeneralTree<Character>> hijos =new LinkedList<GeneralTree<Character>>();
        hijos.add(ab1);
        hijos.add(ab2);
        hijos.add(ab3);
        hijos.add(ab4);
        GeneralTree<Character> ab= new GeneralTree<Character>('A',hijos);
        
        RedDeAguaPotable red = new RedDeAguaPotable(ab);
        System.out.println("Caudal minimo que recibe una casa: " + red.minimoCaudal(1000.0));
     }
}
