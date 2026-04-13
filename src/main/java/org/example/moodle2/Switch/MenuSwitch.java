package org.example.moodle2.Switch;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.example.moodle4.domain.Empleado;
import org.example.moodle2.service.GetCategory;
import org.example.moodle2.service.PerformanceMatrix;

public class MenuSwitch {

    PerformanceMatrix performance = new PerformanceMatrix();
    Scanner scanner = new Scanner(System.in);
    public void mostrarMenu() {
        String formato =
                """
                === MENÚ ===,
                1. clasificar salario empleado
                2. Procesar desempeño
                3. Salir
                """;
        System.out.println(formato);

    }
    private void datosEmpleado(){
        try {
            System.out.println("Ingresar ID: ");
            var id = scanner.next();
            System.out.println("Ingresa nombre: ");
            var name = scanner.next();
            System.out.println("Ingrese salario: ");
            var salario = scanner.nextDouble();
            //Estas son las validaciones de los datos primitivis deacuerdo a limites.
            if (salario <= 0) {
                System.out.println("El salario debe ser mayor que 0");
                } 
            else if (salario > 1000000000) {
                System.out.println("El salario es demasiado alto");
                } 
            else {
                System.out.println("Salario válido");
                }
            var categoria = GetCategory.getCategorySalarial(salario);

            System.out.println(("Categoria: " + categoria));

            var emp = new Empleado(id, name, salario);
            System.out.println(String.format("""
                    ID: %s,
                    Nombre: %s,
                    Salario: %f
                    """,emp.getId(),emp.getName(),emp.getSalary()));
        } catch (InputMismatchException e) {
            System.out.println("Entrada no valida. Por favor, ingrese un número.");
            scanner.next(); // Limpiar el buffer del scanner
        }
        /*
        En Java 8, los mensajes de error de excepciones como InputMismatchException
        son básicos y no siempre indican claramente el origen del problema.

        En Java 17/21 (LTS), los mensajes de error son más descriptivos,
        incluyendo detalles como el tipo esperado, el valor recibido
        y en algunos casos la línea exacta del fallo.

        Esto facilita el debugging y reduce el tiempo de diagnóstico de errores,
        haciendo el código más mantenible y seguro.
        */
    }
    public void iniciar(){
        int opcion;
        
        do{
            opcion = scanner.nextInt();
            //Estoy validando el rango de opciones
            if (opcion < 1 || opcion > 2) {
            System.out.println("Opcion fuera de rango");
            }
            switch (opcion){
                case 1 :
                    datosEmpleado();
                    break;
                case 2:
                    List<Empleado> misEmpleados = new ArrayList<>();
                    misEmpleados.add(new Empleado("1", "Carlos", 2000000));
                    misEmpleados.add(new Empleado("2", "Andres", 1000000));
                    misEmpleados.add(new Empleado("3", "Carlos", 50000));
                    performance.procesarDesempeno(misEmpleados);
                    break;
                case 3:
                    System.out.println("salir");
                default:
                    System.out.println("opcion invalida");
            }

        } while (opcion != 2);

    }


}
