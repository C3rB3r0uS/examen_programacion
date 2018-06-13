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
public class ModeloJugador {
    
    private String nombre;
    private int edad;
    private String cod_personaje;
    private String traiciona;

    public ModeloJugador(String nombre, int edad, String cod_personaje, String traiciona) {
        this.nombre = nombre;
        this.edad = edad;
        this.cod_personaje = cod_personaje;
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

    public String getCod_personaje() {
        return cod_personaje;
    }

    public void setCod_personaje(String cod_personaje) {
        this.cod_personaje = cod_personaje;
    }

    public String getTraiciona() {
        return traiciona;
    }

    public void setTraiciona(String traiciona) {
        this.traiciona = traiciona;
    }

}
