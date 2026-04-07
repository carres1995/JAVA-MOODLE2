package org.example.moodle3.menu.java;



import org.example.moodle3.domain.Empleado;
import org.example.moodle3.service.NominaGestion;

import java.util.Scanner;

public class Menu {
    public void main(){
        NominaGestion gestion = new NominaGestion();
        Scanner sc = new Scanner(System.in);

        // 2. Creamos algunos empleados de prueba
        Empleado emp1 = new Empleado("C001", "Andres Restrepo");
        Empleado emp2 = new Empleado("C002", "Carlos Coder");

        System.out.println("--- Agregando Empleados ---");
        gestion.agregarEmpleado(emp1);
        gestion.agregarEmpleado(emp2);

        System.out.println("\n--- Listado Actual ---");
        gestion.listarEmpleados();

        System.out.println("\n--- Búsqueda Instantánea (HashMap) ---");
        Empleado encontrado = gestion.buscarPorId("C001");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        }

        System.out.println("\n--- Eliminando Empleado C002 ---");
        gestion.eliminarEmpleado("C002");

        System.out.println("\n--- Listado Final ---");
        gestion.listarEmpleados();

        //acceder a los datos inmutables
        System.out.println("\n sedes validas- inmutables " + gestion.getSedes().keySet());
        System.out.println("\n tecnologias validas- inmutables " + gestion.getTecnologias());
    }

}
