/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automovil;

/**
 *Grupo Numero: 8
 * @author Marcos Ezequiel Gonzalez Lovera CI : 5314781
 * @version 24/08/2024 
 *
 */
public class camioneta extends vehiculo{
    private String Capacidad;

    public camioneta() {
        super();
        this.Capacidad = "";
    }

    public camioneta(String Capacidad, String marca, String color, String chapa, boolean aireAcondicionado, boolean calefaccion, boolean radio, String TipoTerreno) {
        super(marca, color, chapa, aireAcondicionado, calefaccion, radio, TipoTerreno);
        this.Capacidad = Capacidad;
    }    
    
    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }
    
    @Override     
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %B%n%s: %B%n%s: %B%n%s: %s%n%s%n",
        "Capacidad ", getCapacidad(),        
        "Marca ",getMarca(),
        "Color ",getColor(),
        "Chapa ",getChapa(),
        "Aire Acondicionado ",getAireAcondicionado(),
        "Calefaccion ",getCalefaccion(),
        "Radio ",getRadio(),
        "Tipo de Terreno ",getTipoTerreno(),
        "----------------------------------"); 
   }
}
