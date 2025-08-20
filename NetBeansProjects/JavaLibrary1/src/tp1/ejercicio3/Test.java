/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio3;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args){
        Estudiante[] estudiantes=new Estudiante[2];
        estudiantes[0] = new Estudiante("Juan","Buscemi","Turno 2","juanchibuscemi@gmail.com","22 entre 59 y 60");
        estudiantes[1] = new Estudiante("Mati","Buscemi","Turno2","MatiBuscemi@gmail.com","22 entre 59 y 60");
        
        Profesor[] profesores = new Profesor[3];
        profesores[0] = new Profesor("Santiago","Montesanti","SantiagoMontesanti@gamil.com","Arquitectura de computadoras","Facultad de informatica Unlp");
        profesores[1] = new Profesor("Laura","diGusti","Laura@gamil.com","CADP","Facultad de informatica Unlp");
        profesores[2] = new Profesor("GONZALO","Crack","Gonzaaa@gamil.com","Taller de Programacion","Facultad de informatica Unlp");
        
        for(int i = 0; i<2;i++){
            System.out.println(estudiantes[i].tusDatos());
            
        }
       
        for(int i = 0; i<3;i++){
            System.out.println(profesores[i].tusDatos());
            
        }
    }
}
