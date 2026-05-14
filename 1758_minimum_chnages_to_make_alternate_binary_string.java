public class 1758_minimum_chnages_to_make_alternate_binary_string {
    class Solution {
    public int minOperations(String s) {
         int pattern1 = 0; // starts with 0
        int pattern2 = 0; // starts with 1

        for (int i = 0; i < s.length(); i++) {

            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected1) {
                pattern1++;
            }

            if (s.charAt(i) != expected2) {
                pattern2++;
            }
        }

        return Math.min(pattern1, pattern2);
    }
}
}
