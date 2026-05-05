public class 1913_Maximum Product Difference Between Two Pairs {
    class Solution {
    public int maxProductDifference(int[] nums) {
         int max1 = 0, max2 = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // update max values
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // update min values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return (max1 * max2) - (min1 * min2); 
    }
}
}
