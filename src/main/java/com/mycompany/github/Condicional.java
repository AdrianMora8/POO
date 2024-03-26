package com.mycompany.github;

import java.util.Scanner;

public class Condicional {

        public static boolean preguntarSalir(Scanner scanner) {
        System.out.println("¿Desea salir de la aplicación?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Seleccione una opción: ");
        boolean salida = false;
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        
        switch(opcion) {
            case 1:
                salida = false;
                break;
            case 2:
                salida = true;
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
                throw new AssertionError();
        }
        return salida;
    }
}
