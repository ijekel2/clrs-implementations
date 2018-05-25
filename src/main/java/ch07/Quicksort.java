package main.java.ch07;

import main.java.ch06.BinaryHeap;

/**
 * Created by nathanjekel on 5/25/18.
 */
public class Quicksort {

    public void sort(int[] array, int low, int high){


    }

    private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j <= high; j++){
            if(array[j] <= pivot){
                i = i+1;
                BinaryHeap.exchangeArrayElements(array, i, j);
            }
        }
        BinaryHeap.exchangeArrayElements(array, i, high);

        return i+1;
    }
}
