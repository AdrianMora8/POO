package com.mycompany.github;
/**
 *
 * @author adrian
 */
public class FunTriginometricas {
    
    public static void mostrarResultados(double anguloGrados){
        double anguloRadianes = Math.toRadians(anguloGrados);

        double seno = Math.sin(anguloRadianes);
        double coseno = Math.cos(anguloRadianes);
        double tangente = Math.tan(anguloRadianes);

        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Tangente: " + tangente);
    }
}

