import java.util.*;

public class ejercicio_9_ {

    // Método para verificar si el grafo es bipartito
    public static boolean esBipartito(Map<Integer, List<Integer>> grafo, int numVertices) {
        int[] colores = new int[numVertices]; // 0: no coloreado, 1: color 1, -1: color 2
        Arrays.fill(colores, 0); // Inicialmente todos sin color

        // Revisar todos los componentes del grafo
        for (int i = 0; i < numVertices; i++) {
            if (colores[i] == 0) { // Si no ha sido coloreado
                if (!bfsColorear(grafo, i, colores)) {
                    return false; // No es bipartito si encontramos un conflicto de colores
                }
            }
        }

        return true; // Si coloreamos todos sin conflictos, es bipartito
    }

    // BFS para colorear los vértices del grafo
    private static boolean bfsColorear(Map<Integer, List<Integer>> grafo, int vertice, int[] colores) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(vertice);
        colores[vertice] = 1; // Asignar color 1 al vértice inicial

        while (!cola.isEmpty()) {
            int actual = cola.poll();

            // Ver todos los vecinos del vértice actual
            for (int vecino : grafo.getOrDefault(actual, new ArrayList<>())) {
                if (colores[vecino] == 0) { // Si no está coloreado, lo coloreamos
                    colores[vecino] = -colores[actual]; // Asignar el color opuesto
                    cola.add(vecino);
                } else if (colores[vecino] == colores[actual]) {
                    // Si el vecino tiene el mismo color, no es bipartito
                    return false;
                }
            }
        }

        return true;
    }

    // Método para verificar si el grafo bipartito es completo
    public static boolean esBipartitoCompleto(Map<Integer, List<Integer>> grafo, int numVertices) {
        int[] colores = new int[numVertices];
        Arrays.fill(colores, 0);

        if (!esBipartito(grafo, numVertices)) {
            return false; // Si no es bipartito, no puede ser bipartito completo
        }

        List<Integer> conjunto1 = new ArrayList<>();
        List<Integer> conjunto2 = new ArrayList<>();

        // Dividir los vértices en dos conjuntos según su color
        for (int i = 0; i < numVertices; i++) {
            if (colores[i] == 1) {
                conjunto1.add(i);
            } else if (colores[i] == -1) {
                conjunto2.add(i);
            }
        }

        // Verificar si todos los vértices de conjunto1 están conectados a todos en conjunto2
        for (int v1 : conjunto1) {
            for (int v2 : conjunto2) {
                if (!grafo.getOrDefault(v1, new ArrayList<>()).contains(v2) || !grafo.getOrDefault(v2, new ArrayList<>()).contains(v1)) {
                    return false; // Si falta una conexión, no es bipartito completo
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer número de vértices y aristas
        int numVertices = sc.nextInt();
        int numAristas = sc.nextInt();

        // Crear el grafo como lista de adyacencia
        Map<Integer, List<Integer>> grafo = new HashMap<>();
        for (int i = 0; i < numAristas; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            grafo.putIfAbsent(u, new ArrayList<>());
            grafo.putIfAbsent(v, new ArrayList<>());
            grafo.get(u).add(v);
            grafo.get(v).add(u); // Grafo no dirigido
        }

        // Verificar si el grafo es bipartito
        if (esBipartito(grafo, numVertices)) {
            System.out.println("El grafo es bipartito.");

            // Verificar si es bipartito completo
            if (esBipartitoCompleto(grafo, numVertices)) {
                System.out.println("El grafo bipartito es completo.");
            } else {
                System.out.println("El grafo bipartito no es completo.");
            }
        } else {
            System.out.println("El grafo no es bipartito.");
        }

        sc.close();
    }
}

/* 
Caso de Prueba 1: El grafo es bipartito. El grafo bipartito es completo.
6 7
0 1
0 2
0 3
4 1
4 2
4 3
4 5

Caso de Prueba 2: Grafo no bipartito
3 3 0
0 1
1 2
2 0

*/