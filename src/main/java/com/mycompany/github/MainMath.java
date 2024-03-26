package com.mycompany.github;

import java.util.Scanner;

public class MainMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean salir = false;
        
        
        do {            
            
        System.out.println("Escoja el programa a usar:"
                + "\n 1. Valor Absoluto"
                + "\n 2. Redondeo y Truncado"
                + "\n 3. Potencia y Raíz Cuadrada"
                + "\n 4. Números Aleatorios"
                + "\n 5. Funciones Trigonométricas"
                + "\n 6. Logaritmo Natural");
        
        int var = scanner.nextInt();
        scanner.nextLine();
        
        switch (var) {
            case 1:
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA UNO");
        
        System.out.print("Ingresa un número: ");
        double number = scanner.nextDouble();

        double absoluteValue = ValAbsoluto.calcValAbsoluto(number);
        System.out.println("El valor absoluto de " + number + " es: " + absoluteValue);
        scanner.nextLine();
        
        salir = Condicional.preguntarSalir(scanner);
                break;
                
            case 2:
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA DOS");
        
        System.out.println("Ingrese un numero decimal: ");
        double numeroDecimal = scanner.nextDouble();
        Redondeo.mostrarRespuesta(numeroDecimal);
        
        salir = Condicional.preguntarSalir(scanner);
                break;
                
            case 3:
                
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA TRES");

        
        
        salir = Condicional.preguntarSalir(scanner);
                
                break;
            case 4:
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA 4");
        
        
        
        salir = Condicional.preguntarSalir(scanner);
                break;
                
            case 5:
                
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA 5");
        
     
       
        salir = Condicional.preguntarSalir(scanner);
                
                break;
            case 6:
        
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA 6");
        
        System.out.println("Ingrese un numero entero positivo: ");
        try {
            int numeroPositivo = scanner.nextInt();
            if (numeroPositivo <= 0) {
                throw new IllegalArgumentException("El valor debe ser un entero positivo.");
            }
            LogaritmoNatural.mostrarRespuesta(numeroPositivo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        salir = Condicional.preguntarSalir(scanner);
    
                break;
            default:
                throw new AssertionError();
            }
        
        } while (salir == true);
    }
}

    

