package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Perro;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    PerroJpaController perroJPA = new PerroJpaController();
    
    public void crearPerro(Perro perro) {
        perroJPA.create(perro);
    }
    
    // decidi hacer esta funcion de esta forma porque es la unica que se me
    // ocurrio para no repetir ids
    // otra opcion seria devolver perros.size() pero si un dia el proyecto
    // se extiende para eliminar clientes ese metodo va a retornar valores que
    // pueden estar en uso
    public int siguienteId() {
        List<Perro> perros = obtenerPerros();
        
        // inicializo max en 0 para que el primer id sea 1
        int max=0;
        for (int i=0; i<perros.size(); ++i) {
            if (perros.get(i).getId()>max)
                max = perros.get(i).getId();
        }
        
        return max+1;
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
