public class QuickSort_eu {
    
    public static void quicksort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }

    // intercambiar es el swap
    private static int partition(int[] A, int p, int r) {
        int mitad = (p + r) / 2;
        if (A[mitad] < A[p]) intercambiar(A, mitad, p);
        if (A[r] < A[p]) intercambiar(A, p, r);
        if (A[r] < A[mitad]) intercambiar(A, mitad, r);
        
        int pivot = A[mitad];
        intercambiar(A, mitad, r);
        
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= pivot) {
                i++;
                intercambiar(A, i, j);
            }
        }
        intercambiar(A, i + 1, r);
        return i + 1;
    }

    private static void intercambiar(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
