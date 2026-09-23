public class ejercicio_3 < T extends Comparable<T> > {
    
    // usaremos el algoritmo de busqueda binaria y lo modificaremos 
    // para este ejercicio, asi mantener la complejidad N(logN) deseada
    public boolean funcion( T[] array , T valor ){
        int der = 0;
        int izq = array.length - 1 ;
        int med ;

        while( der <= izq){
            med = der + (izq - der)/2 ;

            // Si el elemento es encontrado.
            if(array[med].compareTo(valor)==0)
                return true;
            
            // determinar si el lado izq esta ordenado
            if(array[izq].compareTo(array[med])<=0)
            {
                if(array[der].compareTo(valor) <= 0 && valor.compareTo(array[med]) < 0){
                    izq = med - 1 ;                    
                }else { der = med + 1 ; }
            }else{
                if(array[med].compareTo(valor) < 0 && valor.compareTo(array[izq]) <= 0){                    
                    der = med + 1 ;
                }else{
                    izq = med -1 ;
                }
            }
        }
    return false ;
    }
}