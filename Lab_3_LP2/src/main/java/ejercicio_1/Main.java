/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.beans.PropertyEditorManager;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String nombre, int ci, double salario, String departamento
        Gerente gerente1= new Gerente("Luis Lopez",123456,10000000.0,"Cobranza");        
        System.out.printf("%s\n",gerente1.getDetalle()); 
        gerente1.trabajar(); 
        gerente1.dirigirDepartamento();                
        gerente1.aumentarSalario(200000.0);
        System.out.printf("Salario: %f\n\n",gerente1.getSalario());
        //----------------------------------
        
        TecnicoMantenimiento tecnico1 = new TecnicoMantenimiento("Tobias Suarez", 129824, 2031039.0, "Oficinas de Central");
        System.out.printf("%s\n",tecnico1.getDetalle());
        tecnico1.trabajar();
        tecnico1.realizarMantenimiento();
        tecnico1.descontarSalario(50000.0);
        System.out.printf("Salario: %f\n\n",tecnico1.getSalario());
        //-----------------------------------
        
        Analista analista1 = new Analista("Departamento de Infrastructura", "Java y C# ", "Jose Rodriguez", 8291037, 100000000.0);
        System.out.printf("%s\n",analista1.getDetalle());
        analista1.trabajar();
        analista1.desarrollarSoftware();
        analista1.realizarAnalisis();
        analista1.documentar();
        //------------------------------------
        
        Programador programador1 = new Programador("Desarrollo de aplicacion web", "html", "Manolo Duarte", 892018, 12340123);
        System.out.printf("\n%s",programador1.getDetalle());
        programador1.desarrollarSoftware();
        programador1.trabajar();
        programador1.documentar();
        //------------------------------------
        
        Operador operador1 = new Operador("Linux ", "Python", "Lucia Gomez", 1209982, 29107421);
        System.out.printf("\n%s",operador1.getDetalle());
        operador1.monitorearSistemas();
        operador1.desarrollarSoftware();
        operador1.documentar();
        
    }
    
}
