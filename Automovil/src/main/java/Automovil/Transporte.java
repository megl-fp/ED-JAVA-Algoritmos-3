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
public class Transporte extends Comodidad{
    String TipoTerreno;

    public Transporte() {
        super();
        this.TipoTerreno="";
    }

    public Transporte(boolean aireAcondicionado, boolean calefaccion, boolean radio,String TipoTerreno) {
        super(aireAcondicionado, calefaccion, radio);
        this.TipoTerreno = TipoTerreno;
    }

    public String getTipoTerreno() {
        return TipoTerreno;
    }

    public void setTipoTerreno(String TipoTerreno) {
        this.TipoTerreno = TipoTerreno;
    }
}
