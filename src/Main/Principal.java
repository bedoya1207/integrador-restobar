/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import ec.edu.ups.Vista.*;
import javax.swing.MenuSelectionManager;
import ec.edu.ups.Controlador.*;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author sebas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MenuPrincipal menuPrin = new MenuPrincipal();
       menuPrin.setVisible(true);
       menuPrin.setLocationRelativeTo(null);
        System.out.println("Main.Principal.main()");
       //AgregarPlatos x = new AgregarPlatos();
      // x.setVisible(true);
      // x.setLocationRelativeTo(null);
    }
}
