
package modelo;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminJugador {
 
   
    public static void RegistrarJugador(String nombre) throws SQLException{
       
       try(Connection con = new ConexionBD().GetConexion()) {
            
            Statement stmt = con.createStatement();
            String sqlCreateBD =  "CREATE DATABASE IF NOT EXISTS juego_preguntas";
            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS jugadores(" +
                                   "id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY," +
                                   "nombre VARCHAR(15) NOT NULL,"+
                                   "puntajeMax Integer," +
                                   "puntajeAcum Integer,"+
                                   "rango VARCHAR(15) DEFAULT,"+
                                   "medalla Integer DEFAULT"+
                                   ")";
            String sqlInsert =  "INSERT INTO jugadores (nombre) VALUES ('"+nombre+"')";
                
            stmt.execute(sqlCreateBD);
            stmt.execute(sqlCreateTable);
            stmt.executeUpdate(sqlInsert);
            
            con.close();
       }catch(SQLException e){
           System.out.println(e.toString());
           System.out.println("Transaccion rechasada: " + e);
       }
    }
    
    public boolean ConsultarJugador(String nombre){
        Connection con;
        try {
            con = new ConexionBD().GetConexion();
            Statement stmt = con.createStatement();
            String sql = "SELECT nombre FROM jugadores WHERE nombre='"+nombre+"'";
            ResultSet resul = stmt.executeQuery(sql);
            
            while(resul.next()){
                if (resul.getString("nombre").equals(nombre)){
                    
                    return true;
                 }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminJugador.class.getName()).log(Level.SEVERE, null, ex);
            //return false;
        }
        return false;
    }
   
}
