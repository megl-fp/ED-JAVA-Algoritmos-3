
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class DivisionentreCeroSinManejoDeExcepciones {
    public static int cociente(int numerador , int denominador) {
        try {
            return numerador / denominador;
        } catch (ArithmeticException manolo) {
            System.out.println("Error: No se puede dividir entre cero. Intente con otro denominador.");
            return 0;  // Devolver un valor por defecto o lanzar una excepción personalizada
        }                
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdusca un numerador entero: ");
        int numerador = entrada.nextInt() ;
        System.out.print("Introdusca un denominador entero: ");
        int denominador = entrada.nextInt() ;
        int resultado = cociente(numerador,denominador);
        System.err.printf("\n%d / %d = %d\n",numerador,denominador,resultado);
    }
}   
