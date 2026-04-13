package org.example.moodle3.menu.java;

import org.example.moodle4.domain.Empleado;
import org.example.moodle2.service.PerformanceMatrix;
import org.example.moodle3.service.NominaGestion;

public class Menu {
    public void ejecutar() {
        var gestion = new NominaGestion();
        var performance = new PerformanceMatrix();

        // 1. Crear datos
        var emp1 = new Empleado("C001", "Andres Restrepo", 2500.0);
        var emp2 = new Empleado("C002", "Carlos Coder", 100.0);
        var emp3 = new Empleado("C003", "Mateo Coder", 3000.0);

        gestion.agregarEmpleado(emp1);
        gestion.agregarEmpleado(emp2);
        gestion.agregarEmpleado(emp3);

        // 2. Procesar Desempeño (Esto llena los puntajes)
        System.out.println("\n--- Procesando Notas en Matriz ---");
        performance.procesarDesempeno(gestion.getListaEmpleados());

        // 3. Mostrar Extremos (Java 21)
        System.out.println("\n" + gestion.obtenerReporteExtremos());

        // 4. Eliminación por puntaje (Task 4)
        var despedidos = gestion.eliminarBajoPuntaje();
        System.out.println("\n--- Empleados Eliminados (Puntaje < 4) ---");
        despedidos.forEach(e -> System.out.println("Eliminado: " + e.getName()));

        // 5. Reporte Final
        System.out.println("\n--- Estado Final de la Nómina ---");
        gestion.generarReporteFinal();
    }
}