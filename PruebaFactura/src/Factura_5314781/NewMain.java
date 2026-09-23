/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura_5314781;
import java.util.Scanner;

/**
 *
 * @author Marcos Ezequiel Gonzalez Lovera
 */
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura Fact1 = new Factura("12345", "contado", "Torinillos", 25 , 2500);
        System.out.println(Fact1);
        Fact1.obtenerMontoFactura();
        System.out.printf("El monto de la factura es : %.2f\n",Fact1.obtenerMontoFactura());
        
        
    }
    
    
}


