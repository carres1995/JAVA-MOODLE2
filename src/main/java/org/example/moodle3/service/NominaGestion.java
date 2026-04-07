package org.example.moodle3.service;

import org.example.moodle3.domain.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class NominaGestion {

    private List<Empleado> listaEmpleados = new ArrayList<>();


    private Map<String, Empleado> mapaEmpleados = new HashMap<>();
    //Factory method e inmutabilidad
    //lista que no debe cambiar dentro de la ejecucion
    private final List<String> tecnologias = List.of("Java", "Python", "JavaScript", "C#");
    private final Map<String, String> sedes = Map.of(
            "MED", "Sede Medellín - Poblado",
            "BOG", "Sede Bogotá - Chapinero",
            "CAL", "Sede Cali - Sur"
    );
    //los List.of() y Map.of() son mas seguros que los ArrayList()
    //Al ser inmutables no se pueden modificar(add/remove)
    //no permite add()


    public void agregarEmpleado(Empleado emp) {
        listaEmpleados.add(emp);
        mapaEmpleados.put(emp.getId(), emp);
        System.out.println("Empleado agregado exitosamente.");
    }


    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        listaEmpleados.forEach(System.out::println);
    }


    public Empleado buscarPorId(String id) {

        return mapaEmpleados.get(id);
    }

    public void eliminarEmpleado(String id) {
        Empleado emp = mapaEmpleados.get(id);
        if (emp != null) {
            listaEmpleados.remove(emp);
            mapaEmpleados.remove(id);
            System.out.println("Empleado con ID " + id + " eliminado.");
        } else {
            System.out.println("Error: No se encontró el empleado.");
        }
    }
    // Getters para las listas inmutables
    public List<String> getTecnologias() { return tecnologias; }
    public Map<String, String> getSedes() { return sedes; }
}
