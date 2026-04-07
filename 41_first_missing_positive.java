public class 41_first_missing_positive {
    class Solution {
    public int firstMissingPositive(int[] nums) {
          int n = nums.length;

        // Step 1: Place numbers at correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n 
                   && nums[nums[i] - 1] != nums[i]) {

                int correctIndex = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Step 2: Find first missing
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all correct
        return n + 1;
    }
}
}
