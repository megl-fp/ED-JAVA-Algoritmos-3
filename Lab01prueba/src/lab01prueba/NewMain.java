/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01prueba;

import java.util.Scanner;

/**
 *
 * @author Marcos Ezequiel Gonzalez Lovera CI: 5314781
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona personaUno = new Persona();
        
        // preprao para el ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        // solicito al usuario el ingreso de dato
        System.out.println("Introduce el nombre: ");
        //Almaceno en nombre los valores
        String nombre=entrada.nextLine();
        // Asigno por medio de setNombre el valor del nombre
        personaUno.setNombre(nombre);
        
        System.out.println("Introduce el apellido: ");
        //Almaceno en nombre los valores
        String apellido=entrada.nextLine();
        // Asigno por medio de setNombre el valor del nombre
        personaUno.setApellido(apellido);
        
        // imprimo los valores personalizados
        System.out.printf("Los Datos de la persona son: %s , %s%n",
                personaUno.getNombre(),personaUno.getApellido());
        System.out.printf("===============================");
        
        
        Persona personatrs = new Persona();
        Persona personaDos = new Persona("Marcos","Gonzalez",19,"123456","Documento");
        System.out.printf("%n%s%n",personaDos);
        
        
        
    }
    
}
