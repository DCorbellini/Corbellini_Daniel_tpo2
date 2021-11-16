package logica;

import gui.Principal;
import java.awt.Dimension;

public class Corbellini_Daniel_tpo2 {

    public static void main(String[] args) {
        
        /** Conexion a la DB
         *  
         *  Server: perros
         *  User:   user_perros
         *  Pass:   zkLVqg5oXCoA1Juz
         * 
         */
        
        Controladora control = new Controladora();
        
        Principal principal = new Principal(control);
        // valores default de la pantalla, mas chico que esto y los elementos se empiezan a superponer
        principal.setMinimumSize(new Dimension(1053, 708));
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        
    }
    
}
