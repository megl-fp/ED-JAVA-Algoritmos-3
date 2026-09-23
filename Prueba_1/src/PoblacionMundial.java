import java.util.Scanner;

public class PoblacionMundial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la población mundial actual
        System.out.print("Ingrese la población mundial actual: ");
        double poblacionActual = scanner.nextDouble();

        // Solicitar la tasa de crecimiento anual
        System.out.print("Ingrese la tasa de crecimiento anual (por ejemplo, 1.05 para 5%): ");
        double tasaCrecimiento = scanner.nextDouble();

        System.out.println("\nPoblación mundial estimada en los próximos 5 años:");

        // Calcular y mostrar la población estimada para los próximos cinco años
        for (int i = 1; i <= 5; i++) {
            poblacionActual *= tasaCrecimiento;  // Actualiza la población para el año siguiente
            System.out.printf("Año %d: %.2f\n", i, poblacionActual);
        }

        scanner.close();
    }
}
