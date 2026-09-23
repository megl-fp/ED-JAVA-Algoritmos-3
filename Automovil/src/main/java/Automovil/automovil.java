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
public class automovil extends vehiculo{
    private String Motor ;
    private String TipoCambio ;
    private int CantRuedas;

    public automovil() {
        super();
        this.Motor = "";
        this.TipoCambio = "";
        this.CantRuedas = 0;
    }

    public automovil(String Motor, String TipoCambio, int CantRuedas, String marca, String color, String chapa, boolean aireAcondicionado, boolean calefaccion, boolean radio, String TipoTerreno) {
        super(marca, color, chapa, aireAcondicionado, calefaccion, radio, TipoTerreno);
        this.Motor = Motor;
        this.TipoCambio = TipoCambio;
        this.CantRuedas = CantRuedas;
    }

    public String getMotor() {
        return Motor;
    }

    public String getTipoCambio() {
        return TipoCambio;
    }

    public int getCantRuedas() {
        return CantRuedas;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public void setTipoCambio(String TipoCambio) {
        this.TipoCambio = TipoCambio;
    }

    public void setBateria(int CantRuedas) {
        this.CantRuedas = CantRuedas;
    }
    
    // String Motor, String TipoCambio, int CantRuedas, String marca, 
    // String color, String chapa, boolean aireAcondicionado, boolean calefaccion, 
    // boolean radio, String TipoTerreno
    @Override     
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %d%n%s: %s%n%s: %s%n%s: %s%n%s: %B%n%s: %B%n%s: %B%n%s: %s%n%s%n",
        "Motor ", getMotor(),
        "Tipo de Cambio ",getTipoCambio(),
        "Cantidad de Ruedas ",getCantRuedas(),
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
