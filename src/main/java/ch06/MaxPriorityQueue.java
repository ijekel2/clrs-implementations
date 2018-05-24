package main.java.ch06;



/**
 * Created by nathanjekel on 5/23/18.
 */
public class MaxPriorityQueue  {

    private int[] maxHeap;
    private int heapSize;

    public MaxPriorityQueue(){
        maxHeap = new int[0];
        heapSize = 0;
    }

    public MaxPriorityQueue(int[] array){
        BinaryHeap.buildMaxHeap(array);
        maxHeap = array;
        heapSize = array.length;
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
        BinaryHeap.maxHeapify(maxHeap, 0, heapSize);
        return maximum;
    }

    public void increaseKey(int index, int key) throws Exception {
        if(key < maxHeap[index]){
            throw new Exception("new key is smaller than current key");
        }
        maxHeap[index] = key;
        int parentIndex = BinaryHeap.parent(index);
        while(index > 0 && maxHeap[parentIndex] < maxHeap[index]){
            BinaryHeap.exchangeArrayElements(maxHeap, index, parentIndex);
            index = parentIndex;
            parentIndex = BinaryHeap.parent(index);
        }
    }

    public void insert(int key){
        int[] newMaxHeap = new int[heapSize + 1];
        if(heapSize != 0){
            System.arraycopy(maxHeap, 0, newMaxHeap, 0, maxHeap.length);
        }
        newMaxHeap[heapSize] = Integer.MIN_VALUE;
        maxHeap = newMaxHeap;
        heapSize++;

        try{
            increaseKey(heapSize - 1, key);
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
