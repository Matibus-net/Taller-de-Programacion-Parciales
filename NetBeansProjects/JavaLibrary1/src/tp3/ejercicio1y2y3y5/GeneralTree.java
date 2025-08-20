/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio1y2y3y5;
import java.util.LinkedList;
import java.util.List;
import tp1.ejercicio8.Queue;
/**
 *
 * @author Usuario
 */
public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	
    public void setChildren(List<GeneralTree<T>> children) {
        if (children != null)
            this.children = children;
    }
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
        
	 public List<Integer> numerosImparesMayoresQuePreOrden (Integer n){
             List<Integer> lista = new LinkedList<>();
             if(!this.isEmpty()) this.numerosImparesMayoresQuePreOrden(lista, n);
             return lista;
             
         }
        
        private void numerosImparesMayoresQuePreOrden(List<Integer> l, Integer n ){
            int dato=(Integer) this.getData();
            if(dato%2!=0&&dato>n)l.add(dato);
            List<GeneralTree<T>> childrens= this.getChildren();
            for(GeneralTree<T> child : children){
                child.numerosImparesMayoresQuePreOrden(l,n);
            }
        }
        
        public List<Integer> numerosImparesMayoresQueInOrden (Integer n){
            List<Integer> list =new LinkedList<Integer>();
            if(!this.isEmpty()) this.numerosImparesMayoresQuePreOrden(list, n);
            return list;
        }
        
        private void numerosImparesMayoresQueInOrden(List<Integer> l,int n){
            List<GeneralTree<T>> childrens = this.getChildren();
            if(this.hasChildren()){
               childrens.get(0).numerosImparesMayoresQueInOrden(l,n);
            }
            int dato = (Integer)this.getData();
            if(dato%2!=0&&dato>n) l.add(dato);
            for(int i=1;i<childrens.size();i++){
                childrens.get(i).numerosImparesMayoresQueInOrden(l,n);
            }               
        }
        public List<Integer> numerosImparesMayoresQuePostOrden(Integer n){
            List <Integer> l = new LinkedList<Integer>();
            if(!this.isEmpty()) this.numerosImparesMayoresQuePostOrden(l, n);
            return l;
         }
        private void numerosImparesMayoresQuePostOrden(List<Integer> l, int n){
            List<GeneralTree<T>> childrens= this.getChildren();
            for(GeneralTree<T> child : children){
                child.numerosImparesMayoresQuePreOrden(l,n);
            }
            int dato=(Integer) this.getData();
            if(dato%2!=0&&dato>n)l.add(dato);
            
        }
        
        public List<Integer> numerosImparesMayoresQuePorNiveles(Integer n){
            List<Integer> result=new LinkedList<Integer>();
            GeneralTree aux;
            Queue<GeneralTree<T>> queue=new Queue<GeneralTree<T>>();
            queue.enqueue(this);
            while(!queue.isEmpty()){
                aux=queue.dequeue();
                if(!aux.isEmpty()){
                    int dato =(Integer)this.getData();
                    if(dato%2!=0&&dato>n)result.add(dato);
                }
                List<GeneralTree<T>> children = aux.getChildren();
                for(GeneralTree<T> child: children) {
                    queue.enqueue(child);
                }
            }
            return result;
        }
	public int altura() {	 
            return (!this.isEmpty()? alturaAyuda():-1);
	}
	
        private int alturaAyuda(){
            if(this.isLeaf()) return 1;
            else{
                int alturaMax=-1;
                List<GeneralTree<T>> children = this.getChildren();
                for(GeneralTree<T> child: children) {
                    alturaMax = Math.max(alturaMax, child.alturaAyuda());
                }
                return alturaMax + 1;
            }
        } 
        
	public int nivel(T dato){
		return (!this.isEmpty())? nivelAyuda(dato):-1;
	}
        private int nivelAyuda(T dato){
            int cont=0;
            int act;
            GeneralTree<T> aux;
            Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
            cola.enqueue(this);
            while(!cola.isEmpty()){
                act = cola.size();
                for(int i = 0; i < act; ++i){
                    aux = cola.dequeue();
                    if(aux.getData().equals(dato)){
                        return cont;
                    }
                    else{
                        for(GeneralTree<T> child : aux.getChildren()){
                            cola.enqueue(child);
                        }
                    }
                }
                cont++;
            }
            return -1;
        }

	public int ancho(){
           if(this.isEmpty()) return 0;
           else return (!this.isLeaf()) ? anchoHelper() : 1;
	}
        
        private int anchoHelper(){
            int max=0;
            int cont=0;
            GeneralTree<T> aux=null;
            Queue<GeneralTree<T>> cola= new Queue<GeneralTree<T>>();
            cola.enqueue(this);
            cola.enqueue(null);
            while(!cola.isEmpty())
                aux = cola.dequeue();
                if(aux != null) {
                    List<GeneralTree<T>> children = aux.getChildren();
                    for(GeneralTree<T> child: children) {
                        cola.enqueue(child);
                        cont++;
                    }
                } else {
                    max = Math.max(max, cont);
                    cont = 0;
                    cola.enqueue(null);
                  }
        return max;
    }
        
    public boolean esAncestro(T a, T b){
        if(this.isLeaf()) return false;
        else return this.esAncestroBusqueda(a, b);
    }
        
   private boolean esAncestroBusqueda(T a, T b) {
        boolean res = false;
        GeneralTree<T> nodoRaiz = null; //Guarda el arbol con raiz A  
        GeneralTree<T> ab;
        Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
        cola.enqueue(this);
        while(!cola.isEmpty() && (!res)) {
            ab = cola.dequeue();
            if(ab.getData().equals(b) && (!res)) return false; //Encontre B antes que A
            if(ab.getData().equals(a)) {//encontre A
                res = true; //Lo encontre
                nodoRaiz = ab; // Asigno el arbol de raiz A a nodo raiz
            }
            if(!res) { // si no se encontro A
                List<GeneralTree<T>> children = ab.getChildren(); // guardo HIJOS
                for(GeneralTree<T> child: children) { //Recorro hijos
                        cola.enqueue(child); //Encolo cada hijo 
                    }
                }
        }
        return res ? esAncestroHelper(nodoRaiz, b): false; // si encontre A llamo a recorrer por niveles el nodoRaiz
    }
    
    private boolean esAncestroHelper(GeneralTree<T> ab, T b) {
        GeneralTree<T> aux; // creo un aux
        Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();// creo la cola 
        queue.enqueue(ab); //en colo el nodo raiz
        while(!queue.isEmpty()) {
            aux = queue.dequeue();
            if(aux.getData().equals(b)) {
                return true; // si encuentro B retorno true
            } else {
                List<GeneralTree<T>> children = aux.getChildren(); // lista de hijos
                for (GeneralTree<T> child: children) { // recorro 
                    queue.enqueue(child); //encolo 
                }
            }
        }
        return false;// si llegue aca sin encontrar B retorno falso
    }
            
}
