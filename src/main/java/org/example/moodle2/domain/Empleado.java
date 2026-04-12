package org.example.moodle2.domain;

import java.util.Arrays;

public class Empleado {
    private String id;
    private String name;
    private double salary;
    private double grade;
    private int puntaje;

    public Empleado(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public double getGrade() { return (grade); }
    public int getPuntaje() { return puntaje; }
    public void setGrade(double grade) { this.grade = grade; }
    public void setPuntaje(int puntaje) { this.puntaje = puntaje; }

    @Override
    public String toString() {
        return String.format("""
                ID: %s,
                Nombre: %s,
                Salario: %f,
                Calificaciones: %f,
                Puntaje: %d
                """, id,name,salary, grade,puntaje);
    }
}
