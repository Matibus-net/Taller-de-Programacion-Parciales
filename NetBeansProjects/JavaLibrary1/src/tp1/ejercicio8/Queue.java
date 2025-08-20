/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio8;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {
    protected LinkedList<T> data;

    public Queue() {
        data = new LinkedList<>();
    }

    public void enqueue(T dato) {
        data.addLast(dato);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        return data.removeFirst();
    }

    public T head() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        return data.getFirst();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    @Override
    public String toString() {
        return data.toString();
    }

public class CircularQueue<T> extends Queue<T> {

    public T shift() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }
        T elemento = dequeue();     // sacamos el primero
        enqueue(elemento);          // lo agregamos al final
        return elemento;
    }
}

public class DoubleEndedQueue<T> extends Queue<T> {

    public void enqueueFirst(T dato) {
        data.addFirst(dato); // agregamos al principio de la lista
    }
}

    
    
}
