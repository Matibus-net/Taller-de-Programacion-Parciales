/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPOO;

/**
 *
 * @author Usuario
 */
public class catalogo {
    private artista[] artistas;
    private int diml=0;
    
    public catalogo(){
        artistas=new artista[15];
    }
    public void agregarArtista(artista a){
        artistas[diml]=a;
        diml++;
    }
    public int artistasPorCategoria(String categoria){
        int cant=0;
        for(int i=0;i<diml;i++){
            if(artistas[i].getCategoria().equals(categoria)) cant++;
        }
        return cant;
    }
}
