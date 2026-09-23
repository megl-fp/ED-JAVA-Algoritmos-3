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
public class motocicleta extends vehiculo{
    private String Cilindrada;

    public motocicleta() {
        super();
        this.Cilindrada = "";
    }

    public motocicleta(String Cilindrada, String marca, String color, String chapa, boolean aireAcondicionado, boolean calefaccion, boolean radio, String TipoTerreno) {
        super(marca, color, chapa, aireAcondicionado, calefaccion, radio, TipoTerreno);
        this.Cilindrada = Cilindrada;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    @Override     
    public String toString(){
        return String.format("%s: %S%n%s: %s%n%s: %s%n%s: %s%n%s: %B%n%s: %B%n%s: %B%n%s: %s%n%s%n",
        "Cilindrada ", getCilindrada(),        
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
