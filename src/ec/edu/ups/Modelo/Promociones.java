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
public class Promociones {
     private int id;
     private String nombrepromocion;
     private double precio;
     private String descripcionpromocion;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombrepromocion(String nombrepromocion) {
        this.nombrepromocion = nombrepromocion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcionpromocion(String descripcionpromocion) {
        this.descripcionpromocion = descripcionpromocion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombrepromocion() {
        return nombrepromocion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcionpromocion() {
        return descripcionpromocion;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
