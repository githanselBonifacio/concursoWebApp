
package modelo;

import java.util.ArrayList;

public class Jugador {
    private int id;
    private String nombre;
    private int puntajeMax;
    private int puntajeAcum;
    private String rango;

    public Jugador(String nombre) {
        this.nombre = nombre;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeMax() {
        return puntajeMax;
    }

    public void setPuntajeMax(int puntajeMax) {
        this.puntajeMax = puntajeMax;
    }

    public int getPuntajeAcum() {
        return puntajeAcum;
    }

    public void setPuntajeAcum(int puntajeAcum) {
        this.puntajeAcum = puntajeAcum;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public ArrayList<Integer> getMedallas() {
        return medallas;
    }

    public void setMedallas(ArrayList<Integer> medallas) {
        this.medallas = medallas;
    }
    private ArrayList <Integer> medallas;
}
