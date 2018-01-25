package com.datos;
import javax.swing.JOptionPane;

public class pedirDatos {
    
    public static String leerString(String mensaje){
        
        return JOptionPane.showInputDialog(mensaje);
    }
}