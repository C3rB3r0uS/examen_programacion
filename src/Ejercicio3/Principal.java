/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author alumno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Vista v = new Vista();
        ModeloJugador mj = new ModeloJugador("Ana",20,"3","N");
        ModeloPersonaje mp = new ModeloPersonaje("1", "LOBO", "DECIDE A QUIÉN MATAR");
        
        Controlador c = new Controlador(v, mj, mp);
        v.setVisible(true);
        
    }
    
}
