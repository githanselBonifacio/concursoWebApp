
package Test;

import java.util.HashMap;
import modelo.AdminPreguntas;
import modelo.Pregunta;

public class TestAgregarpregunta {
    public static void main(String[] args) {
    
        Pregunta p = new Pregunta();
        p.setEnunciado("¿Esta es mi primera pregunta?");
        HashMap<Integer, String> opciones = new HashMap<>();
        opciones.put(1, "si, esta es mi primera");
        opciones.put(2, "lo he hecho un monton de veces");
        opciones.put(3, "en mas de una ocacion");
        opciones.put(4, "solo una");
        System.out.println(opciones.values());
        p.setOpciones(opciones);
        AdminPreguntas.AddPregunta(2, p);
    
    }
}
