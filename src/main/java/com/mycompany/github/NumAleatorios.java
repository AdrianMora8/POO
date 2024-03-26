package com.mycompany.github;
/**
 *
 * @author adrian
 */
public class NumAleatorios {
     public static void generarNumeroAleatorioEnRango(int minimo, int maximo) {
        // Calculamos el rango ajustado
        int rango = maximo - minimo + 1;
        
        // Generamos el número aleatorio y lo ajustamos al rango especificado
        int numeroAleatorio = (int) (Math.random() * rango) + minimo;
        
        // Mostramos el número generado
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }
}
