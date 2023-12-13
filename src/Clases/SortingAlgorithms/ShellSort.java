
package Clases.SortingAlgorithms;
import javax.swing.*;

public class ShellSort {
    private void printArray(int[] array, JTextArea textArea) {
        for (int num : array) {
            textArea.append(num + " ");
        }
        textArea.append("\n");
    }

    public void shellSort(int[] array, JTextArea textArea) {
        // se obtiene la longitud del array
        int n = array.length;
        // se obtiene el tamaño de espacio entre elementos
        int gap = n / 2;

        textArea.append("\nStart of the Shell Sort Algorithm:\n");

        // Mientras el espacio entre elementos sea mayor que 0
        while (gap > 0) {
            textArea.append("\nCurrent Gap: " + gap + "\n");

            // Aplicar el algoritmo de inserción para cada "subarray" con el tamaño de gap
            for (int i = gap; i < n; i++) {
                // Guardar el valor actual del elemento en una variable temporal
                int temp = array[i];
                int j = i;

                textArea.append("\nCompare " + temp + " to the elements of the subarray:\n");

                // Realizar la inserción
                while (j >= gap && array[j - gap] > temp) {
                    // Desplazar elementos hacia la derecha hasta encontrar la posición correcta
                    array[j] = array[j - gap];
                    j -= gap;

                    printArray(array, textArea);
                }

                // Colocar el valor temporal en la posición correcta en el subarray
                array[j] = temp;
                textArea.append("Insert " + temp + " on the subarray " + j + " position:\n");
                printArray(array, textArea);
            }

            // Reducir el espacio entre elementos a la mitad en cada iteración
            gap /= 2;
        }

        textArea.append("\nEnd of Shell Sort Algorithm");
    }
}
