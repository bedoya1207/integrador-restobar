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
public class Comentarios {
 private int id;
 private int calificacion;
 private String descripcion;

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
 
}
