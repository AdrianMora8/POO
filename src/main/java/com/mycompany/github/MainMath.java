package com.mycompany.github;

import java.util.Scanner;

public class MainMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean condicion = false;
        String salida;
        
        do {            
            
        System.out.println("Escoja el programa a usar:"
                + "\n 1. Longitud de Cadenas"
                + "\n 2. Mayúsculas y Minúsculas"
                + "\n 3. Comparación de Cadenas"
                + "\n 4. Extracción de Subcadenas"
                + "\n 5. Reemplazo de Caracteres"
                + "\n 6. Conteo de Palabras");
        
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
        
        System.out.println("Salir (Y/N)");
        salida = scanner.nextLine();
        if (salida.equalsIgnoreCase("y")) {
            condicion = false;
        }else 
            condicion=true;
                break;
                
            case 2:
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA DOS");
        
        
        
        System.out.println("Salir (Y/N)");
        salida = scanner.nextLine();
        if (salida.equalsIgnoreCase("y")) {
            condicion = false;
        }else 
            condicion=true; 
                break;
                
            case 3:
                
        System.out.println("---------------------------------------");
        System.out.println("PROGRAMA TRES");

        
        
        System.out.println("Salir (Y/N)");
        salida = scanner.nextLine();
        if (salida.equalsIgnoreCase("y")) {
            condicion = false;
        }else 
            condicion=true;
                
                break;
            case 4:
             System.out.println("---------------------------------------");
        System.out.println("PROGRAMA 4");
        
        
        
        System.out.println("Salir (Y/N)");
        salida = scanner.nextLine();
        if (salida.equalsIgnoreCase("y")) {
            condicion = false;
        }else 
            condicion=true;
                break;
                
            case 5:
                
        
        
        System.out.println("Salir (Y/N)");
        salida = scanner.nextLine();
       
        if (salida.equalsIgnoreCase("y")) {
            condicion = false;
        }else 
            condicion=true;

                
                break;
            case 6:
        
        
        System.out.println("Salir (Y/N)");
        salida = scanner.nextLine();
        if (salida.equalsIgnoreCase("y")) {
            condicion = false;
        }else 
            condicion=true;
       
                break;
            default:
                throw new AssertionError();
            }
        
        } while (condicion == true);
    }
}

    

