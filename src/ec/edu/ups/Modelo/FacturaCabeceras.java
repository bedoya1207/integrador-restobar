/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

import java.sql.Date;

/**
 *
 * @author sebas
 */
public class FacturaCabeceras {
    private int id;
    private Date  fechaemision;
    private double subtotal;
    private double iva;
    private double total;
    private double identificacion;
    private String telefono;
    private char metodopago;

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setIdentificacion(double identificacion) {
        this.identificacion = identificacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public Date getFechaemision() {
        return fechaemision;
    }

    public double getIdentificacion() {
        return identificacion;
    }

    public char getMetodopago() {
        return metodopago;
    }

    public double getIva() {
        return iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
