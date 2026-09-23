/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDobleEnlazada_EnyData_01;

/**
 * grupo g22
 * @author Gonzalez Lovera Marcos Ezequiel 5314781 TQ 
 * @author Ortiz Otiz Mateo Alessandro 5331519 TQ
 * 
 */
public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<String> lista = new ListaDoblementeEnlazada<>();
                            // aca se modifica el tipo de dato.
        
        
        // Agregar elementos a la lista
        lista.agregar("Hola");
        lista.agregar("Mundo");
        lista.agregar("Java");
        lista.agregar("Generics");

        // Recorrer la lista hacia adelante
        System.out.println("Recorrido hacia adelante:");
        lista.recorrerAdelante();

        // Recorrer la lista hacia atrás
        System.out.println("Recorrido hacia atrás:");
        lista.recorrerAtras();

        // Eliminar un elemento de la lista
        lista.eliminar("Mundo");

        // Recorrer la lista hacia adelante después de eliminar
        System.out.println("Recorrido hacia adelante después de eliminar 'Mundo':");
        lista.recorrerAdelante();

        // Recorrer la lista hacia atrás después de eliminar
        System.out.println("Recorrido hacia atrás después de eliminar 'Mundo':");
        lista.recorrerAtras();
    }
}