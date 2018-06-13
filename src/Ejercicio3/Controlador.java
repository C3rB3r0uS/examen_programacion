/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumno
 */
public class Controlador implements ActionListener{
    
    Vista ventana;
    ModeloJugador mj;
    ModeloPersonaje mp;
    
    public Controlador (Vista ventana, ModeloJugador mj, ModeloPersonaje mp){
        
        this.ventana = ventana;
        this.mj = mj;
        this.mp = mp;
        this.ventana.BotonBorrar.addActionListener(this);
        this.ventana.BotonConsultar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == this.ventana.BotonBorrar){
            
            this.ventana.CampoTexto.setText("");
            
        }
        
    }
    
}
