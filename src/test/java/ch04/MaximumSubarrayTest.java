package test.java.ch04;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import main.java.ch04.MaximumSubarray;


/**
 * Created by nathanjekel on 5/22/18.
 */
public class MaximumSubarrayTest {

    @Test
    public void testFindMaximumSubarray(){
        int[] array = {13, -3, -25, 29, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        HashMap<String, Integer> maxSubarray = MaximumSubarray.findMaximumSubarray(array, 0, 15);
        Assert.assertEquals(7, (int) maxSubarray.get("Low Index"));
        Assert.assertEquals(10, (int) maxSubarray.get("High Index"));
        Assert.assertEquals(43, (int) maxSubarray.get("Sum"));
    }
}
