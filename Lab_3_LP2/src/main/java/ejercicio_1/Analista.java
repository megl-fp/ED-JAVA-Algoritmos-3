/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *Grupo Numero: 8
 * @author Marcos Ezequiel Gonzalez Lovera CI : 5314781
 * @author Mateo Alessandro Ortiz Ortiz CI: 5331519
 * @version 24/08/2024 
 */
public class Analista extends Informatico implements ComportamientoInformatico{
    private String areaAnalizada;
    
    public Analista() {
        super();
        this.areaAnalizada = " ";
    }

    public Analista(String areaAnalizada, String lenguajePrincipal, String Nombre, int ci, double salario) {
        super(lenguajePrincipal, Nombre, ci, salario);
        this.areaAnalizada = areaAnalizada;
    }
    //--------------------------------------------------------//
    //Getters y Seters
    public String getAreaAnalizada(){
        return areaAnalizada;
    }
    @Override
    public String getDetalle(){
        return String.format("Nombre: %s , Area analizada: %s , CI: %d, Salario: %.2f", this.Nombre,this.areaAnalizada, this.CI, this.Salario);}
    
    
    //_____________________

    public void setAreaAnalizada(String areaAnalizada) {
        this.areaAnalizada = areaAnalizada;
    }

    //--------------------------------------------------------//
    public String realizarAnalisis() {
        return "Analista Analizando...";
    }
    
    
    @Override 
    public void trabajar(){
        System.out.print("Analista trabajando...\n"); ;
    }           
    // comportamientoInformatico
    @Override
    public void documentar(){
        System.out.print("Analista Documentando...\n");
    }
    @Override
    public void resolverProblema(){
        System.out.print("Analista Resolviendo Problemas...\n");
    }
    // informatico
    @Override
    public void desarrollarSoftware(){
        System.out.printf("Analista desarrolla su parte del Softeware...\n");
    }
}
