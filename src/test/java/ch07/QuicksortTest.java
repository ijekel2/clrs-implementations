package test.java.ch07;

import main.java.ch07.Quicksort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by nathanjekel on 5/26/18.
 */
public class QuicksortTest {

    @Test
    public void testSortWithWorstCase(){
        int[] array = {4, 3, 2, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 4};
        Quicksort.sort(array, 0, array.length - 1);
        assertArrayEquals(sortedArray, array);

    }
}
