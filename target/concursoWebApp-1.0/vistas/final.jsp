<%-- 
    Document   : final
    Created on : 20/09/2021, 01:21:08 AM
    Author     : User
--%>

<%@page import="modelo.ActualizarDatos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<%  
                //variables de control del juego
                HttpSession s = request.getSession();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos/radioEstilo.css" rel="stylesheet" type="text/css">
        <link href="estilos/estilos.css" rel="stylesheet" type="text/css">
        <title>Gracias por jugar</title>
    </head>
    <body>
        <header>
            <h1> Los consegiste, pasaste todo los niveles</h1>
        </header>
        <div class="login">

            <form class="login-container">
                
                
                <p style="font-family: sans-serif;font-size: 25px;justify-content: space-between"> 
                    Gracias por jugar lo has hecho muy bien ¡¡
                </p>
             
                <br>
                <%--<h2>Puntaje Final: <%= s.getAttribute("puntaje") %></h2>
                <br>
                <h2>Puntaje Acumulado: <% ActualizarDatos.ConsultarJugadorInt((String)(s.getAttribute("nombre")), "puntajeAcum");  %></h2>
                <br>
                <h2>Tu puntaje Maximo: <% ActualizarDatos.ConsultarJugadorInt((String)(s.getAttribute("nombre")), "puntajeMax"); %></h2>
                <br>
                <h2>Tu rango es: <%ActualizarDatos.ConsultarJugadorStr((String)(s.getAttribute("nombre")), "rango");  %></h2>--%>
            </form> 
             <input type="submit" value="Volver al Inicio" name="btn-retInic"  onClick="location='../'"> 
        </div>
    </body>
</html>
