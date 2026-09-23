/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author marco
 */
public class Operador extends Informatico implements ComportamientoInformatico{
    String sistemaOperativo;    

    public Operador() {
        super();
        this.sistemaOperativo = "";
    }

    public Operador(String sistemaOperativo, String lenguajePrincipal, String Nombre, int ci, double salario) {
        super(lenguajePrincipal, Nombre, ci, salario);
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public void monitorearSistemas(){
        System.out.println("Monitoreando Sistemas...");
    }
    
    //--------------------------------------------------------//
    //Getters y Seters

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    
    //--------------------------------------------------------//
    public String getDetalle(){
        return String.format("Nombre: %s, Sistema operativo: %s , CI: %d, Salario: %.2f\n", this.Nombre, this.sistemaOperativo , this.CI, this.Salario);}
    
    
    @Override 
    public void trabajar(){
        System.out.print("Operador trabajando...\n"); ;
    }   
    
    // informatico
    @Override
    public void desarrollarSoftware(){
        System.out.print("Operador esta Desarrollando Softeware...\n");
    }
    
    // comportamientoInformatico
    @Override
    public void documentar(){
        System.out.print("Operador Documentando...\n");
    }
    
    @Override
    public void resolverProblema(){
        System.out.print("Operador Resolviendo Problemas...\n");
    }
}
