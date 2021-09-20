package juego;

import modelo.ActualizarDatos;


public class DarPremios {
    
    public static void SubirRango(String nombre){
        String rango = "";
        int puntajeAcum = ActualizarDatos.ConsultarJugadorInt(nombre, "puntajeAcum");
        
        if (puntajeAcum<100){
            rango="Estudiante";
        }else{
            if (puntajeAcum >= 100 && puntajeAcum <= 1000 ){
            rango="Catedratico";
            }else{
                    if (puntajeAcum > 1000 && puntajeAcum <= 2000 ){
                        rango="maestro";
                    }else{
                       if( puntajeAcum > 2000 && puntajeAcum <= 5000 ){
                           rango="Doctor";
                       }else{
                           if (puntajeAcum >5000 ){
                               rango="genio";
                           }
                       }
                    }
                }
         }
        
        ActualizarDatos.ActualizarRango(nombre, rango);
    }
    
}
