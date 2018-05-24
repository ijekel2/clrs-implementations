package test.java.ch06;

import main.java.ch06.MaxPriorityQueue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanjekel on 5/23/18.
 */
public class MaxPriorityQueueTest {

    @Test
    public void testInsert(){
        MaxPriorityQueue actualMaxPriorityQueue = new MaxPriorityQueue();
        actualMaxPriorityQueue.insert(5);
        actualMaxPriorityQueue.insert(6);
        actualMaxPriorityQueue.insert(7);
        int[] expectedMaxPriorityQueue = {7, 5, 6};
        Assert.assertArrayEquals(expectedMaxPriorityQueue, actualMaxPriorityQueue.getMaxHeap());
    }

    @Test
    public void testMaximum(){
        int[] testArray = {2, 5, 12, 9, 20};
        MaxPriorityQueue maxPriorityQueue = new MaxPriorityQueue(testArray);
        int max = maxPriorityQueue.maximum();
        Assert.assertEquals(20, max);

    }

    @Test
    public void testExtractMaximum(){
        int[] testArray = {2, 5, 12, 9, 20};
        MaxPriorityQueue maxPriorityQueue = new MaxPriorityQueue(testArray);

        try{
            int max = maxPriorityQueue.extractMaximum();
            Assert.assertEquals(20, max);
        } catch (Exception e){
            e.printStackTrace();
        }

        int[] expectedMaxPriorityQueue = {12, 9, 5, 2, 5};
        int expectedHeapSize = 4;
        Assert.assertArrayEquals(expectedMaxPriorityQueue, maxPriorityQueue.getMaxHeap());
        Assert.assertEquals(expectedHeapSize, maxPriorityQueue.getHeapSize());

    }


}
