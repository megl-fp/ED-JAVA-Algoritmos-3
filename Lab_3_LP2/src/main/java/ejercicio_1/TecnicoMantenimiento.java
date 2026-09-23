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
public class TecnicoMantenimiento extends Empleado{
    private String areaResponsable ;
        
    public TecnicoMantenimiento(){
        super();
        this.areaResponsable = "";
    }
    
    public TecnicoMantenimiento (String nombre , int ci , double salario , String area ){
        super(nombre,ci,salario) ;
        this.areaResponsable = area ;        
    }

    public String getAreaResponsable() {
        return areaResponsable;
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

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public void setCI(int CI) {
        this.CI = CI;
    }

    @Override
    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    

    public void setAreaResponsable(String areaResponsable) {
        this.areaResponsable = areaResponsable;
    }
    
    public void realizarMantenimiento(){
        System.out.printf("Tecnico Realizando mantenimiento...\n");  ;
    }
    
    @Override
    public void trabajar(){
        System.out.print("Tecnico mantimiento trabajando...\n"); ;
    }    
    @Override
    public String getDetalle(){
        return String.format("Nombre: %s,Area Reponsable: %s , CI: %d, Salario: %.2f", this.Nombre, this.areaResponsable , this.CI, this.Salario);}
}
