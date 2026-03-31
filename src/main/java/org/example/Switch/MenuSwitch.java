package org.example.Switch;

import java.util.Scanner;
import org.example.service.GetCategory;

public class MenuSwitch {
    
    Scanner scanner = new Scanner(System.in);
    public void mostrarMenu() {
        String formato =
                """
                === MENÚ ===,
                1. Clasificar salario
                2. Salir
                """;
        System.out.println(formato);

    }
    private void procesarSalario(){
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
                    procesarSalario();
                    break;
                case 2:
                    System.out.println("salir");
                default:
                    System.out.println("opcion invalida");
            }

        } while (opcion != 2);

    }


}
