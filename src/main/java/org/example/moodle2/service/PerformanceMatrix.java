package org.example.moodle2.service;

public class PerformanceMatrix {
    public void procesarDesempeno() {

        //Matriz
        double[][] calificaciones = {
                {4.5, 4.2, 4.8},
                {3.9, 4.0, 4.1},  
                {5.0, 4.9, 4.7}   
        };

        // Recorrer la matriz con for anidados
        for (int i = 0; i < calificaciones.length; i++) {

            double suma = 0;

            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }

            //Calcular promedio
            double promedio = suma / calificaciones[i].length;

            //este es el operador ternario, donde genera una validacion
            String estado = promedio >= 4.5 ? "Promovido" : "No promovido";

            int puntajeSimplificado = (int) promedio;

            //Mostrar resultados
            System.out.println("Empleado " + (i + 1));
            System.out.println("Promedio real: " + promedio);
            System.out.println("Puntaje simplificado: " + puntajeSimplificado);
            System.out.println("Estado: " + estado);
        }
    }
}
