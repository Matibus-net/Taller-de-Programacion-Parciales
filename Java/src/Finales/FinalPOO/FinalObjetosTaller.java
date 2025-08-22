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
public class FinalObjetosTaller {
    public static void main(String args[]){
        catalogo c= new catalogo();
        artista a1= new artista("Mati","pintura");
        artista a2=new artista("Juan","pintura");
        c.agregarArtista(a2);
        c.agregarArtista(a1);
        System.out.println("Cantidad de artistas con la categoria pintura:  "+c.artistasPorCategoria("pintura"));
    }
}
