
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBD {
    
    public Connection GetConexion() throws SQLException{
        try{
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/juego_preguntas","root", "");
            return conexion;
        }catch(SQLException e){
            System.out.println(e.toString());
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
            return conexion;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
            return conexion;
        } 
    }
}
