/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Automovil;

/**
 *Grupo Numero: 8
 * @author Marcos Ezequiel Gonzalez Lovera CI : 5314781
 * @version 24/08/2024 
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //String Motor, String TipoCambio, int bateria, String marca, String color, String chapa, String tipoDeCombustible, int cantidadRuedas, boolean aireAcondicionado, boolean calefaccion, boolean radio, int cantAsientos, String TipoTerreno
    public static void main(String[] args) {
    //                             String Motor, String TipoCambio, int CantRuedas, String marca, String color, String chapa, boolean aireAcondicionado, boolean calefaccion, boolean radio, String TipoTerreno
        System.err.printf("%s%n","Auto1");
        automovil auto1 = new automovil("v12","Mecanico",4,"Toyota Supra","Naranja","ABC123",false,false,true,"terrestre");
        System.err.printf("%s",auto1);
        
        System.err.printf("%s%n","moto1");
        motocicleta moto1 = new motocicleta("12", "BMW" , "Azul y Blanco", "FQW123", false, true, true, "Terrestre");
        System.err.printf("%s",moto1);
        
        System.err.printf("%s%n","Camioneta1");
        camioneta camioneta1 = new camioneta("2 toneladas", "Ford Raptor", "Blanco", "AOS342", true, true, true, "Terrestre");
        System.err.printf("%s",camioneta1);
    }
    
}




// clase abtracta onn