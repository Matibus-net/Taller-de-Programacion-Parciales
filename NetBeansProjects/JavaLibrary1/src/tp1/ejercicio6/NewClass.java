/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio6;

/**
 *
 * @author Usuario
 */
public class NewClass {
  //  6. Análisis de las estructuras de listas provistas por la API de Java.  
  //a. ¿En qué casos ArrayList ofrece un mejor rendimiento que LinkedList? 
  //b. ¿Cuándo LinkedList puede ser más eficiente que ArrayList? 
  //c. ¿Qué diferencia encuentra en el uso de la memoria en ArrayList y LinkedList? 
  //d. ¿En qué casos sería preferible usar un ArrayList o un LinkedList? 
  
  //a. En resumen, ArrayList es mejor cuando se 
  //necesita acceso rápido a los elementos y 
  //cuando las modificaciones son principalmente 
  //al final de la lista.
    
  //b.Cuando el tamaño de la lista cambia constantemente
  //Cuando se usa como una cola o una pila
  //Cuando se usan muchas operaciones de eliminación
  //Inserciones y eliminaciones frecuentes en posiciones
  //intermedias o al inicio
    
  /*c.Si la 
    memoria es un factor crítico y no
    se requieren muchas inserciones o 
    eliminaciones en posiciones
    intermedias, ArrayList es la mejor opción.
    Por otro lado, si se requiere insertar o eliminar 
    elementos con frecuencia en cualquier parte de
    la lista, LinkedList puede ser más 
    conveniente a pesar del mayor uso de memoria.
    
    ArrayList es más eficiente en memoria
    porque solo almacena los datos sin 
    referencias adicionales.

    LinkedList usa más memoria debido
    a los punteros adicionales en cada nodo,
    lo que puede ser un problema si se almacenan 
    muchos elementos.

    
    d.Cuándo usar ArrayList
✅ Acceso rápido a elementos por índice (O(1))
✅ Lectura frecuente de datos sin muchas modificaciones
✅ Menor consumo de memoria por elemento
✅ Iteración rápida gracias a la localización en caché
✅ Cuando las inserciones y eliminaciones ocurren al final de la lista
    
    
    📌 Cuándo usar LinkedList
✅ Inserciones y eliminaciones frecuentes en posiciones intermedias o al inicio (O(1))
✅ Cuando se requiere implementar una estructura de datos como una cola o pila
✅ Cuando el tamaño de la lista cambia constantemente
✅ Cuando no es necesario acceder por índice con frecuencia (O(n))
    
    */
}
