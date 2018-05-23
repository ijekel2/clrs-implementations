package main.java.ch06;

import sun.jvm.hotspot.debugger.NotInHeapException;

import java.util.*;

/**
 * Created by nathanjekel on 5/23/18.
 */
public class MaxPriorityQueue  {

    private int[] maxHeap;
    private int heapSize;

    public void MaxPriorityQueue(){
        this.maxHeap = new int[0];
        this.heapSize = 0;
    }

    public void MaxPriorityQueue(int[] array){
        BinaryHeap.buildMaxHeap(array);
        this.maxHeap = array;
        this.heapSize = array.length;
    }

    public int maximum(){
        return maxHeap[0];
    }

    public int extractMaximum() throws Exception {
        if(heapSize < 1){
            throw new Exception("heap underflow");
        }
        int maximum = maxHeap[0];
        maxHeap[0] = maxHeap[heapSize - 1];
        heapSize--;
        return maximum;
    }

    public void increaseKey(int index, int key) throws Exception {
        if(key < maxHeap[index]){
            throw new Exception("new key is smaller than current key");
        }
        maxHeap[index] = key;
        int parentIndex = BinaryHeap.parent(index);
        while(index > 0 && maxHeap[parentIndex] < maxHeap[index]){
            BinaryHeap.exchangeArrayElements(maxHeap, maxHeap[index], maxHeap[parentIndex]);
            index = parentIndex;
            parentIndex = BinaryHeap.parent(index);
        }
    }

    public void insert(int key){
        int[] newMaxHeap = new int[heapSize + 1];
        if(maxHeap.length != 0){
            System.arraycopy(this.maxHeap, 0, newMaxHeap, 0, this.maxHeap.length);
        }
        newMaxHeap[heapSize] = Integer.MIN_VALUE;
        this.maxHeap = newMaxHeap;
        heapSize++;

        try{
            increaseKey(heapSize, key);
        } catch (Exception e){
            e.printStackTrace();;
        }


    }

    public int[] getMaxHeap() {
        return maxHeap;
    }

    public void setMaxHeap(int[] maxHeap) {
        this.maxHeap = maxHeap;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }
}
