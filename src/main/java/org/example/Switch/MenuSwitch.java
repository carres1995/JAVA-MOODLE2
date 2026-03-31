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
        double salario = scanner.nextDouble();
        String categoria = GetCategory.getCategorySalarial(salario);
        System.out.println(("Categoria: " + categoria));
    }
    public void iniciar(){
        int opcion;
        do{
            opcion = scanner.nextInt();
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
