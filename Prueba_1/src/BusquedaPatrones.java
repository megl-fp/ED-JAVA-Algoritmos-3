import java.util.Arrays;

public class BusquedaPatrones {

    // Algoritmo de Fuerza Bruta
    public static int fuerzaBruta(String patron, String texto) {
        int M = patron.length();
        int N = texto.length();

        // Recorremos cada posible posición en el texto
        for (int i = 0; i <= N - M; i++) {
            int j;
            // Comparamos el patrón con la subsecuencia del texto
            for (j = 0; j < M; j++) {
                if (texto.charAt(i + j) != patron.charAt(j)) {
                    break; // Si hay una diferencia, salimos del ciclo
                }
            }
            if (j == M) return i; // Si encontramos una coincidencia, devolvemos la posición
        }
        return -1; // Retornamos -1 si no se encuentra el patrón
    }


    // Algoritmo de Knuth-Morris-Pratt (KMP)
    public static int kmp(String patron, String texto) {
        int M = patron.length();
        int N = texto.length();

        // Preprocesamos el patrón para obtener el array de prefijos
        int[] lps = calcularLPS(patron);

        int i = 0; // Índice para el texto
        int j = 0; // Índice para el patrón
        while (i < N) {
            if (patron.charAt(j) == texto.charAt(i)) {
                i++;
                j++;
            }

            if (j == M) {
                return i - j; // Coincidencia encontrada
            } else if (i < N && patron.charAt(j) != texto.charAt(i)) {
                // No coincidencia
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1; // No se encontró
    }

    // Función auxiliar para KMP: calcula el array de prefijos
    private static int[] calcularLPS(String patron) {
        int M = patron.length();
        int[] lps = new int[M];
        int len = 0;
        int i = 1;

        lps[0] = 0; // El primer prefijo es siempre 0

        // Calculamos el array LPS
        while (i < M) {
            if (patron.charAt(i) == patron.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    

    // Algoritmo de Boyer-Moore
    public static int boyerMoore(String patron, String texto) {
        int M = patron.length();
        int N = texto.length();

        // Preprocesamos la tabla de saltos para el patrón
        int[] badChar = badCharacterTable(patron);

        int s = 0; // Desplazamiento del patrón con respecto al texto
        while (s <= (N - M)) {
            int j = M - 1;

            // Comparar el patrón de derecha a izquierda
            while (j >= 0 && patron.charAt(j) == texto.charAt(s + j)) {
                j--;
            }

            // Si el patrón está completamente alineado
            if (j < 0) {
                return s; // Encontramos coincidencia
            } else {
                // Desplazar el patrón usando la tabla de caracteres malos
                s += Math.max(1, j - badChar[texto.charAt(s + j)]);
            }
        }
        return -1; // No se encontró el patrón
    }

    // Función auxiliar para Boyer-Moore: calcula la tabla de caracteres malos
    private static int[] badCharacterTable(String patron) {
        final int TAM_ALFABETO = 256; // Tamaño del alfabeto (256 caracteres)
        int[] badChar = new int[TAM_ALFABETO];

        // Inicializamos la tabla con -1
        Arrays.fill(badChar, -1);

        // Actualizamos la tabla con las posiciones de los caracteres en el patrón
        for (int i = 0; i < patron.length(); i++) {
            badChar[patron.charAt(i)] = i;
        }
        return badChar;
    }

    // Algoritmo de Rabin-Karp
    public static int rabinKarp(String patron, String texto) {
        int M = patron.length();
        int N = texto.length();
        int q = 101; // Número primo grande para el hash
        int d = 256; // Tamaño del alfabeto (ASCII)

        int p = 0; // Hash del patrón
        int t = 0; // Hash de la ventana del texto
        int h = 1;

        // Calculamos el valor de h (d^(M-1) % q)
        for (int i = 0; i < M - 1; i++) {
            h = (h * d) % q;
        }

        // Calculamos el hash inicial para el patrón y la primera ventana del texto
        for (int i = 0; i < M; i++) {
            p = (d * p + patron.charAt(i)) % q;
            t = (d * t + texto.charAt(i)) % q;
        }

        // Deslizamos el patrón sobre el texto
        for (int i = 0; i <= N - M; i++) {
            // Si los hashes coinciden, verificamos los caracteres uno a uno
            if (p == t) {
                int j;
                for (j = 0; j < M; j++) {
                    if (texto.charAt(i + j) != patron.charAt(j)) {
                        break;
                    }
                }

                if (j == M) {
                    return i; // Coincidencia encontrada
                }
            }

            // Calculamos el hash para la siguiente ventana
            if (i < N - M) {
                t = (d * (t - texto.charAt(i) * h) + texto.charAt(i + M)) % q;
                // Aseguramos que el valor del hash sea positivo
                if (t < 0) {
                    t += q;
                }
            }
        }
        return -1; // No se encontró el patrón
    }

    /*
    
    public static void main(String[] args) {
        String texto = "BACDGABCDA";
        String patron = "ABCD";

        // Ejemplo de uso de los algoritmos
        System.out.println("Fuerza Bruta: " + fuerzaBruta(patron, texto));
        System.out.println("Knuth-Morris-Pratt: " + kmp(patron, texto));
        System.out.println("Boyer-Moore: " + boyerMoore(patron, texto));
        System.out.println("Rabin-Karp: " + rabinKarp(patron, texto));
    }

     */
}
