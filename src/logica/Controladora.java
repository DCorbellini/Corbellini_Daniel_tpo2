package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    

    public String guardarPerro(String id, String nombre, String raza, String color, String alergico, String atencionEspecial, String duenio, String cel, String observaciones) throws Exception {
        if (id.isEmpty()) throw new Exception("Ingrese el numero de cliente");
        
        Perro perro = controlPersistencia.obtenerPerro(Integer.parseInt(id));
        
        // si el perro existe, modificale los valores que no esten vacios
        if (perro != null) {
            if (!nombre.isEmpty()) 
                perro.setNombre(nombre);
            if (!raza.isEmpty()) 
                perro.setRaza(raza);
            if (!color.isEmpty()) 
                perro.setColor(color);
            if (!alergico.equals("-")) 
                perro.setAlergico(alergico.equals("Si"));
            if (!atencionEspecial.equals("-")) 
                perro.setAtencionEspecial(atencionEspecial.equals("Si"));
            if (!duenio.isEmpty()) 
                perro.setDuenio(duenio);
            if (!cel.isEmpty()) 
                perro.setCel(cel);
            if (!observaciones.isEmpty()) 
                perro.setObservaciones(observaciones);
            
            controlPersistencia.modificarPerro(perro);
            
            return "Se actualizo el pedido del cliente " + perro.getDuenio() + " (nro cliente: " + id + ")";
        }
        // si no existe, comproba que todos los valores esten cargados y 
        // crea el perro
        else {
            
            if (nombre.isEmpty()) throw new Exception("Ingrese el nombre del perro");
            if (raza.isEmpty()) throw new Exception("Ingrese la raza del perro");
            if (color.isEmpty()) throw new Exception("Ingrese el color del perro");
            if (alergico.equals("-")) throw new Exception("Selecione si el perro tiene alergias");
            if (atencionEspecial.equals("-")) throw new Exception("Selecione si el perro necesita atencion especial");
            if (duenio.isEmpty()) throw new Exception("Ingrese su nombre");
            if (cel.isEmpty()) throw new Exception("Ingrese su celular");
        
            controlPersistencia.crearPerro(new Perro(
                    Integer.parseInt(id),
                    nombre,
                    raza,
                    color,
                    alergico.equals("Si"),
                    atencionEspecial.equals("Si"),
                    duenio,
                    cel,
                    observaciones
            ));
            
            return "El pedido de " + duenio + " (nro cliente: " + id
                    + ") fue guardado correctamente";
        }
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
