package org.example;

import org.example.moodle2.Switch.MenuSwitch;
import org.example.moodle3.menu.java.Menu;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        app.iniciar();
    }

    public void mostrarMenu() {
        System.out.println("""
               
                --- MENU DE APRENDIZAJE ---
                1. Ejecutar Semana 2
                2. Ejecutar Semana 3
                3. Salir
                Seleccione una opcion:""");
    }

    public void iniciar() {

        MenuSwitch menuSemana2 = new MenuSwitch();
        Menu menuSemana3 = new Menu();

        int option = 0;


        while (option != 3) {
            mostrarMenu();


            if (scanner.hasNextInt()) {
                option = scanner.nextInt();


                switch (option) {
                    case 1 -> {
                        System.out.println("Iniciando Semana 2...");
                        menuSemana2.mostrarMenu();
                        menuSemana2.iniciar();
                    }
                    case 2 -> {
                        System.out.println("Iniciando Semana 3...");
                        menuSemana3.ejecutar();

                    }
                    case 3 -> System.out.println("Saliendo del sistema");
                    default -> System.out.println("Opción no valida. Intente de nuevo.");
                }
            } else {
                System.out.println("Error: Por favor, ingrese un numero.");
                scanner.next();
            }
        }
    }
}