package main.java.ch07;

import main.java.ch06.BinaryHeap;

import java.util.Random;

/**
 * Created by nathanjekel on 5/26/18.
 *
 */
public class RandomizedQuicksort {

    public static void sort(int[] array, int low, int high){
        if(low < high){
            int mid = randomizedPartition(array, low, high);
            sort(array, low, mid - 1);
            sort(array, mid + 1, high);
        }
    }

    private static int randomizedPartition(int[] array, int low, int high) {
        Random random = new Random();
        int i = random.nextInt(high - low) + low;
        BinaryHeap.exchangeArrayElements(array, i, high);
        return Quicksort.partition(array, low, high);
    }
}
