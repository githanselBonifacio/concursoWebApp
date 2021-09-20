package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.AdminJugador;

@WebServlet(name = "AdminJuego", urlPatterns = {"/AdminJuego"})
public class AdminJuego extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
         
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                
                String nombre = request.getParameter("nombre");
                HttpSession s = request.getSession();
                s.setAttribute("nombre", nombre);
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out =response.getWriter();
                if (!"".equals(nombre) && new AdminJugador().ConsultarJugador(nombre)==false){
                    try {
                        
                        AdminJugador.RegistrarJugador(nombre);
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminJuego.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                }
                    
                response.sendRedirect("vistas/registrarPregunta.jsp");
        }
    
    
    
}
