package main.java.ch04;

import java.util.HashMap;

/**
 * Created by nathanjekel on 5/21/18.
 */
public class MaximumSubarray {

    public static HashMap<String, Integer> findMaximumSubarray(int[] array, int low, int high) {

        if(high == low){
            HashMap<String, Integer> maxSubarray = new HashMap<>();
            maxSubarray.put("Low Index", low);
            maxSubarray.put("High Index", high);
            maxSubarray.put("Sum", array[low]);
            return maxSubarray;
        }
        else {
            int mid = (low + high)/2;
            HashMap<String, Integer> leftMaxSubarray = findMaximumSubarray(array, low, mid);
            HashMap<String, Integer> rightMaxSubarray = findMaximumSubarray(array, mid + 1, high);
            HashMap<String, Integer> maxCrossingSubarray = findMaximumCrossingSubarray(array, low, mid, high);

            if(leftMaxSubarray.get("Sum") >= rightMaxSubarray.get("Sum") && leftMaxSubarray.get("Sum") >= maxCrossingSubarray.get("Sum")){
                return leftMaxSubarray;
            }
            else if(rightMaxSubarray.get("Sum") >= leftMaxSubarray.get("Sum") && rightMaxSubarray.get("Sum") >= maxCrossingSubarray.get("Sum")){
                return rightMaxSubarray;
            }
            else {
                return maxCrossingSubarray;
            }
        }





    }

    private static HashMap<String, Integer> findMaximumCrossingSubarray(int[] array, int low, int mid, int high){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = 0;
        for(int i = mid; i >= 0; i--){
            sum += array[i];
            if(sum > leftSum){
                leftSum = sum;
                maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight= 0;
        for(int j = mid + 1; j <= high; j++){
            sum += array[j];
            if(sum > rightSum){
                rightSum = sum;
                maxRight = j;
            }
        }

        HashMap<String, Integer> maxCrossingSubarray = new HashMap<>();
        maxCrossingSubarray.put("Low Index", maxLeft);
        maxCrossingSubarray.put("High Index", maxRight);
        maxCrossingSubarray.put("Sum", leftSum + rightSum);

        return(maxCrossingSubarray);


    }

}
