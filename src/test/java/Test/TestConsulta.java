/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import modelo.AdminJugador;

public class TestConsulta {
    public static void main(String[] args){
       
        Boolean consulta = new AdminJugador().ConsultarJugador("luis");
        System.out.println(consulta);
    }
    
}
