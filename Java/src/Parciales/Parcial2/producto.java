/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales;

/**
 *
 * @author Usuario
 */
public class producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int cantUnidades;
    private double precioUnidad;

    public producto(int codigo, String nombre, String marca, int cantUnidades, double precioUnidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.cantUnidades = cantUnidades;
        this.precioUnidad = precioUnidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(int cantUnidades) {
        this.cantUnidades = cantUnidades;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    @Override
    public String toString(){
        return "Codigo de producto: "+this.getCodigo()+" Nombre: "+this.getNombre()+" Marca: "+this.getMarca()+" cantidad de unidades: "+this.getCantUnidades()+" Precio Unitario: "+this.getPrecioUnidad();
    }
    
}
