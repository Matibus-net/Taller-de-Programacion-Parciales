/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalOctubre20204;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class Final2024 {
    public static void main(String args[]){
        hospital H = new hospital("Hospital de los niños","13 y 44");
        persona p1 = new persona(46990222,"Matias","Ioma");
        persona p2 = new persona(32432423,"juan","medicus");
        persona p3 = new persona(3217585,"paco","---");
        persona p4 = new persona(2311213,"perez","---");
        persona p5 = new persona(20440804,"Matias","Ioma");
        H.ingresarPaciente(p1, 1, 1);
        H.ingresarPaciente(p2, 1, 2);
        H.ingresarPaciente(p3, 1, 3);
        H.ingresarPaciente(p4, 1, 4);
        H.ingresarPaciente(p5, 1, 5);
        H.ingresarPaciente(p5, 1, 5);
        H.actualizarDias();
        System.out.println("Cantidad de pisos llenos: "+H.pisosLlens());
        
        System.out.println("Insertar dni de la persona a darle el alta: ");
        int dni= Lector.leerInt();
        H.liberarCama(dni);
    }
}
