package test.java.ch06;

import main.java.ch06.BinaryHeap;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanjekel on 5/23/18.
 */
public class BinaryHeapTest {

    @Test
    public void testMaxHeapify(){
        int[] heapArray = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        int[] expectedMaxHeapArray = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
        BinaryHeap.maxHeapify(heapArray, 1, 10);
        Assert.assertArrayEquals(expectedMaxHeapArray, heapArray);
    }

    @Test
    public void testBuildMaxHeap(){
        int[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        int[] expectedMaxHeapArray = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
        BinaryHeap.buildMaxHeap(array);
        Assert.assertArrayEquals(expectedMaxHeapArray, array);
    }
}
