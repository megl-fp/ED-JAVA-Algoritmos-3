import java.util.Stack;
import java.util.TreeMap;

public class Puntos_Colineales {

    public class Punto {
        int x;
        int y;

        public Punto(int a, int b) {
            this.x = a;
            this.y = b;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public void ImpriCol(Punto[] coord) {
        TreeMap<Integer, Stack<Punto>> impri = new TreeMap<>();
        
        for (int i = 0; i < coord.length; i++) {
            // Si la coordenada 'y' no está presente, crear un nuevo Stack y agregar el punto
            if (!impri.containsKey(coord[i].y)) {
                Stack<Punto> nuevoStack = new Stack<>();  // Crear un nuevo Stack
                nuevoStack.add(coord[i]);                 // Agregar el punto al nuevo stack
                impri.put(coord[i].y, nuevoStack);        // Insertar en el TreeMap
            } else {
                // Si la coordenada 'y' está presente, se agrega al Stack correspondiente
                impri.get(coord[i].y).add(coord[i]);
            }
        }

        // Ahora imprimimos todo
        int count = 1;
        for (Stack<Punto> coordenadas : impri.values()) {
            System.out.printf("%d-) Puntos \n", count);
            count++;
            for (Punto puntos : coordenadas) {
                System.out.println("    " + puntos);
            }
        }
    }
}