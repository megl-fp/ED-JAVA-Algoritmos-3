import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Cuantos puntos desea generar: ");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        
        int min = 0;
        int max = 20;

        Random numRand = new Random();        
        Puntos_Colineales p = new Puntos_Colineales();
        Puntos_Colineales.Punto[] coord;  // Crear un array de tipo Punto
        coord = new Puntos_Colineales.Punto[opcion];  // Inicializar el array con el tamaño de "opcion"
        for (int i = 0 ; i<opcion ; i++){
            int coordX = numRand.nextInt((max - min) + 1) + min; // Coordenadas aleatorias en el rango 0.0 - 100.0
            int coordY = numRand.nextInt((max - min) + 1) + min;
            coord[i] = p.new Punto(coordX, coordY); // Crear un nuevo Punto y agregarlo al array
        
        }
        entrada.close();
        p.ImpriCol(coord);
        

        

    }
}
