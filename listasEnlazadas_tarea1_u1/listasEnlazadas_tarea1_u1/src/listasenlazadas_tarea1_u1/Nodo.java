/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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


public class Nodo {
    Object dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
