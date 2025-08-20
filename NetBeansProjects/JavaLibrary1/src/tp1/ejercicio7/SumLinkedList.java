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
public class SumLinkedList {
    public static int sumarLinkedList(LinkedList<Integer> lista) {
    return sumarDesdeIndice(lista, 0);
}

private static int sumarDesdeIndice(LinkedList<Integer> lista, int indice) {
    if (indice == lista.size()) {
        return 0;
    }
    return lista.get(indice) + sumarDesdeIndice(lista, indice + 1);
}
}
