package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Perro;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    PerroJpaController perroJPA = new PerroJpaController();
    
    public void crearPerro(Perro perro) {
        try {
            perroJPA.create(perro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPerro(Perro perro) {
        try {
            perroJPA.destroy(perro.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarPerro(int id) {
        try {
            perroJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Perro obtenerPerro(Perro perro) {
        return perroJPA.findPerro(perro.getId());
    }
    public Perro obtenerPerro(int id) {
        return perroJPA.findPerro(id);
    }
    
    public List<Perro> obtenerPerros() {
        return perroJPA.findPerroEntities();
    }
    
    public void modificarPerro(Perro perro) {
        try {
            perroJPA.edit(perro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
