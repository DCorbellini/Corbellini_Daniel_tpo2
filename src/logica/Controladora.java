package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    

    public void guardarPerro(String id, String nombre, String raza, String color, String alergico, String atencionEspecial, String duenio, String cel, String observaciones) throws Exception {
        System.out.println(nombre);
        if (nombre.isEmpty()) throw new Exception("Ingrese el nombre del perro");
        if (raza.isEmpty()) throw new Exception("Ingrese la raza del perro");
        if (color.isEmpty()) throw new Exception("Ingrese el color del perro");
        if (alergico.equals("-")) throw new Exception("Selecione si el perro tiene alergias");
        if (atencionEspecial.equals("-")) throw new Exception("Selecione si el perro necesita atencion especial");
        if (duenio.isEmpty()) throw new Exception("Ingrese su nombre");
        if (cel.isEmpty()) throw new Exception("Ingrese su celular");
        
        Perro perro = new Perro(
                Integer.parseInt(id),
                nombre,
                raza,
                color,
                alergico.equals("Si"),
                atencionEspecial.equals("Si"),
                duenio,
                cel,
                observaciones
        );
        controlPersistencia.crearPerro(perro);
    }
    
    public int siguienteNoCliente() {
        return controlPersistencia.siguienteId();
    }    
    
    // todos estos metodos no los uso pero los deje "por las dudas"
    // idem en la controladora de persistencia
    public void crearPerro(Perro mascota) {
        controlPersistencia.crearPerro(mascota);
    }
    
    public void eliminarPerro(Perro mascota) {
        controlPersistencia.eliminarPerro(mascota);
    }
    public void eliminarPerro(int id) {
        controlPersistencia.eliminarPerro(id);
    }
    
    public List<Perro> obtenerPerros() {
        return controlPersistencia.obtenerPerros();
    }
    
    public Perro obtenerPerro(Perro mascota) {
        return controlPersistencia.obtenerPerro(mascota);
    }
    public Perro obtenerPerro(int id) {
        return controlPersistencia.obtenerPerro(id);
    }
    
    public void modificarPerro(Perro mascota) {
        controlPersistencia.modificarPerro(mascota);
    }
}
