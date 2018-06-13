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
public class ModeloPersonaje {
    
    private String cod;
    private String nombre;
    private String comportamiento;

    public ModeloPersonaje(String cod, String nombre, String comportamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.comportamiento = comportamiento;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
    
    
}
