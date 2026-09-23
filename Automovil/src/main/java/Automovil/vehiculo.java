/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Automovil;
/**
 *Grupo Numero: 8
 * @author Marcos Ezequiel Gonzalez Lovera CI : 5314781
 * @version 24/08/2024 
 *
 */
public class vehiculo extends Transporte implements ComportamientoAutomovil{
    private String marca ;
    private String color ;
    private String chapa;
    
    
    public vehiculo(){
        super();
        this.marca = "";
        this.color = "";
        this.chapa = "";
    }

    public vehiculo(String marca, String color, String chapa, boolean aireAcondicionado, boolean calefaccion, boolean radio, String TipoTerreno) {
        super(aireAcondicionado, calefaccion, radio, TipoTerreno);
        this.marca = marca;
        this.color = color;
        this.chapa = chapa;        
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getChapa() {
        return chapa;
    }
    
    public String getTipoTerreno() {
        return TipoTerreno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public void setTipoTerreno(String TipoTerreno) {
        this.TipoTerreno = TipoTerreno;
    }
    
    @Override
    public String EncenderMotor(){
        return "Se ah encendido el motor...";
    }
    
    @Override
    public String ApagarMotor(){
        return "Se ah apagado el motor...";
    }
    
    @Override
    public String Abanzar(){
        return "El automovil esta abanzando...";
    }
    
    @Override
    public String Frenar(){
        return "El automovil esta detenido...";
    }
    
    @Override
    public String Retroceder(){
        return "El automovil esta retrocediendo...";
    }
}
