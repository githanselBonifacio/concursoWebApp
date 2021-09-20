package controlador;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AdminPreguntas;
import modelo.Pregunta;

@WebServlet(name = "AgregarPregunta", urlPatterns = {"/AgregarPregunta"})
public class AgregarPregunta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //se obtienen los datos de la pregunta
        String enunciado = request.getParameter("enunciado");
        String op1 = request.getParameter("opc1");
        String op2 = request.getParameter("opc2");
        String op3 = request.getParameter("opc3");
        String op4 = request.getParameter("opc4");
        
        //Dificultad y respuesta
        String respuesta = request.getParameter("respuesta");
        String dificultad = request.getParameter("dificultad");
        
        response.setContentType("text/html;charset=UTF-8");
        
        Pregunta p = new Pregunta();
        p.setEnunciado(enunciado);
        HashMap<Integer, String> opciones = new HashMap<>();
        
        
        opciones.put(1, op1);
        opciones.put(2, op2);
        opciones.put(3, op3);
        opciones.put(4, op4);
               
        p.setOpciones(opciones);
        
        p.setRespuesta(Integer.parseInt(respuesta));
        
        AdminPreguntas.AddPregunta(Integer.parseInt(dificultad), p);
        response.sendRedirect("vistas/registrarPregunta.jsp");
    }

}
