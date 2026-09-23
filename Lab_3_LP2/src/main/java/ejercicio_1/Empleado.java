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
public abstract class Empleado {
    String Nombre ;
    int CI ;
    Double Salario ;
    Scanner scanner = new Scanner(System.in); 
    
    public Empleado(){
        this.Nombre="";
        this.CI = 0;
        this.Salario = 0.0;
    };
    public Empleado(String Nombre,int ci , double salario ) 
    {
        this.Nombre = Nombre ;
        this. CI = ci ;
        this.Salario = salario ;
    }
    
    public abstract void trabajar() ;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    
    public String getDetalle(){
        return String.format("Nombre: %s, CI: %d, Salario: %.2f", this.Nombre, this.CI, this.Salario);}
    
    public void aumentarSalario(double x){
        while(true)
        {
            if(this.Salario+x>0){
                this.Salario+=x;
                break;
            }else{
                System.out.print("El monto ingresado es invalido, intente nuevamente./n");
                System.out.print("Ingrese un nuevo valor: ");
                x = scanner.nextDouble();                
            }
        }
    }
    
    public void descontarSalario(double x){
        if ( this.Salario - x >0 ){
		this.Salario = this.Salario - x;
	}else {
		System.out.println("ingrese un valor valido para descontar");
		/*Usar el scan para leer un nuevo valor */
		Double xnew;
		xnew=scanner.nextDouble();
		descontarSalario(xnew);
	}
    }
}
