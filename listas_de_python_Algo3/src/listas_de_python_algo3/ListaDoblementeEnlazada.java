/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_de_python_algo3;
import java.math.BigInteger;
import java.util.Objects;
import java.util.NoSuchElementException;
/**
 *
 * @author marco
 */
public class ListaDoblementeEnlazada {
    private Nodo cabeza;
    private Nodo cola;
    int cantNodos;
    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    // Agregar un elemento al final de la lista
    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        this.cantNodos +=1;
    }
    
    // Agregar elemento en el indice i de una lista de n elementos
    public void agregarI(Object dato, int i) {
        Nodo newNodo = new Nodo(dato);
        Nodo actual = cabeza;
        int cont = 0;
        int bandera = 0; //bandera que se activa cuando se agrega el nodo exitosamente
        if (cabeza.siguiente != null){
            if (i==0){ // agregar al comienzo
                newNodo.siguiente = cabeza;
                cabeza.anterior = newNodo;
                cabeza = newNodo;
                bandera=1;
            }
        }else{
            cabeza = newNodo;
            bandera = 1;
        }
        //agregar en medio
        if (bandera == 0){
            while (actual.siguiente!=null){
               cont++;
                if (cont == i && bandera==0){
                   agregarI_(actual, newNodo);
                   bandera = 1;
               }
               actual = actual.siguiente;
            }
        }
        //agregar al final si bandera sigue en 0 
        //y en el caso de que i sea negativo tambien agregar al final
        if (bandera==0 || i<0){
            cola.siguiente=newNodo;
            newNodo.anterior=cola;
        }
        
        this.cantNodos +=1;
    }
    
    //funcion privada ya que solo se usa para la funcion agregarI, no es para uso del usuario
    private void agregarI_(Nodo actual, Nodo newNodo){
        newNodo.anterior = actual.anterior;
        actual.anterior.siguiente = newNodo;
        actual.anterior = newNodo;
        newNodo.siguiente = actual;
    }
    
    // Elimina todos los Elementos de la lista
    public void borrartodos(ListaDoblementeEnlazada A){
        A.cabeza = null;
        A.cola = null;
    }
    
    // Retorna una copia de la lista (no solo la referencia)
    public void copiar(){
        
    }
    
    // Retorna la cantidad de elementos de la Lista
    public int contar(ListaDoblementeEnlazada A){ 
        return this.cantNodos;
    }
    
    // Extiende la lista con el contenido lista
    public void extender(ListaDoblementeEnlazada extra){
        Nodo nodoNuevo = extra.cabeza;
        do
        {
        this.agregar(nodoNuevo);
        nodoNuevo=nodoNuevo.siguiente;
        }
        while (nodoNuevo.siguiente != null );
        
    }
    
    // Retorna la referencia al elemento en la posición i. 
    // Si no existe genera una Excepción. 
    // El primer elemento tiene la posición 0.
    public Nodo indice(int i) 
    {
    if (i < 0) {
        throw new IndexOutOfBoundsException("El índice no puede ser negativo.");
    }
    
    Nodo actual = cabeza;
    int contador = 0;

    while (actual != null) {
        if (i == contador) {
            return actual;
        }
        
        contador++;
        actual = actual.siguiente;
    }

    // Si llegamos aquí, el índice está fuera del rango de la lista.
    throw new IndexOutOfBoundsException("Índice fuera del rango: " + i);
    }

    
    // Retorna la posición de elemento en la lista. Si no existe genera una Excepción
    public int indice(Object elemento) 
    {
    Nodo actual = cabeza;
    int contador = 0;

    while (actual != null) {
        if (Objects.equals(actual.dato, elemento)) {
            return contador;
        }
        
        contador++;
        actual = actual.siguiente;
    }

    // Si llegamos aquí, el elemento no se encuentra en la lista.
    throw new NoSuchElementException("El elemento " + elemento + " no se encuentra en la lista.");
    }   

    
    // Retorna el último elemento y lo elimina de la lista. 
    public void pop(){ // Deberia ser nodo, no void.
    }
    
    public void remover(Object dato) {
        Nodo actual = cabeza;
        while (actual != null) 
        {
            if (Objects.equals(actual.dato, dato)) {
                // Ajuste los enlaces de los nodos anterior y siguiente
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente; // Si es la cabeza, mueve la cabeza
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior; // Si es la cola, mueve la cola
                }

                // Decrementa el contador de nodos
                this.cantNodos -= 1;
                return; // Eliminar solo la primera ocurrencia y salir del método
            }
            actual = actual.siguiente;
        }
    // Si el elemento no se encuentra, no se hace nada
    }

    
    
    
  
    @Override 
    // Retorna una cadena representando el contenido de la lista
    // como en Python.
    public String toString(){
        Nodo actual = cabeza;
        if (actual == null) {
        return "[]"; // Maneja el caso en el que la lista está vacía.
        }               
        String cad = "[" ;
        while (actual != null) 
        {
        cad += actual.dato ;
        if (actual.siguiente!=null)
        {
            cad+=",";
        }
        actual = actual.siguiente;
        }
        cad+="]";
        return cad ;
    }
  
    
    
    
    
    
    //----------------------------------------------------------------//
    //----------------------------------------------------------------//
    //----------------------------------------------------------------//
    //----------------------------------------------------------------//
    //----------------------------------------------------------------//
    //----------------------------------------------------------------//
    // Recorrer la lista hacia adelante
    public void recorrerAdelante() {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato instanceof ListaDoblementeEnlazada) {
                System.out.print("[ ");
                ((ListaDoblementeEnlazada) actual.dato).recorrerAdelante();
                System.out.print("] ");
            } else {
                System.out.print(actual.dato + " ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Recorrer la lista hacia atrás
    public void recorrerAtras() {
        Nodo actual = cola;
        while (actual != null) {
            if (actual.dato instanceof ListaDoblementeEnlazada) {
                System.out.print("[ ");
                ((ListaDoblementeEnlazada) actual.dato).recorrerAtras();
                System.out.print("] ");
            } else {
                System.out.print(actual.dato + " ");
            }
            actual = actual.anterior;
        }
        System.out.println();
    }
    
}

