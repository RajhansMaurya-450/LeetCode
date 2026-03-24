public class 713_subarr_prod_less_than_k {
    class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if (k <= 1) return 0;

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}
}
//sliding windows problem leetcode 713