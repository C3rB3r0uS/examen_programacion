/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */



public class Test {
    
    public static void main(String[] args) {
        
        // Ejercicio 1 - A
        
        Jugador Ana = new Jugador ("Ana", 20, false);
        Jugador Sandra = new Jugador ("Sandra", 20, false);
        Jugador MariCruz = new Jugador ("Maricruz", 18, true);
        
        HashMap <String, Jugador> h = new HashMap<>(); 
        
        h.put("vidente", Ana);
        h.put("nina", Sandra);
        h.put("lobo", MariCruz);
 
        String respuesta = JOptionPane.showInputDialog("Introduzca el tipo de jugador: ");
        respuesta = respuesta.toLowerCase();
        
        System.out.println("Datos del jugador: " + h.get(respuesta));
        
//         Ejercicio 1 - B
        
        Set <Jugador> s = new HashSet <>();

        s.add(Ana);
        s.add(Ana);
        s.add(Sandra);
        
        System.out.println(s);
  
    }
    
}
