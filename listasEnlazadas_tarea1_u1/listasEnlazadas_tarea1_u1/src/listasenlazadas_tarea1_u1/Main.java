/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas_tarea1_u1;
import java.math.BigInteger;
import java.util.Objects;

/**
 * g22
 * tarea 1-U1
 * @author marcos gonzalez CI:5314781 seccion TQ y mateo ortiz CI:5331519 seccion TQ
 * @version 16/08/2024
 */

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        // Agregar diferentes tipos de datos
        lista.agregar(2);
        lista.agregar(3.14f);
        lista.agregar("Hola");
        lista.agregar(true);
        lista.agregar(BigInteger.valueOf(123456789));

        // Crear una sublista
        ListaDoblementeEnlazada sublista = new ListaDoblementeEnlazada();
        sublista.agregar("Milanesa");
        sublista.agregar(7);
        sublista.agregar(8.12983);
        sublista.agregar(true);

        // Agregar la sublista a la lista principal
        lista.agregar(sublista);

        // Crear otra sublista que contenga una sublista vacía
        ListaDoblementeEnlazada sublista2 = new ListaDoblementeEnlazada();
        ListaDoblementeEnlazada sublistaVacia = new ListaDoblementeEnlazada();
        sublista2.agregar(sublistaVacia);
        lista.agregar(sublista2);

        System.out.printf("%s",lista);
        
    }

}
