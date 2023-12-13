
package Clases.SortingAlgorithms;

public class SelectionSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del mínimo elemento en el subarreglo no ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el mínimo encontrado con el primer elemento del subarreglo no ordenado
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
