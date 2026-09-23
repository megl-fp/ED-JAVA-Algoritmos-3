/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abs_algo3;

/**
 *
 * @author marcos gonzales lovera y Mateo Alessandro Ortiz Ortiz
 */
public class BST_Generic<T extends Comparable<T> > {
    
    class NodoBST{
        T dato=null;
        NodoBST izq=null;
        NodoBST der=null;
    
        public NodoBST (T dato){
        this.dato = dato;
        }
    
    }
    
private NodoBST raiz;

public void agregar (T dato){
    raiz = priv_agregar (raiz , dato);
}

public T buscar (T dato)
   {
      NodoBST nodo = priv_buscar(raiz,dato);
	  if ( nodo != null ) 
	     return nodo.dato;
	  else { /* Reemplazar por manejo de excepcion!! */
	     System.out.println("No existe en el arbol!!! " + dato);
         return null;	  
	  }	 
   }

public void imprimir(){
    System.out.println();
    priv_imprimir(raiz);
    System.out.println();
}

private NodoBST priv_agregar(NodoBST n_actual, T dato){
if ( n_actual == null )
         return ( new NodoBST(dato) );

     int comparacion = dato.compareTo (n_actual.dato);
	 
	 if ( comparacion < 0 ) 
	 	n_actual.izq = priv_agregar(n_actual.izq,dato);
	 else
		n_actual.der = priv_agregar(n_actual.der,dato); // permite duplicados
		 
	 return n_actual;
}

private void priv_imprimir(NodoBST n_actual){
if (n_actual != null){
    priv_imprimir(n_actual.izq);
    System.out.println(n_actual.dato + "");
    priv_imprimir(n_actual.der);
}
}

private NodoBST priv_buscar (NodoBST n_actual, T dato)
   {
      if ( n_actual == null )      // dato no se encuentra en el arbol
         return null;

     int comparacion = dato.compareTo (n_actual.dato);

	 if ( comparacion == 0 )      // dato == n_actual.dato 
	   return n_actual;
	 else if ( comparacion < 0 )  // dato < n_actual.dato, puede estar a la izquierda
	   return priv_buscar(n_actual.izq,dato);
     else	                      // dato > n_actual.dato, puede estar a la derecha
	   return priv_buscar(n_actual.der,dato);
	      
   }
    

public static void main(String[] args) {
//        BST Arbol1 = new BST();
//        Arbol1.agregar("Marcos");
//        Arbol1.agregar("Gonzalez");
//        Arbol1.agregar(5314781);
//        Arbol1.agregar(1.85);
//        Arbol1.agregar("G");
//        
//        Arbol1.imprimir();

           BST_Generic<String> Arbol = new BST_Generic<String>();
           Arbol.agregar("Mateo");
           Arbol.agregar("Ortiz");
           Arbol.buscar("Alessandro");
        
    }
    
}
