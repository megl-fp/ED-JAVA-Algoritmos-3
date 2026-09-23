/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_de_python_algo3;
import java.math.BigInteger;
import java.util.Objects;
/**
 *
 * @author marco
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
        /*
        // Recorrer la lista hacia adelante
        System.out.println("Recorrido hacia adelante:");
        lista.recorrerAdelante();

        // Recorrer la lista hacia atrás
        System.out.println("Recorrido hacia atrás:");
        lista.recorrerAtras();
        */
    }
}