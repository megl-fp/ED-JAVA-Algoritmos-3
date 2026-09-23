/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *Grupo Numero: 8
 * @author Marcos Ezequiel Gonzalez Lovera CI : 5314781
 * @version 24/08/2024 
 *
 */
public class Gerente extends Empleado{
    private String departamento ;
    
    
    public Gerente() {
        super();
        this.departamento = "";
        
    }
    
    public Gerente(String nombre, int ci, double salario, String departamento) {
        super(nombre, ci, salario);
        this.departamento = departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCI() {
        return CI;
    }

    public Double getSalario() {
        return Salario;
    }
    

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    
    
    
    public void dirigirDepartamento(){
        System.out.print("Dirigiendo departamento...\n");
    }
    
   
    @Override
    public void trabajar(){
        System.out.print("El Gerente esta trabajando...\n"); ;
    }
    
    @Override
    public String getDetalle(){
        return String.format("Nombre: %s , Departamento: %s , CI: %d, Salario: %.2f", this.Nombre, this.departamento , this.CI, this.Salario);}
    
}
