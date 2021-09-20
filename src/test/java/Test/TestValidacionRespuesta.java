
package Test;

import juego.VariablesJuego;
import modelo.AdminPreguntas;
import modelo.Pregunta;

public class TestValidacionRespuesta {
    
    public static void main(String[] args) {
        
        Pregunta p = AdminPreguntas.ExtraerPreguntaNivel(1);
        System.out.println(p);
        System.out.println(new VariablesJuego().ValidarRespuesta(p, 3));
        
    }
}
