

/*  Algoritmos y Estructura de Datos III - Seccion TQ - 2024
 *  Prof. Cristian Cappo
 *  -------------------------------------------------------------------------------
 *  Implementacion sencilla de QuickSort con varios criterios de seleccion de Pivot 
 *  - Ultimo elemento
 *  - Elemento central
 *  - MedianaTres
 *  - MedianaTres
 *  - Randomico
 *
 *  El algoritmo de quicksort (con variantes en el criterio de seleccion del pivot) fue tomado del libro CLRS (2nd. edition) Cap. 7 (pag. 147)
*/
public class QuickSimple {
    /* Utilizamos un enumerado para que el programa sea un poco más claro */
    public static enum tipoCriterio  { Ultimo, MedianaTres, Randomico, Central };
    private static tipoCriterio Criterio;
    
    /* Parametro del Test: un numero entero indicando el tipo de selección de pivot 
       1 : Ultimo
       2 : MedianaTres
       3 : Randomico
       4 : Central
    */
    public static void main (String [] args ) {
         int [] A ;
         
         /* Criterio por defecto */
         Criterio = tipoCriterio.Ultimo;
       
         if ( args.length > 0 ) {
           switch ( Integer.parseInt(args[0]) ) {
              case 1: 
                 Criterio = tipoCriterio.Ultimo;
                 break;
              case 2:
                 Criterio = tipoCriterio.MedianaTres;
                 break;
              case 3:
                 Criterio = tipoCriterio.Randomico;
                 break;
              case 4:	
                 Criterio = tipoCriterio.Central;
                 break;
              default :
                 System.out.println("Criterio incorrecto ( Debe ser 1=Ultimo,2=MedianaTres,3=Randomico,4=Central)");
                 System.exit(1);				
           }
         }
         else {
            System.out.println("Introduzca Criterio ( Debe ser 1=Ultimo,2=MedianaTres,3=Randomico,4=Central)");
                 System.exit(1);
         }
         
         System.out.println("QuickSort - Criterio de particion: " + Criterio );
         System.out.printf("\n\tN\t\tsec\t\tT(n)/n*log(n)\tT(n)/n^2");
         System.out.printf("\n\t=\t\t===\t\t=============\t========");
         
         for ( int n = 100000; n <= 800000; n += 50000 ) {
            long s_ini, s_fin;
            A = new int[n];		   
            for ( int k=0; k < n ; k ++ ) {
                A[k] = (int) (Math.random() * n);
            }
            /* Si ordenamos antes , el efecto es el de un algoritmo cuadratico */
            quicksort(A,0,A.length-1);
            s_ini = System.currentTimeMillis();
            quicksort(A,0,A.length-1);
            if ( !check_order(A) ) System.exit(1);
            s_fin = System.currentTimeMillis();
            System.out.printf("\n\t%d\t\t%f\t%13.12f\t%13.12f", n, ((float)(s_fin-s_ini)), (s_fin-s_ini)/( n * (Math.log(n)/Math.log(2)) ),((float)(s_fin-s_ini))/( (long) n* (long) n));
         }
                 
    }
    
    private static boolean check_order( int [] A ) {
         for ( int i= 0 ; i < A.length-1; i++ )
             if ( A[i]>A[i+1] ) return false;
         return true;
    }		
    
    private static void quicksort( int [] A, int p, int r) {
         int q;
         
         if ( p < r ) {
           q = partition( A, p, r);
           quicksort(A,p,q-1);
           quicksort(A,q+1,r);
         } 
    } 
    private static int partition( int [] A, int p, int r) {
         int pivot, mitad, rand;
         int i,j;
         i     = p - 1;
         
         /* Variantes de la seleccion del pivot, por simplicidad usamos un dato miembro Criterio para decidir el tipo de seleccion que se hara */
         
         switch ( Criterio ) {
            case Central:
                 mitad = (p+r)/2;
                 pivot = A[mitad];
                 intercambiar(A,r,mitad);
                 break;				
            case Ultimo:
                 pivot = A[r];     
                 break;
            case MedianaTres:
                 mitad = (p+r)/2;
                 if ( A[mitad] < A[p] ) 
                     intercambiar(A,mitad,p);
                 if ( A[r] < A[p] ) 
                     intercambiar(A, p, r );
                 if ( A[r] < A[mitad] )
                     intercambiar(A, mitad, r );
                 pivot = A[mitad];
                 intercambiar(A,r,mitad);
                 break;
            case Randomico:
                 rand = p +(int)(Math.random()*(r-p));
                 pivot = A[rand];
                 intercambiar(A,r,rand);
                 break;
             default:
                 pivot = A[r];			
         }
         
         
         for ( j = p ; j <= r - 1; j++ ) {
            if ( A[j] <= pivot ) {
               i++;
               /* intercambiar */
               intercambiar(A,i,j);
            }
         }
         
         intercambiar(A,i+1,r);
         
         return i+1;
    }
    
    private static void intercambiar ( int [] A, int i, int j ) {
        int tmp = A[i];
        A[i]    = A[j];
        A[j]    = tmp;
    }
 }
 
 
 
 
 