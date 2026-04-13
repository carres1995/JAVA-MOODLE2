package org.example.moodle3.service;

import org.example.moodle4.domain.Empleado;
import java.util.*;

public class NominaGestion {
    // TASK 1: Almacenamiento dinámico
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private Map<String, Empleado> mapaEmpleados = new HashMap<>();

    // TASK 2: Factory Methods (Inmutables)
    private final List<String> tecnologias = List.of("Java", "Python", "JavaScript", "C#");
    private final Map<String, String> sedes = Map.of(
            "MED", "Sede Medellín",
            "BOG", "Sede Bogotá",
            "CAL", "Sede Cali"
    );

    public void agregarEmpleado(Empleado emp) {
        listaEmpleados.add(emp);
        mapaEmpleados.put(emp.getId(), emp);
    }

    // TASK 4: removeIf y retorno de eliminados
    public List<Empleado> eliminarBajoPuntaje() {
        // Identificamos quiénes se van antes de borrarlos para poder reportarlos
        var eliminados = listaEmpleados.stream()
                .filter(e -> e.getPuntaje() < 4)
                .toList();

        // Borramos de la lista principal
        listaEmpleados.removeIf(e -> e.getPuntaje() < 4);

        // Sincronizamos el HashMap (Borramos del mapa los que ya no están en la lista)
        eliminados.forEach(e -> mapaEmpleados.remove(e.getId()));

        return eliminados;
    }

    // TASK 3: Sequenced Collections (Java 21)
    public String obtenerReporteExtremos() {
        if (listaEmpleados.isEmpty()) return "Lista vacía.";

        var primero = listaEmpleados.getFirst(); // Java 21
        var ultimo = listaEmpleados.getLast();   // Java 21

        return String.format("Primer registro: %s | Último registro: %s",
                primero.getName(), ultimo.getName());
    }

    // TASK 4: Reporte final con inferencia de tipos (var)
    public void generarReporteFinal() {
        var total = listaEmpleados.size();
        var sumaSalarios = 0.0;

        for (var emp : listaEmpleados) {
            sumaSalarios += emp.getSalary();
        }

        var promedio = total > 0 ? sumaSalarios / total : 0;

        System.out.println("--- REPORTE FINAL ---");
        System.out.println("Total Empleados: " + total);
        System.out.printf("Promedio Salarial: %.2f%n", promedio);
    }

    public List<Empleado> getListaEmpleados() { return listaEmpleados; }
    public List<String> getTecnologias() { return tecnologias; }
    public Map<String, String> getSedes() { return sedes; }
}