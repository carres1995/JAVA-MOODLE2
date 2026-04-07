package org.example.moodle2.service;

public class GetCategory {

    public static String getCategorySalarial(Double salary) {  // <- Double, no double
        return switch (salary) {
            case Double s when s < 2000 -> "Salario Bajo";     
            case Double s when s <= 5000 -> "Salario Medio";
            default -> "Salario Alto";
        };
    }
}