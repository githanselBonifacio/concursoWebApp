<%-- 
    Document   : index
    Created on : 17/09/2021, 09:42:41 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¿Quien sabe m&aacute;s?</title>
        <link href="vistas/estilos/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
            <h1>
                ¡ Juega y demuestra que eres el mejor !
            </h1>
        </header>
        <div style="text-align: center" >
            <img src = "vistas/img/adn.gif" width="180" height="180"/>
        </div>
        <div class="login">
            <div class="login-triangle"></div>
  
            <h2 class="login-header">¿Cual es tu nombre?</h2>

            <form class="login-container" method= "get" action ="AdminJuego">
                
                <p><input type="text" placeholder="Nombre" name="nombre" required="required"></p>
                <p><input type="submit" value="Jugar" name="btn-logn"></p>
                
            </form>
        </div>
        <footer>
            <p>
                En la Ciencia la única verdad sagrada, es que no hay verdades sagradas. (Carl Sagan)
            </p>
        </footer>
    </body>
</html>
