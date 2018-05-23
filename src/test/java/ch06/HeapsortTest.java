package test.java.ch06;

import main.java.ch06.Heapsort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanjekel on 5/23/18.
 */
public class HeapsortTest {

    @Test
    public void testSort(){

        int[] arrayToSort = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        int[] expectedSortedArray = {1, 2, 3, 4, 7, 8, 9, 10, 14, 16};
        Heapsort.sort(arrayToSort);
        Assert.assertArrayEquals(expectedSortedArray, arrayToSort);
    }
}
