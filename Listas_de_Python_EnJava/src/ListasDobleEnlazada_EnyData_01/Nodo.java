/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDobleEnlazada_EnyData_01;

/**
 *
 * @author marco
 */
class Nodo<T> {
    T dato;
    Nodo<T> siguiente;
    Nodo<T> anterior;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }    
    
    public Object getDato() 
    { 
        return this.dato; 
    }
    
    public Nodo getNext() 
    {
        return this.siguiente;
    }
    
    public void setNext( Nodo n)throws Exception
    {
        if ( n != this ) 
        this.siguiente = n;
        else
        throw new Exception ("No se puede apuntar a si mismo!!"); 
    }
}