/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class Conexion {
    
    public Conexion(){
        
    }
    
    public Connection getConexion(){
        
        Connection conn = null;
        try{
            
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:random/random@192.168.1.179:3306");

        }catch(SQLException e){
            
            System.out.println("Error al conectar con SQL: " + e.getStackTrace());
            
        }catch(ClassNotFoundException e){
            
            System.out.println("Clase no encontrada: " + e.getStackTrace());
            
        }
        
        return conn;
    }
    
}
