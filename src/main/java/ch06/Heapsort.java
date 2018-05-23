package main.java.ch06;

/**
 * Created by nathanjekel on 5/23/18.
 */
public class Heapsort {

    public static void sort(int[] array){
        int heapSize = array.length;
        BinaryHeap.buildMaxHeap(array);
        for(int i = array.length - 1; i > 0; i--){
            BinaryHeap.exchangeArrayElements(array, 0, i);
            heapSize -= 1;
            BinaryHeap.maxHeapify(array, i, heapSize);
        }

    }
}
