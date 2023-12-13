package org.ventaDePasajes;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private double id;
    private String numeroContacto;

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, double id, String numeroContacto, LocalDate localDate) {
        this.nombre = nombre;
        this.id = id;
        this.numeroContacto = numeroContacto;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", numeroContacto=" + numeroContacto ;
    }
}
