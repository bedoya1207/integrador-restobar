/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import  ec.edu.ups.Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author sebas
 */
public class ControladorBD {
    
    public void insertarPlato(Platos plato){
        Connection con = null;
        System.out.println("Ingreso Metodo");
        String sql = "INSERT INTO SRE_PLATOS (PLA_ID, "
                + " PLA_NOMBRE, CAT_ID, ADM_ID, "
                + " PLA_DESCRIPCION, PLA_PRECIO ) "
                + "VALUES (?,?,?,?,?,?);";
        try{
            con = ConexionBD.getConnection();
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, plato.getId());
            p.setString(2, plato.getNombre());
            p.setInt(3, 1);
            p.setInt(4, 1);
            p.setString(5, plato.getDescripcion());
            p.setDouble(6, plato.getPrecio());
            p.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ConexionBD.close(con);
        }        
    }
    
}
