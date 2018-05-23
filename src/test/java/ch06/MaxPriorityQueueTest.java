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
        Assert.assertEquals(expectedMaxPriorityQueue, actualMaxPriorityQueue);
    }
}
