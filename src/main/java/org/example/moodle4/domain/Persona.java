package org.example.moodle4.domain;

public abstract sealed class Persona permits Empleado, ConsultorExterno{
    String id;
    String name;
    public Persona(String id,String name ){
        this.id = id;
        this.name = name;
    }
}
