/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicioz11;
import tp3.ejercicio1y2y3y5.GeneralTree;
import tp1.ejercicio8.Queue;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class ParcialArboles {
    public static boolean resolver(GeneralTree<Integer> arbol){
        if(arbol.isEmpty())return true; // si es vacio devuelve True
        
        Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>(); //creo cola
        int nodos=1; //el nivel actual es 1 porq es raiz
        cola.enqueue(arbol);// encolo ese nodo
        
        while(!cola.isEmpty()){
            int nodosActuales = 0;// nodos del nivel 1
            int nodosDelLvL= cola.size(); //saco tamaño de la cola para agarrar cant nodos del nivel
            for(int i =0; i<nodosDelLvL;i++){// se repite tantas veces como nodos en el nivel para contar todo 
                GeneralTree<Integer> aux=cola.dequeue(); // desencolo el nodo padre del nivel EJ si es la raiz es porq trabajo con lvl 1 
                List<GeneralTree<Integer>> hijos=aux.getChildren(); // saco los hijos de ese nodo
                for(GeneralTree<Integer> h: hijos){ // los cuento y los agrego
                    cola.enqueue(h);
                    nodosActuales++;
                }
            }
            if(!cola.isEmpty()&&nodos+1!=nodosActuales)return false; //si se rompe la condicion salgo
            nodos=nodosActuales; //actualizo nodos
        }
        return true;
    }
    
    public static void main(String[] args){
        List<GeneralTree<Integer>> hijos3 = new LinkedList<GeneralTree<Integer>>();
        hijos3.add(new GeneralTree<Integer>(33));
        hijos3.add(new GeneralTree<Integer>(12));
        hijos3.add(new GeneralTree<Integer>(17));
        hijos3.add(new GeneralTree<Integer>(9));
        GeneralTree<Integer> arbol3 = new GeneralTree<Integer>(3,hijos3);
        
        List<GeneralTree<Integer>> arbol83 = new LinkedList<GeneralTree<Integer>>();
        arbol83.add(new GeneralTree<Integer>(83));
        GeneralTree<Integer> arbol18 = new GeneralTree<Integer>(18,arbol83);
        
        List<GeneralTree<Integer>> hijos4 = new LinkedList<GeneralTree<Integer>>();
        hijos4.add(new GeneralTree<Integer>(7));
        hijos4.add(new GeneralTree<Integer>(11));
        hijos4.add(arbol3);
        GeneralTree<Integer> arbol4 = new GeneralTree<Integer>(4,hijos4);
        
        List<GeneralTree<Integer>> hijos5 = new LinkedList<GeneralTree<Integer>>();
        hijos5.add(arbol18);
        GeneralTree<Integer> arbol5= new GeneralTree<Integer>(5,hijos5);
        
        List<GeneralTree<Integer>> hijos1= new LinkedList<GeneralTree<Integer>>();
        hijos1.add(arbol5);
        hijos1.add(arbol4);
        GeneralTree<Integer> arbol1 = new GeneralTree<Integer>(1,hijos1);
        
        List<GeneralTree<Integer>> hijos25=new LinkedList<GeneralTree<Integer>>();
        hijos25.add(new GeneralTree(13));
        GeneralTree<Integer> arbol25= new GeneralTree<Integer>(25,hijos25);
        
        List<GeneralTree<Integer>> hijos2= new LinkedList<GeneralTree<Integer>>();
        hijos2.add(arbol1);
        hijos2.add(arbol25);
        GeneralTree<Integer> arbolCreciente= new GeneralTree<Integer>(2,hijos2);
        
        System.out.println("EL arbol1 es creciente?: "+resolver(arbolCreciente));
        List<GeneralTree<Integer>> hijos6 = new LinkedList<>();
    hijos6.add(new GeneralTree<>(40));
    hijos6.add(new GeneralTree<>(41));
    GeneralTree<Integer> nodo6 = new GeneralTree<>(6, hijos6); // Este tiene 2 hijos

    // Nivel 2
    GeneralTree<Integer> nodo4 = new GeneralTree<>(4);
    GeneralTree<Integer> nodo5 = new GeneralTree<>(5);
    GeneralTree<Integer> nodo3 = new GeneralTree<>(3);

    // Acá sumamos 4 nodos en el nivel 2, lo cual rompe el patrón creciente
    List<GeneralTree<Integer>> hijos12 = new LinkedList<>();
    hijos12.add(nodo3);
    hijos12.add(nodo4);
    hijos12.add(nodo5);
    hijos12.add(nodo6);  // 4 nodos en nivel 2

    GeneralTree<Integer> nodo2 = new GeneralTree<>(2, hijos2);

    // Nivel 1
    List<GeneralTree<Integer>> hijosRaiz = new LinkedList<>();
    hijosRaiz.add(nodo2);
    hijosRaiz.add(new GeneralTree<>(9)); // 2 nodos en nivel 1

    // Nivel 0
    GeneralTree<Integer> raiz = new GeneralTree<>(1, hijosRaiz);
    System.out.println("EL arbol1 es creciente?: "+resolver(raiz));
    
    }
}
