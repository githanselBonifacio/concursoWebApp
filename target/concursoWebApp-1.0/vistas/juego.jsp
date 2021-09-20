

<%@page import="modelo.Pregunta"%>
<%@page import="modelo.AdminPreguntas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%  
                //variables de control del juego
                HttpSession s = request.getSession();
                Pregunta p = AdminPreguntas.ExtraerPreguntaNivel((int)(s.getAttribute("nivel")));
                s.setAttribute("pregunta", p);
                 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos/radioEstilo.css" rel="stylesheet" type="text/css">
        <link href="estilos/estilos.css" rel="stylesheet" type="text/css">
        <title>Respondeme</title>
    </head>
    <body>
        <header>
            <h1>Concentrate y contesta</h1>
        </header>
        <div class="login">
            <h3 style="color: whitesmoke;font-family: monospace">Nivel: <%= s.getAttribute("nivel") %></h3>
            <h3 style="color: whitesmoke;font-family: monospace">Puntaje: <%= s.getAttribute("puntaje") %></h3>
            <form class="login-container" method="get" action ="../ValidarRespuesta">
                
                
                <p style="font-family: sans-serif;font-size: 25px;justify-content: space-between"><%= p.getEnunciado()%></p>
                <label class="radio"><%= p.getOpciones().get(1)%>
                    <input type="radio" checked="checked" name="respuestaUsuario" value="1">
                    <span class="check"></span>
                </label>
                <label class="radio"><%= p.getOpciones().get(2)%>
                    <input type="radio" name="respuestaUsuario" value="2">
                    <span class="check"></span>
                </label>
                <label class="radio"><%= p.getOpciones().get(3)%>
                    <input type="radio" name="respuestaUsuario" value="3">
                    <span class="check"></span>
                </label>
                <label class="radio"><%= p.getOpciones().get(4)%>
                    <input type="radio" name="respuestaUsuario" value="4">
                    <span class="check"></span>
                </label>
                <input type="submit" value="Contestar" name="btn-cont"  action="../ValidarRespuesta"> 
            </form> 
            
        </div>

        <footer >
            <p>
                    Verifica que las respuestas sean las correctas;
             </p>
        </footer>
    </body>
</html>
