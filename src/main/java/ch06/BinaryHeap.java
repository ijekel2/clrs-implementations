package main.java.ch06;

/**
 * Created by nathanjekel on 5/23/18.
 */
public class BinaryHeap {


    public static void maxHeapify(int[] array, int index, int heapSize) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if(left < heapSize && array[left] > array[index]){
            largest = left;
        }

        if(right < heapSize && array[right] > array[largest]){
            largest = right;
        }

        if(largest != index) {
            exchangeArrayElements(array, index, largest );
            maxHeapify(array, largest, heapSize);
        }

    }

    public static void buildMaxHeap(int[] array){
        int heapSize = array.length;
        for(int i = (heapSize - 1)/2; i >= 0; i--){
            maxHeapify(array, i, heapSize);
        }
    }

    public static final int parent(int index){
        return (index - 1)/2;
    }

    public static final int leftChild(int index){
        return 2*index + 1;
    }

    public static final int rightChild(int index){
        return 2*index + 2;
    }

    public static final void exchangeArrayElements(int[] array, int index1, int index2){
        int index1Element = array[index1];
        array[index1] = array[index2];
        array[index2] = index1Element;
    }
}
