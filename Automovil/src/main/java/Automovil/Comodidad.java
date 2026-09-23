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
public class Comodidad {
    private boolean aireAcondicionado;
    private boolean calefaccion;
    private boolean radio;

    public Comodidad() {
        this.aireAcondicionado = false ;
        this.calefaccion = false ;
        this.radio = false ;
    }
    
    public Comodidad(boolean aireAcondicionado, boolean calefaccion, boolean radio) {
        this.aireAcondicionado = aireAcondicionado;
        this.calefaccion = calefaccion;
        this.radio = radio;        
    }

    public boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean getCalefaccion() {
        return calefaccion;
    }

    public boolean getRadio() {
        return radio;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }
}
