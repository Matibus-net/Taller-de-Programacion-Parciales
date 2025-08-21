/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalObjetos12deMarzo2024;

/**
 *
 * @author Usuario
 */
public class sector {
    private String nombre;
    private empleado jefe;
    private empleado[] empleados;
    private producto[] productos;
    private int cantEmpleados=0;
    private int cantProductos=0;

    public sector(String nombre, int N) {
        this.nombre = nombre;
        this.empleados = new empleado[50];
        this.productos = new producto[N];
    }

    public void setJefe(empleado jefe) {
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public empleado getJefe() {
        return jefe;
    }

    public int getCantProductos() {
        return cantProductos;
    }
    
    
    
    public void agregarEmpleado(empleado e, boolean esJefe){
        if(esJefe){
            this.setJefe(e);
        }else {
            this.empleados[cantEmpleados]=e;
            this.cantEmpleados++;
        }
    }
    public void agregarProducto(producto unProducto){
        this.productos[cantProductos]=unProducto;
        this.cantProductos++;
    }
    public double costoTotal( int etapa){
        double costo=0.0;
        for(int i=0;i<cantProductos;i++){
            if(productos[i].getEtapa()==etapa) costo+= productos[i].getCosto();
        }
        return costo;
    }
    public void cambiarEtapa(int codProducto, double unCosto){
        boolean ok=true;
        int i=0;
        while((ok)&&(i<this.cantProductos)){
            if(productos[i].getCodigo()==codProducto){
                ok=!productos[i].actualizar(unCosto);
            }
            i++; 
        }
        if(ok) System.out.println("No se puede aumentar la etapa del producto ya q este ya esta en la etapa 5/5");
        else System.out.println("Etapa aumentada con exito");
    }
    
    @Override
    public String toString(){
        String st="Nombre del Sector: "+this.getNombre()+"\n";
        st+="Informacion del jefe: \n";
        st+=this.getJefe().toString() +"\n";
        st+="Cantidad total de productos en los q se esta trabajando: "+this.getCantProductos()+"\n";
        st+="Costo total de los productos finalizados: "+this.costoTotal(5)+"\n";
        st+="Empleados con antiguedad mayor a 10 años: \n";
        for(int i=0;i<cantEmpleados;i++){
            if(empleados[i].getAntiguedadEnAños()>10){
                st+=empleados[i].toString()+"\n";
            }
        }
        return st;
    }
}
