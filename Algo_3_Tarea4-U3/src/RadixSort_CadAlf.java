import java.util.Arrays;
import java.util.Scanner;

public class RadixSort_CadAlf {

    // Método principal para el algoritmo Radix Sort
    public static void radixSort(String[] arr, int maxLen) {
        // Vamos a ordenar desde el último carácter hasta el primero
        for (int pos = maxLen - 1; pos >= 0; pos--) {
            countingSortByCharacter(arr, pos);
        }
    }

    // Método Counting Sort basado en el carácter de una posición específica
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

    // Obtener el índice del carácter en la posición `pos` (base 26 + espacio ' ')
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
ejercicio 2 - C
Conclusión:
Aunque Radix Sort es un algoritmo eficiente en muchos casos, especialmente cuando m (longitud de los elementos) es 
pequeña y el número de posibles valores de cada "dígito" no es excesivamente grande, puede tardar más que un tiempo 
estrictamente lineal en los siguientes escenarios:

Cuando m es muy grande (elementos largos).
Cuando el rango de posibles valores (la base b) es grande.
Cuando el número de elementos es pequeño en comparación con el rango de valores.
Cuando los elementos tienen longitudes muy desiguales.
Cuando el coste en memoria adicional se vuelve prohibitivo.
Por lo tanto, aunque Radix Sort tiene una complejidad teórica de 
O(m⋅n), en la práctica, hay situaciones en las que puede no ser más eficiente que otros algoritmos de ordenación general como Merge Sort o Quick Sort que tienen una complejidad de 
O(nlogn) pero con menos restricciones.
 */