package main.java.ch07;

import main.java.ch06.BinaryHeap;

/**
 * Created by nathanjekel on 5/25/18.
 */
public class Quicksort {

    public static void sort(int[] array, int low, int high){
        if(low < high){
            int mid = partition(array, low, high);
            sort(array, low, mid - 1);
            sort(array, mid + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j <= high - 1; j++){
            if(array[j] <= pivot){
                i = i+1;
                BinaryHeap.exchangeArrayElements(array, i, j);
            }
        }
        BinaryHeap.exchangeArrayElements(array, i + 1 , high);

        return i+1;
    }
}
