/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.github;

/**
 *
 * @author diego
 */
public class Redondeo {
    public static void mostrarRespuesta(double numeroDecimal){
        //Math.round(), Math.floor() y Math.ceil() 
        double round = Math.round(numeroDecimal);
        double floor = Math.floor(numeroDecimal);
        double ceil = Math.ceil(numeroDecimal);
      
        
        System.out.println("\n  El redondeo al valor superior es: "+round
                + "\n El redondeo al valor inferior es: "+ floor
                + "\n El redondeo al valor superior inmediato es: " + ceil);
        
    }

}

