import java.util.*;

public class Ordenacion {

    // Inserción
    public static void insercion(int[] arr) {
        // Recorremos el array comenzando desde el segundo elemento
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Guardamos el valor actual
            int j = i - 1;
            // Desplazamos los elementos hacia la derecha hasta encontrar la posición correcta
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insertamos el valor en su lugar
        }
    }

    // ShellSort
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // Comenzamos con un intervalo grande que se va reduciendo
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                // Ordenamos los elementos separados por 'gap'
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    // QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Particionamos el array
            int pi = partition(arr, low, high);
            // Ordenamos las dos mitades
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Usamos el último elemento como pivote
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote, lo intercambiamos
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Intercambiamos el pivote con el primer elemento mayor
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // MergeSort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Ordenamos las dos mitades
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Combinamos las dos mitades ordenadas
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiamos los datos a los arrays temporales L y R
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        // Combinamos los arrays L y R en el array original
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiamos los elementos restantes de L, si los hay
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiamos los elementos restantes de R, si los hay
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // HeapSort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Construimos el heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extraemos los elementos del heap uno por uno
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Volvemos a hacer el heap sobre el sub-árbol reducido
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializamos el nodo más grande como la raíz
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Si el hijo izquierdo es mayor que la raíz
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Si el hijo derecho es mayor que la raíz
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Si el nodo más grande no es la raíz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente hacemos el heap
            heapify(arr, n, largest);
        }
    }

    // CountingSort
    public static void countingSort(int[] arr, int maxVal) {
        int[] count = new int[maxVal + 1];
        int[] output = new int[arr.length];

        // Contamos las ocurrencias de cada valor
        for (int num : arr) {
            count[num]++;
        }

        // Modificamos el array de conteo para que contenga las posiciones de los elementos
        for (int i = 1; i <= maxVal; i++) {
            count[i] += count[i - 1];
        }

        // Construimos el array de salida
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copiamos el array de salida al original
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // RadixSort
    public static void radixSort(int[] arr, int maxDigits) {
        int exp = 1;
        int n = arr.length;
        int[] output = new int[n];

        // Iteramos sobre cada dígito (unidades, decenas, centenas, etc.)
        for (int i = 0; i < maxDigits; i++) {
            int[] count = new int[10];

            // Contamos las ocurrencias de cada dígito
            for (int num : arr) {
                count[(num / exp) % 10]++;
            }

            // Modificamos el array de conteo
            for (int j = 1; j < 10; j++) {
                count[j] += count[j - 1];
            }

            // Construimos el array de salida
            for (int j = n - 1; j >= 0; j--) {
                output[count[(arr[j] / exp) % 10] - 1] = arr[j];
                count[(arr[j] / exp) % 10]--;
            }

            // Copiamos el array de salida al original
            System.arraycopy(output, 0, arr, 0, n);

            exp *= 10; // Pasamos al siguiente dígito
        }
    }

    // BucketSort
    public static void bucketSort(float[] arr, int n) {
        // Creamos n buckets vacíos
        @SuppressWarnings("unchecked")
        LinkedList<Float>[] buckets = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new LinkedList<>();
        }

        // Distribuimos los elementos en los buckets
        for (float num : arr) {
            int bucketIdx = (int) (n * num);
            buckets[bucketIdx].add(num);
        }

        // Ordenamos cada bucket y unimos los resultados
        int index = 0;
        for (LinkedList<Float> bucket : buckets) {
            bucket.sort(null); // Usamos el sort de la lista
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }
}

/* 

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Ejemplo de uso de los métodos de ordenación
        System.out.println("Original: " + Arrays.toString(arr));

        // Inserción
        insercion(arr);
        System.out.println("Ordenación por Inserción: " + Arrays.toString(arr));

        // ShellSort
        shellSort(arr);
        System.out.println("Ordenación por ShellSort: " + Arrays.toString(arr));

        // QuickSort
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Ordenación por QuickSort: " + Arrays.toString(arr));

        // MergeSort
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Ordenación por MergeSort: " + Arrays.toString(arr));

        // HeapSort
        heapSort(arr);
        System.out.println("Ordenación por HeapSort: " + Arrays.toString(arr));

        // CountingSort (usamos un valor máximo de 100 para el ejemplo)
        countingSort(arr, 100);
        System.out.println("Ordenación por CountingSort: " + Arrays.toString(arr));

        // RadixSort (ejemplo con 3 dígitos)
        radixSort(arr, 3);
        System.out.println("Ordenación por RadixSort: " + Arrays.toString(arr));
    }



*/