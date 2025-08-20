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
public class Estudiante {
    private String nombre;
    private String apellido;
    private String Comision;
    private String email;
    private String direccion;

    public  Estudiante(String nombre,String apellido,String comision,String email,String direccion){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setComision(comision);
        this.setEmail(email);
        this.setDireccion(direccion);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
        public String tusDatos(){
        String st="Nombre: "+this.getNombre()+" | Apellido: "+this.getApellido()+" | Email: "+this.getEmail()+" | Comision: "+this.getComision()+" | Direccion: "+this.getDireccion();
        return st;
    }
      
}
