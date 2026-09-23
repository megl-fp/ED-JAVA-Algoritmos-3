/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *Grupo Numero: 8
 * @author Marcos Ezequiel Gonzalez Lovera CI : 5314781
 * @author Mateo Alessandro Ortiz Ortiz CI: 5331519
 * @version 24/08/2024 
 */

public class Programador extends Informatico implements ComportamientoInformatico {
    private String proyecto;

    public Programador() {
        super();        
        this.proyecto = "" ;
    }

    public Programador(String proyecto , String lenguajePrincipal, String Nombre, int ci, double salario) {
        super(lenguajePrincipal, Nombre, ci, salario);       
        this.proyecto = proyecto ;
    }
    
    public void AgregarProyecto(String Nombre){
        this.proyecto=Nombre;       
    }
  
    //--------------------------------------------------------//
    //Getters y Seters

    public String getProyecto() {
        return proyecto;
    }
    
    //--------------------------------------------------------//
    @Override
    public String getDetalle(){
        return String.format("Nombre: %s, Proyecto: %s , CI: %d, Salario: %.2f\n", this.Nombre, this.proyecto , this.CI, this.Salario);}
    
    @Override
    public void trabajar() {
        System.out.print("Programador trabajando...\n"); ;
    }   
    
    // informatico
    @Override
    public void desarrollarSoftware(){
        System.out.println("Programador esta Desarrollando Softeware...");
    }
    
    // comportamientoInformatico
    @Override
    public void documentar(){
        System.out.println("Programador Documentando...");
    }
    
    @Override
    public void resolverProblema(){
        System.out.println("Programador Resolviendo Problemas...\n");
    }
}
