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

