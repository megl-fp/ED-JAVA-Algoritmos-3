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
