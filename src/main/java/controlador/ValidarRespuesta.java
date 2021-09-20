/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import juego.FinJuego;
import modelo.Pregunta;

/**
 *
 * @author User
 */
@WebServlet(name = "ValidarRespuesta", urlPatterns = {"/ValidarRespuesta"})
public class ValidarRespuesta extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =response.getWriter();
        String respuesta = request.getParameter("respuestaUsuario");
        HttpSession s = request.getSession();
        Pregunta p = (Pregunta) s.getAttribute("pregunta");
        if(p.getRespuesta()==Integer.parseInt(respuesta)){
            int nivel = (int) s.getAttribute("nivel");
            int siguienteNivel = nivel +1;
            s.setAttribute("nivel", siguienteNivel);
            switch(nivel){
                case 1: //100 puntos
                    s.setAttribute("puntaje", (int)(s.getAttribute("puntaje"))+100);
                    response.sendRedirect("vistas/RespuestaCorrecta.jsp");
                    break;
                case 2: //250 puntos
                    s.setAttribute("puntaje", (int)(s.getAttribute("puntaje"))+250);
                    response.sendRedirect("vistas/RespuestaCorrecta.jsp");
                    break;
                    
                case 3: //500 puntos
                    s.setAttribute("puntaje", (int)(s.getAttribute("puntaje"))+500);
                    response.sendRedirect("vistas/RespuestaCorrecta.jsp");
                    break;
                case 4: //1000 puntos
                    s.setAttribute("puntaje", (int)(s.getAttribute("puntaje"))+1000);
                    response.sendRedirect("vistas/RespuestaCorrecta.jsp");
                    break;
                case 5: //1500 puntos
                    s.setAttribute("puntaje", (int)(s.getAttribute("puntaje"))+1500);
                    response.sendRedirect("vistas/final.jsp");
                    FinJuego.FinalizarJuego((String) s.getAttribute("nombre"),(int)(s.getAttribute("puntaje")));
                    break;
            }
        }else{
            response.sendRedirect("vistas/finJuego.jsp");
            FinJuego.FinalizarJuego((String) s.getAttribute("nombre"),(int)(s.getAttribute("puntaje")));
        }
        
        
    }
}
