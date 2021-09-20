

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
                int scored=0;
                int nivel=1;
                HttpSession s = request.getSession();
                s.setAttribute("puntaje", scored);
                s.setAttribute("nivel", nivel);
                
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registra tus preguntas¡¡</title>
        <link href="estilos/estilos.css" rel="stylesheet" type="text/css">

    </head>
    <body>
        <header>
            <h1>Puedes agregar tus propias preguntas ¡></h1>
        </header>
        <div class="login">


            <form class="login-container" method= "get" action ="../AgregarPregunta">
                <h1 class="login-header">Registra tu pregunta</h1>
                <br>
                <table class="tablas">

                    <tr>
                    <textarea  name="enunciado" rows="3" cols="49"></textarea>
                    <th>
                        <input type="text" name="opc1" placeholder="Opción 1" required="required" />
                        <br>
                        <input type="text" name="opc3" placeholder="Opción 3" required="required" />

                    </th>  
                    <th > 
                        <input type="text" name="opc2" placeholder="Opción 2" required="required" />
                        <br>
                        <input type="text" name="opc4" placeholder="Opción 4" required="required" />

                    </th>

                    </tr>

                </table>
                <br>
                <div>
                    <h1 class="login-header">Respuesta</h1>
                    
                    <div class="login-container" style="text-align: center">
                     
                        <div style="display: inline-block"> 
                            <label for ="opcion 1"> Opcion 1</label>
                            <input class='circle' type="radio" value="1" name="respuesta" checked="">
                        </div>

                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="opcion 2">Opcion 2</label>
                            <input class='circle' type="radio" value="2" name="respuesta">
                        </div>

                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="opcion 3">Opcion 3</label>
                            <input class='circle' type="radio" value="3" name="respuesta">
                        </div>

                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="opcion 4">Opcion 4</label>
                            <input class='circle' type="radio" value="4" name="respuesta"> 
                        </div>  
                    </div>
                    
                </div>
                
                <div>
                    <h1 class="login-header">Dificultad</h1>
                    
                    <div class="login-container" style="text-align: center">
                        <div style="display: inline-block"> 
                            <label for ="1">nivel 1</label>
                            <input class='circle' type="radio" value="1" name="dificultad" checked="">
                        </div>
                        
                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="2">nivel 2</label>
                            <input class='circle' type="radio" value="2" name="dificultad">
                        </div>
                    
                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="3">nivel3</label>
                            <input class='circle' type="radio" value="3" name="dificultad">
                        </div>
                        
                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="4">nivel 4</label>
                            <input class='circle' type="radio" value="4" name="dificultad"> 
                        </div> 
                        <div style="display: inline-grid; padding-left: 12px">
                            <label for ="5">nivel 5</label>
                            <input class='circle' type="radio" value="4" name="dificultad"> 
                        </div> 
                    </div>
                    
                </div>
             
                <input type="submit" value="Enviar" name="btn-regPreg" > 

            </form>
            <br>
            <input class="login-container" type="submit" value="Iniciar Juego" name="btn-initJueg" onClick="location='juego.jsp'"  > 
        </div>
        <footer >
            <p>
                    Verifica que las respuestas sean las correctas;
             </p>
        </footer>

    </body>
</html>
