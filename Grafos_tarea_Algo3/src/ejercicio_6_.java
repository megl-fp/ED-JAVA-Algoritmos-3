import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.BellmanFordShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedWeightedMultigraph;

public class ejercicio_6_ {

    public static void main(String[] args) {
        // Crear un grafo dirigido ponderado
        Graph<String, DefaultWeightedEdge> graph = new DirectedWeightedMultigraph<>(DefaultWeightedEdge.class);

        // Agregar vértices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // Agregar aristas ponderadas
        graph.setEdgeWeight(graph.addEdge("A", "B"), 2);
        graph.setEdgeWeight(graph.addEdge("B", "C"), 1);
        graph.setEdgeWeight(graph.addEdge("C", "D"), 4);
        graph.setEdgeWeight(graph.addEdge("D", "A"), 3);
        graph.setEdgeWeight(graph.addEdge("A", "C"), 5);

        // Vértice de interés
        String vertexOfInterest = "A";

        // Encontrar el ciclo dirigido más corto que contiene al vértice de interés
        double minCycleLength = Double.POSITIVE_INFINITY;

        // Utilizar Bellman-Ford para encontrar caminos cortos desde el vértice de interés
        BellmanFordShortestPath<String, DefaultWeightedEdge> bellmanFordAlg = new BellmanFordShortestPath<>(graph);

        for (String vertex : graph.vertexSet()) {
            if (!vertex.equals(vertexOfInterest)) {
                // Encontrar camino más corto desde el vértice de interés a otro vértice y luego retornar
                double distanceToVertex = bellmanFordAlg.getPathWeight(vertexOfInterest, vertex);
                double distanceBackToInterest = bellmanFordAlg.getPathWeight(vertex, vertexOfInterest);

                if (distanceToVertex != Double.POSITIVE_INFINITY && distanceBackToInterest != Double.POSITIVE_INFINITY) {
                    // Sumar el ciclo (ida + vuelta)
                    double cycleLength = distanceToVertex + distanceBackToInterest;
                    if (cycleLength < minCycleLength) {
                        minCycleLength = cycleLength;
                    }
                }
            }
        }

        // Imprimir el ciclo más corto
        if (minCycleLength < Double.POSITIVE_INFINITY) {
            System.out.println("El ciclo dirigido más corto que incluye el vértice de interés es de longitud: " + minCycleLength);
        } else {
            System.out.println("No existe un ciclo dirigido que contenga el vértice de interés.");
        }
    }
}
