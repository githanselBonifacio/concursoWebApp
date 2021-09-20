/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AdminJugador;


public class TestConexion {
    
    public static void main(String[] args) {
        try {
            AdminJugador.RegistrarJugador("Hansel");
        } catch (SQLException ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
