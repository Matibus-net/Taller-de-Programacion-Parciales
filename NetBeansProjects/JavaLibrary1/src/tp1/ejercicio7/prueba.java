/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio7;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author Usuario
 */
public class prueba {
    public static void main(String[] args){
        EjecucionSucecion es = new EjecucionSucecion();
        List<Integer> L = es.calcularsucecion(6);
        for(int i=0;i<L.size();i++){
            System.out.println(L.get(i));
        }
        System.out.println("------------------------------------------------");
        InvertirNumeros In =new InvertirNumeros();
        In.Invertir(L);
        for(int i=0;i<L.size();i++){
           System.out.println(L.get(i));
        }
        System.out.println("------------------------------------------------");
        SumLinkedList l= new SumLinkedList();
        LinkedList<Integer> Lista =new LinkedList<>();
        Lista.add(3);
        Lista.add(3);
        Lista.add(3);
        Lista.add(3);
        Lista.add(3);
        Lista.add(3);
        //3*6=18
        int suma = l.sumarLinkedList(Lista);
        System.out.println("Resultado de la suma de los elementos de la lista: "+suma);
        System.out.println("------------------------------------------------");
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(8);
        l1.add(16);
        l1.add(46);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(20);
        l2.add(200);
        Combinar C=new Combinar();
        ArrayList<Integer> resultado = C.combinarOrdenado(l1, l2);
        System.out.println("Lista combinada y ordenada:");
        resultado.forEach(System.out::println);
}
}
