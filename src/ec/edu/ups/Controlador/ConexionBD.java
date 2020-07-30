/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sebas
 */
public class ConexionBD {
    public static Connection getConnection() {
        try {	
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","BDRestoBar", "integrador123");  
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }
 
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}