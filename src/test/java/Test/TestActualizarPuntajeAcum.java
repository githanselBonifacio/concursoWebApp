
package Test;

import modelo.ActualizarDatos;


public class TestActualizarPuntajeAcum {
    
    public static void main(String[] args) {
        String nombre ="Hansel";
        int puntaje = 800;
        ActualizarDatos.ConsultarJugadorInt(nombre,"puntajeAcum");
        //ActualizarDatos.ActualizarPuntaje(nombre,puntaje);
    }
}
