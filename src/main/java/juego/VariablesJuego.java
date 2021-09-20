package juego;

import modelo.Pregunta;


public class VariablesJuego {
    
    public Boolean ValidarRespuesta(Pregunta p, int respUsuario){
        if (p.getRespuesta()==respUsuario){
            return true;
        }else{
            return false;
        }
    }
}
