/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio7;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class PuntoD {
    public static void agregarSiNoExiste(ArrayList<Estudiantes> lista, Estudiantes nuevo) {
    if (!lista.contains(nuevo)) {
        lista.add(nuevo);
        System.out.println("Estudiante agregado: " + nuevo);
    } else {
        System.out.println("El estudiante ya está en la lista: " + nuevo);
    }
}
    public static void main(String[] args){
        ArrayList<Estudiantes> lista1=new ArrayList<>();
        Estudiantes estudiante1= new Estudiantes("matias","buscemi","46990222","26170/8");
        Estudiantes estudiante2= new Estudiantes("juan","buscemi","50990222","1834/8");
        Estudiantes estudiante3= new Estudiantes("sergio","buscemi","20440804","4456/8");
        lista1.add(estudiante1);
        lista1.add(estudiante2);
        lista1.add(estudiante3);
        ArrayList<Estudiantes> lista2=new ArrayList<>(lista1);
        System.out.println("Imprimiendo contenido de las listas: ");
        System.out.println("Lista original: ");
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista1.get(i).toString());
        }
        System.out.println("Lista copia: ");
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista2.get(i).toString());
        }
        lista1.get(1).setNombre("Fabian");
        lista1.get(0).setApellido("Bus");
        
        System.out.println("Imprimiendo contenido modificado de las listas: ");
        System.out.println("Lista original: ");
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista1.get(i).toString());
        }
        System.out.println("Lista copia: ");
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista2.get(i).toString());
        }
        
        Estudiantes nuevo= new Estudiantes("mate","ron","4698222","260/8");
        
        if (!lista1.contains(nuevo)) {
            lista1.add(nuevo);
            System.out.println("Estudiante agregado: " + nuevo);
        }   
        else {
            System.out.println("El estudiante ya está en la lista: " + nuevo);
        }
        Estudiantes otro= new Estudiantes("matias","buscemi","46990222","26170/8");
        if (!lista1.contains(otro)) {
            lista1.add(otro);
            System.out.println("Estudiante agregado: " + otro);
        }   
        else {
            System.out.println("El estudiante ya está en la lista: " + otro);
        }
        System.out.println("Lista original: ");
        for(int i=0;i<lista1.size();i++){
            System.out.println(lista1.get(i).toString());
        }
    }
    // la conclusion final es que ambas listas comparten las referencias;
        
        
    }
    
