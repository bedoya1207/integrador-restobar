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
public class Administrador {

private int id;
private String usuario;
private String contrase;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrase() {
        return contrase;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
