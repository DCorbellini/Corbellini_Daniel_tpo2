package logica;

import gui.Principal;
import java.awt.Dimension;

public class Corbellini_Daniel_tpo2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Principal principal = new Principal(control);
        // valores default de la pantalla, mas chico que esto y los elementos se empiezan a superponer
        principal.setMinimumSize(new Dimension(1053, 708));
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        
    }
    
}
