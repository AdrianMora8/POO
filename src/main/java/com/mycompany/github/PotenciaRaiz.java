package com.mycompany.github;

/**
 *
 * @author adrian
 */
public class PotenciaRaiz {
    public static void calcularPotenciaYRaiz(double base, double exponente) {
        double potencia = Math.pow(base, exponente);
        double raizCuadrada = Math.sqrt(base);
        
        System.out.println("Potencia de " + base + " elevado a " + exponente + " es: " + potencia);
        System.out.println("Raíz cuadrada de " + base + " es: " + raizCuadrada);
    }
}
