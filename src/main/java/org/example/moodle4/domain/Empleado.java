package org.example.moodle4.domain;

//Angela la genero non-sealed para que Empleado pueda heredar otra sub clase/ explicado en el moodle4/readme.md, aparte moverla de carpeta com concepto extricto de proximidad en java.
public non-sealed class Empleado extends Persona {
    private double salary;
    private double grade;
    private int puntaje;

    public Empleado(String id, String name, double salary) {
        super(id,name);
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
