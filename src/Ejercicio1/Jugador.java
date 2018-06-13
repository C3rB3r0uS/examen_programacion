/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Jugador implements Serializable{
    
    private String nombre;
    private transient int edad;
    private boolean traiciona;

    public Jugador(String nombre, int edad, boolean traiciona) {
        this.nombre = nombre;
        this.edad = edad;
        this.traiciona = traiciona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTraiciona() {
        return traiciona;
    }

    public void setTraiciona(boolean traiciona) {
        this.traiciona = traiciona;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", traiciona=" + traiciona + '}';
    }

}
