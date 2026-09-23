import java.util.*;

public class ejercicio_8_ {

    static class CicloException extends Exception {
        public CicloException(String message) {
            super(message);
        }
    }

    // Grafo dirigido representado como lista de adyacencia
    private static Map<Integer, List<Integer>> grafo = new HashMap<>();
    private static boolean[] visitado;
    private static boolean[] enRecursion;
    private static List<Integer> islasAlcanzables = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el número de islas, puentes y la isla inicial
        int numIslas = sc.nextInt();
        int numPuentes = sc.nextInt();
        int islaInicial = sc.nextInt();

        // Inicializar el grafo y los arrays de visitado y enRecursion
        visitado = new boolean[numIslas];
        enRecursion = new boolean[numIslas];

        // Leer las conexiones entre las islas (puentes)
        for (int i = 0; i < numPuentes; i++) {
            int islaOrigen = sc.nextInt();
            int islaDestino = sc.nextInt();

            // Agregar la arista en el grafo dirigido
            grafo.putIfAbsent(islaOrigen, new ArrayList<>());
            grafo.get(islaOrigen).add(islaDestino);
        }

        // Intentar recorrer las islas desde la isla inicial
        try {
            dfs(islaInicial);
            // Imprimir las islas alcanzables
            for (int isla : islasAlcanzables) {
                System.out.print(isla + " ");
            }
        } catch (CicloException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    // DFS que detecta ciclos y lista las islas alcanzables
    private static void dfs(int isla) throws CicloException {
        visitado[isla] = true;
        enRecursion[isla] = true; // Marcar la isla como parte de la pila de recursión
        islasAlcanzables.add(isla);

        // Explorar las islas vecinas
        if (grafo.containsKey(isla)) {
            for (int vecina : grafo.get(isla)) {
                if (!visitado[vecina]) {
                    dfs(vecina);
                } else if (enRecursion[vecina]) {
                    // Si encontramos un ciclo, lanzamos una excepción
                    throw new CicloException("Ciclo detectado en la isla " + vecina);
                }
            }
        }

        enRecursion[isla] = false; // Quitar de la pila de recursión
    }
}
/*
caso de prueba 1:
5 4 1
1 3
1 0
1 4
0 2

caso de prubea 2:
6 5 0
0 1
0 2
3 4
4 5
0 1 2 3 4 5


 */