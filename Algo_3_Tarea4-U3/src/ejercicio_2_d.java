import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_2_d {

    // Radix Sort
    public static void radixSort(String[] arr, int maxLen) {
        for (int pos = maxLen - 1; pos >= 0; pos--) {
            countingSortByCharacter(arr, pos);
        }
    }

    // Counting Sort por carácter en una posición específica
    public static void countingSortByCharacter(String[] arr, int pos) {
        int n = arr.length;
        String[] output = new String[n];  // Array de salida
        int[] count = new int[27];  // Contamos letras (26 letras + 1 espacio vacío ' ')

        // Inicializar el array de conteo
        Arrays.fill(count, 0);

        // Calcular la frecuencia de cada carácter en la posición `pos`
        for (int i = 0; i < n; i++) {
            int charIndex = getCharIndex(arr[i], pos);
            count[charIndex]++;
        }

        // Modificar el array count para obtener las posiciones finales
        for (int i = 1; i < 27; i++) {
            count[i] += count[i - 1];
        }

        // Construir el array de salida usando el array count
        for (int i = n - 1; i >= 0; i--) {
            int charIndex = getCharIndex(arr[i], pos);
            output[count[charIndex] - 1] = arr[i];
            count[charIndex]--;
        }

        // Copiar el array de salida a `arr`
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Obtener el índice del carácter en la posición `pos`
    public static int getCharIndex(String s, int pos) {
        if (pos >= s.length()) {
            return 0;  // Espacio en blanco si la cadena es más corta
        }
        char c = s.charAt(pos);
        return (c == ' ') ? 0 : (c - 'a' + 1);  // 'a' es 1, 'b' es 2, etc. (0 para espacio)
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese el texto que desea ordenar: ");
        String texto = entrada.nextLine().toLowerCase();  // Convertir a minúsculas para evitar problemas de ordenación
        entrada.close();

        // Dividir el texto por espacios para obtener las palabras
        String[] palabras = texto.split("\\s+");  // Divide por uno o más espacios

        // Determinar la longitud máxima de las palabras
        int maxLen = 0;
        for (String palabra : palabras) {
            maxLen = Math.max(maxLen, palabra.length());
        }

        // Ejecutar el algoritmo Radix Sort
        radixSort(palabras, maxLen);

        // Imprimir el resultado
        System.out.println("Texto ordenado: " + String.join(" ", palabras));
    }
}


/*

Conclusión:
La versión de Radix Sort que utiliza Counting Sort en cada paso presenta varias ventajas importantes:

Estabilidad: Counting Sort asegura que los elementos con el mismo valor en una posición mantengan su orden relativo.
Eficiencia: Para entradas con un rango de dígitos o caracteres pequeño (como en el caso de letras alfabéticas), el 
algoritmo puede funcionar en tiempo lineal 
O(n), lo que lo hace más eficiente que los algoritmos basados en comparación como QuickSort o MergeSort.
Uso ideal para cadenas o números largos: Aunque Radix Sort puede tener limitaciones si los valores son demasiado 
grandes o el número de dígitos es considerable, su eficiencia en casos de longitud moderada lo hace especialmente
útil para ordenar cadenas alfabéticas o números con un número moderado de dígitos.    
 */