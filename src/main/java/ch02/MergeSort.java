package main.java.ch02;

/**
 * Created by nathanjekel on 5/18/18.
 */
public class MergeSort {

    public static void sort(int[] array, int p, int r) {
        if (p < r) {
            int q = p + (r - p) / 2;
            sort(array, p, q);
            sort(array, q + 1, r);
            merge(array, p, q, r);
        }

    }

    private static void merge(int[] array, int p, int q, int r) {
        int[] mergedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            mergedArray[i] = array[i];
        }

        int i = p;
        int j = q + 1;
        int k = p;

        while (i <= q && j <= r) {
            if (mergedArray[i] <= mergedArray[j]) {
                array[k] = mergedArray[i];
                i++;
            } else {
                array[k] = mergedArray[j];
                j++;
            }
            k++;
        }
        while (i <= q) {
            array[k] = mergedArray[i];
            k++;
            i++;
        }
    }

}


