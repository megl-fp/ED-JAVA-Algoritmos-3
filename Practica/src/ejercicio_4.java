
/* Ejercicio 1 (10p)
Tienes n estudiantes, cada uno con un puntaje en su examen final. Debes ordenarlos de mayor a menor según sus puntajes en un tiempo 
O(nlogn). No se permite usar espacio extra más allá de una cantidad constante de variables.

Ejercicio 4 (10p)
Dado un conjunto de 
n registros, cada uno con un número y un nombre asociado, escribe un algoritmo que ordene los registros según los números en un tiempo 
O(nlogn), sin perder la relación con los nombres. Usa un espacio adicional de O(1).*/

import java.util.Scanner;
import java.util.TreeMap;


public class ejercicio_4 {
    TreeMap<Integer,String> arbol = new TreeMap<>();    
    int cant;

    public ejercicio_4 (int n ){
        Scanner entrada = new Scanner(System.in);        
        this.cant = n;
        for(int i=0 ; i<n ; i++ ){
            System.out.println("Ingrese la clave: ");
            int num = entrada.nextInt();
            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.nextLine();
            arbol.put(num,nombre);
        } 
        entrada.close();
    }
}
