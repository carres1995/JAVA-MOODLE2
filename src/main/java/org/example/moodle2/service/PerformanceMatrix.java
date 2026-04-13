package org.example.moodle2.service;

import org.example.moodle4.domain.Empleado;

import java.util.List;

public class PerformanceMatrix {
    public void procesarDesempeno(List<Empleado> empleados) {

        //Matriz
        double[][] calificaciones = {
                {4.5, 4.2, 4.8},
                {3.0, 4.0, 3.1},
                {5.0, 4.9, 4.7}   
        };

        // Recorrer la matriz con for anidados
        for (int i = 0; i < calificaciones.length; i++) {
            var emp = empleados.get(i);
            double suma = 0;
            double[] notasEmpleado = calificaciones[i];

            for (double nota : notasEmpleado) {
                suma += nota;
            }

            //Calcular promedio
            double promedio = suma / notasEmpleado.length;
            emp.setGrade(promedio);

            int puntaje =(int) promedio;
            emp.setPuntaje(puntaje);

            //este es el operador ternario, donde genera una validacion
            String estado = promedio >= 4.5 ? "Promovido" : "No promovido";

            //Mostrar resultados
            System.out.println(String.format("""
                    Empleado: %s,
                    Promedio Real: %f,
                    Estado: %s,
                    
                    Datos tecnicos del objeto: %s
                    """, emp.getName(), promedio, estado, emp));

        }
    }
}
