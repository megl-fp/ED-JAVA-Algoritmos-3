import java.io.*;
import java.util.*;

public class ejercicio_7_ {

    private static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public static void main(String[] args) {
        // Leer el archivo de entrada
        // el otro archiv de ejemplo se llama prueba02_eje_7_
        String inputFile = "prueba01_eje_7_"; 
        List<String> lines = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    
        // Procesar la entrada
        // Aquí separamos la línea que contiene las dimensiones de la matriz (ejemplo "4 4")
        String[] dimensions = lines.get(0).split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
    
        char[][] grid = new char[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            grid[i] = lines.get(i + 1).toCharArray();  // Cambié (i + 2) a (i + 1) ya que la segunda línea contiene la matriz
        }
    
        // Matriz de visitados
        boolean[][] visited = new boolean[rows][cols];
        List<Integer> areas = new ArrayList<>();
        
        // Realizar la búsqueda para contar las áreas libres
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '.' && !visited[i][j]) {
                    // Encontrar el tamaño del área libre usando DFS
                    int areaSize = dfs(grid, visited, i, j);
                    areas.add(areaSize);
                }
            }
        }
    
        // Imprimir resultados
        System.out.println(areas.size());
        for (int area : areas) {
            System.out.print(area + " ");
        }
        System.out.println();
    }
    

    // Función DFS para encontrar el tamaño del área libre
    private static int dfs(char[][] grid, boolean[][] visited, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Marcar la celda como visitada
        visited[i][j] = true;
        int size = 1; // Contar esta celda como parte del área libre
        
        // Explorar las celdas adyacentes
        for (int[] direction : directions) {
            int ni = i + direction[0];
            int nj = j + direction[1];
            
            if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && grid[ni][nj] == '.' && !visited[ni][nj]) {
                size += dfs(grid, visited, ni, nj);
            }
        }
        
        return size;
    }
}
/* 
Evaluacion del costo temporal del algoritmo
Complejidad temporal: El algoritmo recorre cada celda de la matriz al menos 
una vez, por lo que la complejidad es O(R × C), donde R es el número de filas 
y C es el número de columnas.
Cantidad de aristas y vértices: Cada celda libre puede considerarse un vértice, 
y cada conexión con una celda adyacente es una arista. Esto se maneja 
implícitamente en la búsqueda DFS.
*/ 