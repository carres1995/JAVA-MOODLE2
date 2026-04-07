package org.example.moodle3.domain;

public class Empleado {
    private String id;
    private String nombre;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters necesarios para la lógica
    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre;
    }
}
