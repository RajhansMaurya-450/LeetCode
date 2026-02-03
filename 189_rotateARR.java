public class 189_rotateARR {
    class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0, n-1);
        reverse(nums,0,k-1);
        reverse(nums, k , n-1);
    }
    private void reverse(int[] nums, int leftindex, int rightindex) {
        while (leftindex < rightindex) {
            int temp = nums[leftindex];
            nums[leftindex] = nums[rightindex];
            nums[rightindex] = temp;
            leftindex++;
            rightindex--;
        }
    }
}
}
