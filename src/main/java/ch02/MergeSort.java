package main.java.ch02;

/**
 * Created by nathanjekel on 5/18/18.
 */
public class MergeSort {

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }

    }

    private static void merge(int[] array, int low, int middle, int high) {
        int[] mergedArray = array.clone();

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (mergedArray[i] <= mergedArray[j]) {
                array[k] = mergedArray[i];
                i++;
            } else {
                array[k] = mergedArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = mergedArray[i];
            k++;
            i++;
        }
    }

}


