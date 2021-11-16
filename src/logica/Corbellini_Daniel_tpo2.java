package logica;

import gui.Principal;

public class Corbellini_Daniel_tpo2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Principal principal = new Principal(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
    
}
