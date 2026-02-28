public class 349_intersection_of_array {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Step 1: nums1 ke elements set me daal do
        for (int num : nums1) {
            set1.add(num);
        }

        // Step 2: nums2 traverse karo
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Step 3: Set ko array me convert karo
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}
}
