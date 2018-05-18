package test.java.ch02;

import main.java.ch02.InsertionSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by nathanjekel on 5/18/18.
 */
public class InsertionSortTest {

    @Test
    public void testSortWithWorstCase(){
        int[] unsortedArray = {4, 3, 2, 1, 0};
        int[] expectedArray = {0, 1, 2, 3, 4};
        int[] sortedArray = InsertionSort.sort(unsortedArray);

        assertArrayEquals(expectedArray, sortedArray);

    }
}
