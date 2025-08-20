/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicioz10;
import java.util.*;
import tp1.ejercicio8.Queue;
import tp3.ejercicio1y2y3y5.GeneralTree;
/**
 *
 * @author Usuario
 */
public class ParcialArbol {
     public static List<Integer> resolver(GeneralTree<Integer> arbol){
         List<Integer> lista =new ArrayList<Integer>(); //se crea la lista para el camaino 
         if(arbol!=null&&!arbol.isEmpty()){ // se verifica q el arbol no este vacio ni con valor null
            resolverAyuda(arbol,0,new ArrayList<Integer>(),0,lista,new int[]{-1}); // se llama al metodo recursivo
         }
         return lista; // se retorna la lista
     }
     
     private static void resolverAyuda(GeneralTree<Integer> ab,int nivel,List<Integer> camino,int suma,List<Integer> mejorcamino,int[] mejorsuma){
         int valor= ab.getData(); // se saca la data
         int sumaNueva= suma+valor*nivel; // se le suma a nuestra el nuevo valor
         List<Integer> nuevoCamino= new ArrayList<Integer>(camino); // se crea el nuevo camino basado en el anterior
         if(valor==1){
             nuevoCamino.add(1); // si es uno lo agregamos al camino
         }
         if(ab.isLeaf()){ // si es una hoja, osea q llegue al final, se pregunta si la suma es mayor a la q teniamos 
             if(sumaNueva>mejorsuma[0]){
                 mejorsuma[0]=sumaNueva; // se actualiza la suma 
                 mejorcamino.clear();// se borra la lista anterior 
                 mejorcamino.addAll(nuevoCamino); // se la remplaza por la nueva ya q la nueva es mejor 
             }
         }
         else { // si no es una hoja 
             for(GeneralTree<Integer> h: ab.getChildren()){ // se recorren los hijos 
                resolverAyuda(h,nivel+1,nuevoCamino,sumaNueva,mejorcamino,mejorsuma); // se hace el llamado con los datos nuevos 
             }
                 
         }
     }
    public static void main(String[] args) {
        // Nivel 0
        GeneralTree<Integer> raiz = new GeneralTree<>(1);

        // Nivel 1
        GeneralTree<Integer> n1 = new GeneralTree<>(0);
        GeneralTree<Integer> n2 = new GeneralTree<>(1);
        GeneralTree<Integer> n3 = new GeneralTree<>(1);
        raiz.addChild(n1);
        raiz.addChild(n2);
        raiz.addChild(n3);

        // Nivel 2
        GeneralTree<Integer> n4 = new GeneralTree<>(1);
        GeneralTree<Integer> n5 = new GeneralTree<>(1);
        GeneralTree<Integer> n6 = new GeneralTree<>(1);
        GeneralTree<Integer> n7 = new GeneralTree<>(0);
        GeneralTree<Integer> n8 = new GeneralTree<>(0);
        n1.addChild(n4);
        n1.addChild(n5);
        n2.addChild(n6);
        n2.addChild(n7);
        n3.addChild(n8);

        // Nivel 3
        GeneralTree<Integer> n9 = new GeneralTree<>(1);
        GeneralTree<Integer> n10 = new GeneralTree<>(1);
        GeneralTree<Integer> n11 = new GeneralTree<>(0);
        GeneralTree<Integer> n12 = new GeneralTree<>(0);
        n4.addChild(n9);
        n4.addChild(n10);
        n7.addChild(n11);
        n8.addChild(n12);

        // Nivel 4
        GeneralTree<Integer> n13 = new GeneralTree<>(1);
        GeneralTree<Integer> n14 = new GeneralTree<>(0);
        GeneralTree<Integer> n15 = new GeneralTree<>(0);
        n11.addChild(n13);
        n12.addChild(n14);
        n12.addChild(n15);

        // Ejecutar el método y mostrar resultado
        List<Integer> resultado = resolver(raiz);
        System.out.println("Camino filtrado de valor máximo: " + resultado);
    }
}

