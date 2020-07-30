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
public class Platos {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private CategoriasPlatos categoria;
    private Administrador admi;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCategoria(CategoriasPlatos categoria) {
        this.categoria = categoria;
    }

    public CategoriasPlatos getCategoria() {
        return categoria;
    }

    public void setAdmi(Administrador admi) {
        this.admi = admi;
    }

    public Administrador getAdmi() {
        return admi;
    }
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
