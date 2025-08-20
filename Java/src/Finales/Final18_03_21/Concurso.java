/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finales;

/**
 *
 * @author Usuario
 */
public class Concurso {
    private pareja[] parejas;
    private int diml=0;

    public Concurso(int n) {
        parejas=new pareja[n];
    }
    
    public void añadirPareja(pareja p){
            parejas[diml]=p;
            diml++;
    }
    
    public pareja mayorDiffEdad(){
        int max=0;
        pareja p=null;
        for(int i=0;i<diml;i++){
            if(max<parejas[i].diffEdad()){
                max=parejas[i].diffEdad();
                p=parejas[i];
            }
        }
        return p;
    }
    
}
