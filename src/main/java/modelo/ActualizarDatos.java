package modelo;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActualizarDatos {
    
    public  static Integer ConsultarJugadorInt(String nombre, String nombreColumna){
    
     try {
              Connection con = new ConexionBD().GetConexion();
              Statement stmt = con.createStatement();
              String sql = "SELECT "+nombreColumna+" FROM  `jugadores`  WHERE nombre="+nombre;
              ResultSet resul = stmt.executeQuery(sql);
              String puntajeAcum = "";
              while(resul.next()){
                 
                  puntajeAcum = resul.getString("puntajeAcum");
                }
              con.close();
              return Integer.parseInt(puntajeAcum);
          } catch (SQLException ex) {
              Logger.getLogger(AdminPreguntas.class.getName()).log(Level.SEVERE, null, ex);
              return null;
          }
        
    }
    
    public  static String ConsultarJugadorStr(String nombre, String nombreColumna){
    
     try {
              Connection con = new ConexionBD().GetConexion();
              Statement stmt = con.createStatement();
              String sql = "SELECT "+nombreColumna+" FROM  `jugadores`  WHERE nombre="+nombre;
              ResultSet resul = stmt.executeQuery(sql);
              String rango = "";
              while(resul.next()){
                 
                  rango = resul.getString("puntajeAcum");
                }
              con.close();
              return rango;
          } catch (SQLException ex) {
              Logger.getLogger(AdminPreguntas.class.getName()).log(Level.SEVERE, null, ex);
              return "";
          }
        
    }
    
    public static void ActualizarPuntaje(String nombre, int puntajeActual){
    
        try(Connection con = new ConexionBD().GetConexion()) {
            
            Statement stmt = con.createStatement();
            int puntajeAcum = ConsultarJugadorInt(nombre,"puntajeAcum");
            int nuevoPuntaje = puntajeActual + puntajeAcum;
            String sql="UPDATE jugadores SET puntajeAcum="+nuevoPuntaje+" WHERE nombre='"+nombre+"'";
            stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void ActualizarPuntMax(String nombre, int puntaje){
    
        try(Connection con = new ConexionBD().GetConexion()) {
            
            Statement stmt = con.createStatement();
            int puntajeMax = ConsultarJugadorInt(nombre, "puntajeMax");
            
            if (puntaje >puntajeMax){
                String sql="UPDATE jugadores SET puntajeMax="+puntajeMax+" WHERE nombre='"+nombre+"'";
                stmt.executeUpdate(sql);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ActualizarRango(String nombre, String nuevoRango){
    
        try(Connection con = new ConexionBD().GetConexion()) {
            
            Statement stmt = con.createStatement();
            String sql="UPDATE jugadores SET rango="+nuevoRango+" WHERE nombre='"+nombre+"'";
            stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
