/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio4;
import tp3.ejercicio1y2y3y5.GeneralTree;
import tp1.ejercicio8.Queue;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class AnalizadorArbol {
     public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol){
         if(arbol.isEmpty())return 0;
         else return(!arbol.isLeaf())? calcularMaximoPromedio(arbol):arbol.getData().getTardanza();
     }
     
     private double calcularMaximoPromedio( GeneralTree<AreaEmpresa> a){
         double max=-1;
         int act=0;
         double mins=0;
         GeneralTree<AreaEmpresa> aux;
         Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
         cola.enqueue(a);
         cola.enqueue(null);
         while(!cola.isEmpty()){
             aux=cola.dequeue();
             if(aux!=null){
                 mins+=aux.getData().getTardanza();
                 act++;
                 List<GeneralTree<AreaEmpresa>> childrens = aux.getChildren();
                 for(GeneralTree<AreaEmpresa> child: childrens){
                     cola.enqueue(child);
                 }   
             }
             else if(!cola.isEmpty()){
                 if(mins/act>max){
                     max=mins/act;
                 }
                 cola.enqueue(null);
                 mins=0;
                 act=0;
             }
         }
        if(mins/act>max){
          max=mins/act;
        }
         return max;
     }
     public static void main(String[] args) {
        List<GeneralTree<AreaEmpresa>> children1 = new LinkedList<GeneralTree<AreaEmpresa>>();
        children1.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("A",4)));
        children1.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("B",7)));
        children1.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("C",5)));
        GeneralTree<AreaEmpresa> a1 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("J",13), children1);
        
        List<GeneralTree<AreaEmpresa>> children2 = new LinkedList<GeneralTree<AreaEmpresa>>();
        children2.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("D",6)));
        children2.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("E",10)));
        children2.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("F",18)));
        GeneralTree<AreaEmpresa> a2 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("K",25), children2);
        
        List<GeneralTree<AreaEmpresa>> children3 = new LinkedList<GeneralTree<AreaEmpresa>>();
        children3.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("G",9)));
        children3.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("H",12)));
        children3.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("I",19)));
        GeneralTree<AreaEmpresa> a3 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("L",10), children3);
        
        List<GeneralTree<AreaEmpresa>> children4 = new LinkedList<GeneralTree<AreaEmpresa>>();
        children4.add(a1);
        children4.add(a2);
        children4.add(a3);
        GeneralTree<AreaEmpresa> a = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M",14), children4);
        
        AnalizadorArbol arb = new AnalizadorArbol();
        System.out.println("El mayor promedio entre todos los valores promedios de los niveles es: " + arb.devolverMaximoPromedio(a));
    }
}

