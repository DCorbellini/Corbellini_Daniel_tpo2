/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perro implements Serializable {
    @Id
    private int id;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private Boolean alergico;
    private Boolean atencionEspecial;
    private String duenio;
    private String cel;
    private String observaciones;

    public Perro(int id, String nombre, String raza, String color, Boolean alergico, Boolean atencionEspecial, String duenio, String cel, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.duenio = duenio;
        this.cel = cel;
        this.observaciones = observaciones;
    }

    public Perro() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public Boolean getAlergico() {
        return alergico;
    }

    public Boolean getAtencionEspecial() {
        return atencionEspecial;
    }

    public String getDuenio() {
        return duenio;
    }

    public String getCel() {
        return cel;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(Boolean alergico) {
        this.alergico = alergico;
    }

    public void setAtencionEspecial(Boolean atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
