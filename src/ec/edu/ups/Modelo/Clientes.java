/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

/**
 *
 * @author sebas
 */
public class Clientes {
   private int id;
   private String identificacion;
    private String nombre;
    private String apellido;
    private String callePrincipal;
    private String calleSecundaria;
    private String telefono; 

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    

    
    
}
