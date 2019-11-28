/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdeobjetojava.pkg3009;

/**
 *
 * @author Alumno_Invitado
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int clave;

    public Persona(String nombre, String apellido, int clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
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

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido 
                + ", clave=" + clave + '}';
    }

    
}
