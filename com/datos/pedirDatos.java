package datos;
import javax.swing.JOptionPane;

/**
 *
 * @author slemagonzalez
 */
public class pedirDatos {
    
    /**
     *
     * @param mensaje
     * @return String
     */
    public static String leerString(String mensaje){
        
        return JOptionPane.showInputDialog(mensaje);
    }
}