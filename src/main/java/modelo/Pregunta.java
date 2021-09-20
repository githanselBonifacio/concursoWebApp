
package modelo;

import java.util.HashMap;

public class Pregunta {
    private String enunciado;
    private HashMap<Integer, String> opciones;
    private int respuesta;
    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", opciones=" + opciones + ", respuesta=" + respuesta + '}';
    }
    

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public HashMap<Integer, String> getOpciones() {
        return opciones;
    }

    public void setOpciones(HashMap<Integer, String> opciones) {
        this.opciones = opciones;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
     
}
