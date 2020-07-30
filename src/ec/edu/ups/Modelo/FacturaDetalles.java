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
public class FacturaDetalles {
   private int id;
   private int cantidad;
   private double subtotal;
   private double iva;
   
   public void setid(int id){
   this.id=id;
   }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    
    
   
}
