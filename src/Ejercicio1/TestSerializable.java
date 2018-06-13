/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class TestSerializable {
    
    // http://www.chuidiang.org/java/ficheros/ObjetosFichero.php
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
         // Ejercicio 2 - A
        
        // Serialización
        
        // modificador Transient en atributo => no persistente
        
        Jugador Random = new Jugador ("Random", 31, true);
        
        //Escritura del fichero
        
        try{
            
            FileOutputStream fs = new FileOutputStream("jugador.txt");
            ObjectOutputStream oos = new ObjectOutputStream (fs);
            
            oos.writeObject(Random); 
            
        }catch(IOException e){
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        //Lectura del fichero
 
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream ("jugador.txt"));
        
        Object aux = ois.readObject();
        
        if(aux instanceof Jugador){
            
            System.out.println(aux.toString());
           
        }
        
        // Ejercicio 2 - B 
        
        String respuesta = JOptionPane.showInputDialog("Introduzca el número de palabras a introducir (entre 2 y 5)");
        int resp = Integer.parseInt(respuesta);
        
        String [] array = new String [resp];
        
        for (int i = 0; i < array.length; i++) {
            
            array[i] = JOptionPane.showInputDialog(i + "Introduzca la palabra: ");
            
        }
        
        // Escribe fichero
        
        FileOutputStream fos = new FileOutputStream ("palabras.txt");
        
        
        
        
    }
    
}
