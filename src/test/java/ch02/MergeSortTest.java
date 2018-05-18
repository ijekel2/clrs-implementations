package test.java.ch02;

import main.java.ch02.MergeSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by nathanjekel on 5/18/18.
 */
public class MergeSortTest {

    @Test
    public void testSortWithWorstCase(){
        int[] array = {4, 3, 2, 1, 0};
        int[] sortedArray = {0, 1, 2, 3, 4};
        MergeSort.sort(array, 0, array.length - 1);
        assertArrayEquals(sortedArray, array);

    }
}
